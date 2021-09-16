package com.yusael.service;

import com.yusael.entity.User;

import java.util.List;

public interface UserService {
    User login(User user);

    List<User> showUsers();
}
