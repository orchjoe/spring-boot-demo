package com.example.demo.dao.db;

import com.example.demo.common.Page;
import com.example.demo.model.db.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user where type = 1 order by create_at desc")
    @ResultMap("BaseResultMap")
    List<User> selectByPage(@Param("page") Page<?> page);
}