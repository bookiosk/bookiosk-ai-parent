package org.bookiosk.ai.error;

import lombok.Getter;

/**
 * @author bookiosk
 */
@Getter
public enum ErrorCodeEnum implements ErrorInterface{

    /**
     * systemError
     */
    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常"),

    /**
     * bizError
     */
    ;

    private final String errCode;

    private final String errMsg;

    ErrorCodeEnum(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

}
