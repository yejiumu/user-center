package com.jmcoding.usercenter.service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import com.jmcoding.usercenter.exception.BusinessException;
import com.jmcoding.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

import static com.jmcoding.usercenter.common.ErrorCode.SYSTEM_ERROR;
import static com.jmcoding.usercenter.service.impl.UserServiceImpl.SALT;

@SpringBootTest
class UserServiceTest {
    //
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void testAddUser() {
//        User user = new User();
//        user.setUsername("xiaoke");
//        user.setUserAccount("xiaoke");
//        user.setAvatarUrl("https://i1.hdslb.com/bfs/archive/5ef3a97732eb4d7c5f8d1bac333287ab15c7d5d7.jpg@672w_378h_1c.webp");
//        user.setGender((byte) 0);
//        user.setUserPassword("123123123");
//        user.setEmail("123");
//        user.setPhone("456");
//
//        boolean result = userService.save(user);
//        System.out.println(user.getId());
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    void userRegister() {
//        String userAccount = "yupi";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String planetCode = "1";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yu";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yupi";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yu pi";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "dogyupi";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "yupi";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//    }
//
//    @Test
//    void demo() {
//        throw new BusinessException(SYSTEM_ERROR, "skldfjsl");
//    }
//
//    @Test
//    void testSearchUsersByTags() {
//        List<String> tagNameList = Arrays.asList("java", "python");
//        List<User> userList = userService.searchUsersByTags(tagNameList);
//        Assertions.assertNotNull(userList);
//    }
    @Test
    void demo() {
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + "123123123").getBytes(StandardCharsets.UTF_8));
        System.out.println(encryptPassword);
    }
}