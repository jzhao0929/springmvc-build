package com.aostar.service.impl;

import com.aostar.dao.UserMapper;
import com.aostar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @描述：
 * @创建人： 2020-6-1 14:24 企业平台事业部/jzhao1
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }
}
