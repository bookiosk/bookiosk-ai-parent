package org.bookiosk.ai.user;

import com.google.common.base.Objects;
import org.apache.logging.log4j.util.Strings;
import org.bookiosk.ai.domain.user.entity.User;
import org.bookiosk.ai.error.AiErrorEnumUser;
import org.bookiosk.ai.exception.AiException;
import org.bookiosk.ai.util.Assert;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author bookiosk
 */
public class UserAppHelper {


    public static void userRegisterCheck(User user) {
        if (user == null) {
            throw new AiException(AiErrorEnumUser.REGISTER_MSG_EMPTY);
        }
        if (Strings.isEmpty(user.getUserAccount())) {

        }
        if (Strings.isEmpty(user.getUserPassword()) &&
                !Objects.equal(user.getUserPassword(), user.getCheckPassword())) {

        }
    }
}
