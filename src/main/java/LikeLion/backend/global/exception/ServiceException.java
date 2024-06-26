package LikeLion.backend.global.exception;

import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException{
    private final ErrorCode errorCode;
    public ServiceException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
