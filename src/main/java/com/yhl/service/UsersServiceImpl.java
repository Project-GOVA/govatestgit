package com.yhl.service;

import com.yhl.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService
{
    public UsersServiceImpl() {
        super();
    }

    @Override
    public int insert(Users users) {
        return 0;
    }

    @Override
    public int update(Users users) {
        return 0;
    }

    @Override
    public int delete(Users users) {
        return 0;
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users findOne(Users users) {
        return null;
    }
}
