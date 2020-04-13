package com.shimh.ioc.common;

/**
 * @author: shimh
 * @create: 2020年01月
 **/
public class Company {

    private String name;

    public User user;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
