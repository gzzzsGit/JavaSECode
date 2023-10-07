package com.atguigu02.selfdefine.exer1;

/**
 * className: User
 * Package : com.atguigu02.selfdefine.exer1
 * Description:
 *定义一个 User 类：
 *该类包含：private成员变量（int类型） id，age；（String 类型）name。
 * @Author gzzz
 * @Create 2023/10/6 21:16
 * @Version 1.0
 */
public class User {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
