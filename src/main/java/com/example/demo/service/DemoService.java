package com.example.demo.service;

import com.example.demo.common.Page;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class DemoService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private UserMapper userMapper;

    public Page<User> getUser(Page<User> page){
        List<User> users = userMapper.selectByPage(page);
        page.setResult(users);
        return page;
    }

    public String testRedis(){
        stringRedisTemplate.opsForValue().set("springboot","springboot",1l, TimeUnit.DAYS);
        String springboot = stringRedisTemplate.opsForValue().get("springboot");
        return springboot;
    }

    @Transactional
    public int updateUser(){
        User user = userMapper.selectByPrimaryKey(13);
        user.setNickname("aaaaaaaaaaaaa");
        return userMapper.updateByPrimaryKeySelective(user);

    }


}
