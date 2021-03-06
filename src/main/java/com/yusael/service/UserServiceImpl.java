package com.yusael.service;

import com.yusael.dao.UserDAO;
import com.yusael.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User login(User user) {
        return userDAO.login(user);
    }


    //查询用户列表
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> showUsers() {
        userDAO.showUsers();
        return userDAO.showUsers();
    }
}
