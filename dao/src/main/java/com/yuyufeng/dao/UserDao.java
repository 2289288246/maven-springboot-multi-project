package com.yuyufeng.dao;

import com.yuyufeng.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDao")
public class UserDao {
    public List<User> query() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setId(1L);
        user.setName("lnj");
        user.setPassword("123456");
        list.add(user);
        System.out.println("this is dao");
        return list;
    }
}
