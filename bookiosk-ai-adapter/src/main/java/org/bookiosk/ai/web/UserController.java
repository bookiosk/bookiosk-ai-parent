package org.bookiosk.ai.web;

import com.alibaba.fastjson.JSON;
import org.bookiosk.ai.common.BaseRes;
import org.bookiosk.ai.domain.convert.UserConvert;
import org.bookiosk.ai.domain.user.entity.User;
import org.bookiosk.ai.domain.user.entity.param.UserRequest;
import org.bookiosk.ai.user.UserAppImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bookiosk
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserAppImpl userAppImpl;

    @PostMapping("/register")
    public BaseRes<Boolean> userRegister(@RequestBody UserRequest userRequest) {
        logger.info("userRegister req : {}", JSON.toJSONString(userRequest));
        User user = UserConvert.request2User(userRequest);
        return BaseRes.newInstance(userAppImpl.userRegister(user));
    }
}
