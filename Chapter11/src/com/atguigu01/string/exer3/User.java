package com.atguigu01.string.exer3;

/**
 * className: User
 * Package : com.atguigu01.string.exer3
 * Description:
 *（1）定义用户类，属性为用户名和密码，提供相关的getter和setter方法，构造器，toString()。
 * @Author gzzz
 * @Create 2023/9/25 21:36
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName+'-'+password;
    }
}
