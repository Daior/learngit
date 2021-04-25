package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Map;

@EnableSwagger2
@Api("用户信息")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("用户信息列表")
    @GetMapping("query")
    public List<User> queryUserList() {
        return userService.queryUserList();
    }


    @ApiOperation("根据参数id获取用户信息")
    @GetMapping("getUser")
    public User getUserById(@RequestParam(value = "id", defaultValue = "1") Integer id) {
        return userService.queryById(id);
    }

    @PostMapping
    public String save(@RequestBody User user) {
        System.out.println("接收的参数:" + user);
        userService.save(user);
        return "ok";
    }

    @PostMapping("update")
    public String update(@RequestBody User user) {
        System.out.println("接收的参数:" + user);
        userService.update(user);
        return "ok";
    }


}
