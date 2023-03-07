package com.jmcoding.usercenter.service;

import com.jmcoding.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //增
        valueOperations.set("yupiString","dog");
        valueOperations.set("yupiInt",1);
        valueOperations.set("yupiDouble",2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("yupi");
        valueOperations.set("yupiUser",user);
        //查
        Object yupi = valueOperations.get("yupiString");
        Assertions.assertEquals("dog", (String) yupi);
        yupi = valueOperations.get("yupiInt");
        Assertions.assertEquals(1, (int) ((Integer) yupi));
        yupi = valueOperations.get("yupiDouble");
        Assertions.assertEquals(2.0, ((Double) yupi));
        System.out.println(valueOperations.get("yupiUser"));
//        valueOperations.set("yupiString","dog");
//        redisTemplate.delete("yupiString");
    }
}