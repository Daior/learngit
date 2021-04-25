package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //开启事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }



    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer userId) {
        userMapper.delete(userId);

    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
