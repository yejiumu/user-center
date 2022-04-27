package com.xiaoke.usercenter.service;

import java.util.Date;

import com.xiaoke.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("dogyupi");
        user.setUserAccount("123");
        user.setAvatarUrl("https://i1.hdslb.com/bfs/archive/5ef3a97732eb4d7c5f8d1bac333287ab15c7d5d7.jpg@672w_378h_1c.webp");
        user.setGender((byte) 0);
        user.setUserPassword("xxx");
        user.setEmail("123");
        user.setPhone("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        userService.userRegister()
    }
}