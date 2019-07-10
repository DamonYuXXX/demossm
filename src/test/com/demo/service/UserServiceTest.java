package com.demo.service;

import com.alibaba.fastjson.JSON;
import com.demo.dao.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testCreateUser() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("root");
        userEntity.setPassword("root");
        userService.createUser(userEntity);
        System.out.println(JSON.toJSONString(userEntity));
    }

    @Test
    public void testUpdateUser() throws Exception {
        UserEntity userEntity = userService.getUserById(2);
        userEntity.setPassword("root111");
        userService.updateUser(userEntity);
        userEntity = userService.getUserById(2);
        System.out.println(JSON.toJSONString(userEntity));
    }

    @Test
    public void testDeleteUser() throws Exception {
        userService.deleteUser(1);
    }

    @Test
    public void testGetUserById() throws Exception {
        UserEntity userEntity = userService.getUserById(1);
        System.out.println(JSON.toJSONString(userEntity));
    }
}