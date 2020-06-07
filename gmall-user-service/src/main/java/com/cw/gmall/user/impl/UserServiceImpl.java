package com.cw.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cw.gmall.user.mapper.UserMapper;

/**
 * @author cwfly
 * @date 2020/5/24
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
}
