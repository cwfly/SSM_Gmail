package com.cw.gmall.user.service.impl;

import com.cw.gmall.user.mapper.UserMapper;
import com.cw.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cwfly
 * @date 2020/5/24
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
