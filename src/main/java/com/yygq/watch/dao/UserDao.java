package com.yygq.watch.dao;

import com.yygq.watch.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<Integer, User> users = null;

    @Autowired
    private UserDao userDao;

    private static Integer initId = 1006;

    public void save(User user){
        if(user.getId() == null){
            user.setId(initId++);
        }
        user.setUserName(user.getUserName());
        users.put(user.getId(), user);
    }

    //查询所有员工
    public Collection<User> getAll(Object object){ return users.values(); }

    public User get(Integer id){
        return users.get(id);
    }
}
