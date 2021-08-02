package com.yhl.service;

import com.yhl.entity.Users;

import java.util.List;

public interface UsersService
{
    int insert(Users users);
    int update(Users users);
    int delete(Users users);
    List<Users> findAll();
    Users findOne(Users users);
}
