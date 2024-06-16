package org.bookiosk.ai.user;

import org.bookiosk.ai.domain.user.entity.User;
import org.bookiosk.ai.domain.user.gateway.UserGateway;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bookiosk
 */
@Service
public class UserAppImpl {

    @Resource
    private UserGateway userGateway;

    public Boolean userRegister(User user) {

    }
}
