package org.bookiosk.ai.user;

import org.bookiosk.ai.domain.user.entity.User;
import org.bookiosk.ai.util.Assert;
import org.springframework.stereotype.Component;

/**
 * @author bookiosk
 */
@Component
public class UserAppHelper {


    public void userRegisterCheck(User user) {
        Assert.notNull(user);
    }
}
