package com.shimh.ioc.common;

/**
 * @author: shimh
 * @create: 2020年01月
 **/
public abstract class AbstractUser {

    private String name;

    public abstract User user();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
