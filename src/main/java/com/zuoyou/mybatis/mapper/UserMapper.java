package com.zuoyou.mybatis.mapper;

import com.zuoyou.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
}





