package com.rsrfarming.agroteh.model;

public class User {

    private String id;
    private String name;
    private String mobile;
    private String userRole;
    public User() {
    }

    public User(String id, String name, String mobile,String userRole) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
