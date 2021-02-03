package com.chen.dao;

import com.chen.domain.User;

/**
 * @Date: 5:06 下午 2021/2/3
 * @Desc:
 */
public interface UserMapper {
    public User findUserById(int id) throws Exception;

    public void insertUser(User user) throws Exception;

}
