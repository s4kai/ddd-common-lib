package com.sakai.domain.objects;

import com.sakai.exception.BusinessException;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Money extends BaseValueObject {

    private final BigDecimal amount;
    private final Currency currency;

    private static final RoundingMode ROUNDING = RoundingMode.HALF_UP;

    public Money(BigDecimal amount, Currency currency) {
        if (amount == null)
            throw new BusinessException("Amount cannot be null");

        if (amount.compareTo(BigDecimal.ZERO) < 0)
            throw new BusinessException("Amount cannot be negative");

        if (currency == null)
            throw new BusinessException("Currency cannot be null");

        this.amount = amount.setScale(2, ROUNDING);
        this.currency = currency;
    }

    public static Money of(BigDecimal amount, String currencyCode) {
        if (currencyCode == null || currencyCode.isBlank()) {
            currencyCode = "BRL";
        }

        return new Money(
                amount,
                Currency.getInstance(currencyCode)
        );
    }

    public static Money of(String amount, String currencyCode) {
        try {
            return of(new BigDecimal(amount.trim()), currencyCode);
        } catch (NumberFormatException ex) {
            throw new BusinessException("Invalid amount value");
        }
    }
    
    public static Money of(BigDecimal amount) {
        return of(amount, "BRL");
    }

    public String format() {
        return String.format(
                "%s %s",
                currency.getCurrencyCode(),
                amount.setScale(2, ROUNDING)
        );
    }
}
