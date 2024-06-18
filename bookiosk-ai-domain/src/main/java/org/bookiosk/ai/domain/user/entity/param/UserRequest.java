package org.bookiosk.ai.domain.user.entity.param;

import lombok.Data;

/**
 * @author bookiosk
 */
@Data
public class UserRequest {

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;
}
