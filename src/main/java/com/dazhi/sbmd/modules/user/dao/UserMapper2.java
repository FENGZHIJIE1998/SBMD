package com.dazhi.sbmd.modules.user.dao;

import com.dazhi.sbmd.modules.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 基于注解
 */
@Mapper
public interface UserMapper2 {

    /**
     * 基于注解列出所有User
     *
     * @return
     */
    @Select("select * from user")
    List<User> list();
}
