package com.huawei.demo.bean;

import java.util.List;

/**
 * This is Description
 *
 * @author 王明飞
 * @date 2018/09/11
 */
public class User {

    private String username;
    private String password;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
