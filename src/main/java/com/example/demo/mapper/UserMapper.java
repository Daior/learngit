package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

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
     * 保存用户信息
     * @param user
     */
    void save(User user);


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

}
