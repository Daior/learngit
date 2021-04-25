package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User queryById(Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 根据id删除一个用户
     * @param userId
     */
    void delete(Integer userId);

    /**
     * 增加用户
     * @param
     * @return
     */
    void save(User user);
}
