package org.bookiosk.ai.domain.convert;

import org.bookiosk.ai.domain.user.entity.User;
import org.bookiosk.ai.domain.user.entity.param.UserRequest;

/**
 * @author bookiosk
 */
public class UserConvert {
    public static User request2User(UserRequest userRequest) {
        User user = new User();

        return user;
    }
}
