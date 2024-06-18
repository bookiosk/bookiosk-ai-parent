package org.bookiosk.ai.domain.user.entity.vo;

import lombok.Data;

/**
 * @author bookiosk
 */
@Data
public class UserVO {
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
