package com.yygq.watch.service;


import com.yygq.watch.bean.User;
import com.yygq.watch.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    public User findByName(String name){
        return userMapper.getDeptById(name);
    }

    public int insertDept(User user){
        return userMapper.insertDept(user);
    }

    public int updateDept(User user){
        return userMapper.updateDept(user);
    }
}