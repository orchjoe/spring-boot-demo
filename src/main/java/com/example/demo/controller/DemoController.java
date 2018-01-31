package com.example.demo.controller;

import com.example.demo.common.Page;
import com.example.demo.model.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("index")
    public Page<User> index(HttpSession session,Page<User> page){
        System.out.println(session.getId());
        return demoService.getUser(page);
    }

    @RequestMapping("update")
    public int update(HttpSession session,Page<User> page){
        return demoService.updateUser();
    }

    @RequestMapping("redis")
    public String redis(){
        return demoService.testRedis();
    }
}
