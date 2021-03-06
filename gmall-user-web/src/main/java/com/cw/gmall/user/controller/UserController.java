package com.cw.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cw.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cwfly
 * @date 2020/5/24
 */
@Controller
public class UserController {
    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("index")
    public String index(){
        return "hello user";
    }
}
