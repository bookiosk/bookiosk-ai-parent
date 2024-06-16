package org.bookiosk.ai.error;

/**
 * @author bookiosk
 */
public class AiException extends RuntimeException{

    private ErrorCodeEnum errorCodeEnum;

    private String errCode;

    private String errMsg;

    public AiException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getErrMsg());
        this.errorCodeEnum = errorCodeEnum;
        this.errCode = errorCodeEnum.getErrCode();
        this.errMsg = errorCodeEnum.getErrMsg();
    }
}
