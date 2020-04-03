package com.dazhi.sbmd.modules.user.dao;

import com.dazhi.sbmd.modules.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper基于XML配置
 */
@Mapper
public interface UserMapper {

    /**
     * 基于XML配置插入User
     * @param user
     */
    void insert(User user);


}
