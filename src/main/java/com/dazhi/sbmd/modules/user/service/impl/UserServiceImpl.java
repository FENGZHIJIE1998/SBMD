package com.dazhi.sbmd.modules.user.service.impl;

import com.dazhi.sbmd.modules.user.dao.UserMapper;
import com.dazhi.sbmd.modules.user.dao.UserMapper2;
import com.dazhi.sbmd.modules.user.entity.User;
import com.dazhi.sbmd.modules.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 基于XML配置的Mapper
     */
    private final UserMapper userMapper;
    /**
     * 基于注解的Mapper
     */
    private final UserMapper2 userMapper2;

    public UserServiceImpl(UserMapper userMapper, UserMapper2 userMapper2) {
        this.userMapper = userMapper;
        this.userMapper2 = userMapper2;
    }

    /**
     * 基于XML配置插入User
     * @param user
     */
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    /**
     * 基于注解配置列出所有User
     * @return
     */
    @Override
    public List<User> list() {
        return userMapper2.list();
    }

}
