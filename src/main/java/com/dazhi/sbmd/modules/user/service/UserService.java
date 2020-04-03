package com.dazhi.sbmd.modules.user.service;

import com.dazhi.sbmd.modules.user.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    void add(User user);
}
