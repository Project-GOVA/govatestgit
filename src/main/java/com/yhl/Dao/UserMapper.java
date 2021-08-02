package com.yhl.Dao;

import com.yhl.entity.Users;

import java.util.List;

public interface UserMapper
{
    int insert(Users users);
    int update(Users users);
    int delete(Users users);
    List<Users> findAll();
    Users findOne(Users users);
}
