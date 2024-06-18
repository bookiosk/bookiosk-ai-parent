package org.bookiosk.ai.error;

import lombok.Getter;

/**
 * @author bookiosk
 */
@Getter
public enum AiErrorEnumUser implements ErrorInterface{

    REGISTER_MSG_EMPTY("AI001","注册信息为空"),
    REGISTER_USER_ACCOUNT_EMPTY("AI002","注册信息为空"),
    ;


    private final String errCode;

    private final String errMsg;

    AiErrorEnumUser (String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
}
