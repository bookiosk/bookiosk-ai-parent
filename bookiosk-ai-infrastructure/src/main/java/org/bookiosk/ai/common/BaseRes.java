package org.bookiosk.ai.common;

import lombok.Getter;
import lombok.Setter;
import org.bookiosk.ai.error.ErrorCodeEnum;
import org.bookiosk.ai.error.ErrorStatusEnum;

/**
 * @author bookiosk
 */
@Getter
@Setter
public class BaseRes<T> {

    private String status;

    private String errorCode;

    private String errorMsg;

    private boolean success = true;

    private T data;


    public static <T> BaseRes<T> newInstance(T data) {
        BaseRes<T> baseRes = new BaseRes<>();
        baseRes.setSuccess(true);
        baseRes.setData(data);
        baseRes.setStatus(ErrorStatusEnum.SUCCESS_REQUEST.getCode());
        return baseRes;
    }

    public static BaseRes<?> newInstance(ErrorCodeEnum errorCodeEnum) {
        BaseRes<?> baseRes = new BaseRes<>();
        baseRes.setSuccess(false);
        baseRes.setErrorCode(errorCodeEnum.getErrCode());
        baseRes.setErrorMsg(errorCodeEnum.getErrMsg());
        baseRes.setStatus(ErrorStatusEnum.SERVER_ERROR.getCode());
        return baseRes;
    }
}
