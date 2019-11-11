package com.elifen.spring_demo.service;

import com.elifen.spring_demo.mapper.UserMapper;
import com.elifen.spring_demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.findAll();
    }

    public User getOneUser(Integer id){
        return userMapper.findOneUser(id);
    }

    public int addUser(User user){
        return userMapper.insertOneUser(user);
    }

    public int changeUser(User user){
        return userMapper.updateOneUser(user);
    }

    public int deleteUser(Integer id){
        return userMapper.deleteOneUser(id);
    }
}
