package org.bookiosk.ai.web;

import org.bookiosk.ai.user.UserAppImpl;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bookiosk
 */
@RestController
public class UserController {

    @Resource
    private UserAppImpl userAppImpl;
}
