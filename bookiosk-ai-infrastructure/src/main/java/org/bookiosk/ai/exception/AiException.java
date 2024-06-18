package org.bookiosk.ai.exception;

import lombok.Getter;
import lombok.Setter;
import org.bookiosk.ai.error.ErrorInterface;

/**
 * @author bookiosk
 */
@Getter
@Setter
public class AiException extends RuntimeException{

    private ErrorInterface errorInterface;

    private String errCode;

    private String errMsg;

    public AiException(ErrorInterface errorInterface) {
        this.errorInterface = errorInterface;
        this.errCode = errorInterface.getErrCode();
        this.errMsg = errorInterface.getErrMsg();
    }
}
