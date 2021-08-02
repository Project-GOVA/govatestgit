package com.yhl.entity;

import java.io.Serializable;

public class Users implements Serializable
{
    private int uid;
    private String uname;
    private int utele;
    private String upass;

    public Users() {
    }

    public Users(int uid, String uname, int utele, String upass) {
        this.uid = uid;
        this.uname = uname;
        this.utele = utele;
        this.upass = upass;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUtele() {
        return utele;
    }

    public void setUtele(int utele) {
        this.utele = utele;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
