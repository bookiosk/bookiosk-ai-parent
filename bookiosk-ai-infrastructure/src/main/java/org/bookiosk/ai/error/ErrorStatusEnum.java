package org.bookiosk.ai.error;

import lombok.Getter;

/**
 * @author bookiosk
 */
@Getter
public enum ErrorStatusEnum {
    SUCCESS_REQUEST("200", "SUCCESS_REQUEST"),
    SERVER_ERROR("500", "SERVER_ERROR");

    private final String code;
    private final String desc;

    ErrorStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
