package com.skyspica.Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaolei on 17/7/26.
 */
@RestController
@RequestMapping(path = "hello")
public class Hello {
    @RequestMapping(path ="getUser")
    public User getUser(){
        User user = new User();
        user.setName("shenxiaohui");
        user.setAge(24);
        user.setAddress("上海");
        return user;
    }
}
