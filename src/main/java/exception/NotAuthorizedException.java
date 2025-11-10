package exception;

public class NotAuthorizedException extends DomainException {
    public NotAuthorizedException() {
        super(ErrorCode.ACCESS_DENIED);
    }
}