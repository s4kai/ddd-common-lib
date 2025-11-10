package exception;

import lombok.Getter;

import java.util.Map;

@Getter
public class ValidationException extends DomainException {
    private final Map<String, String> fieldErrors;

    public ValidationException(Map<String, String> fieldErrors) {
        super(ErrorCode.VALIDATION_ERROR);
        this.fieldErrors = fieldErrors;
    }
}