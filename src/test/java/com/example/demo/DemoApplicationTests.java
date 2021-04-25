package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testQuery() {
        List<User> users = userService.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryOne() {
        User user = userService.queryById(1);
        System.out.println(user);
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setName("sdas");
        user.setPhonenumber(122133213);
        userService.save(user);
        System.out.println("保存成功"+user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(16);
        user.setName("ewqyy");
        user.setPhonenumber(2132132187);
        userService.update(user);
        System.out.println("修改成功"+user);
    }

    @Test
    public void testDelete(){
        userService.delete(21);
        System.out.println("删除成功");
    }
}
