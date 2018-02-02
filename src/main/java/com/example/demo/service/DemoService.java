package com.example.demo.service;

import com.example.demo.common.Page;
import com.example.demo.dao.db.UserMapper;
import com.example.demo.dao.solr.CompanyRepository;
import com.example.demo.model.db.User;
import com.example.demo.model.solr.SolrCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class DemoService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CompanyRepository companyRepository;

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

    public List<SolrCompany> getCompanyByName(String companyName){
        return companyRepository.findByCompanyName(companyName);
    }

    public void saveSolrCompany(){
        SolrCompany company = new SolrCompany();
        company.setId("1000000");
        company.setAuthenticateStatus_s("1");
        company.setCompanyName("liubo");
        company.setCount_s("1000");
        company.setLogo_s("2341243");
        company.setWorkstageId_is(Arrays.asList(new Integer[]{1,2}));
        companyRepository.save(company);
    }
}
