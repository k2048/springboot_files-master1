package com.yusael.dao;

import com.yusael.entity.User;

import java.util.List;

public interface UserDAO {
    // 登录
    User login(User user);
    // 查询
    List<User> showUsers();
}
