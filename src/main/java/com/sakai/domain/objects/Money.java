package com.sakai.domain.objects;

import com.sakai.exception.BusinessException;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

@Getter
public class Money extends BaseValueObject {
    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0)
            throw new BusinessException("Amount cannot be negative");

        this.amount = amount;
        this.currency = currency;
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
        this.currency = Currency.getInstance("BRL");
    }

    public String format(){
        String formatted = amount.setScale(2, RoundingMode.HALF_UP).toString();
        return String.format("%s %s", currency.getCurrencyCode(), formatted) ;
    }
}
