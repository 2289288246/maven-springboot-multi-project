package com.yuyufeng.service;

import com.yuyufeng.dao.UserDao;
import com.yuyufeng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> query() {
        System.out.println("this is service");
        return userDao.query();
    }
}
