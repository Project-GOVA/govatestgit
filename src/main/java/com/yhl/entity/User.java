package com.yhl.entity;

public class User
{
    private int uid;
    private String password;

    public User() {
    }

    public User(int uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
