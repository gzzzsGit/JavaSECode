package com.atguigu04.set;

import java.util.Objects;

/**
 * className: User
 * Package : com.atguigu04.set
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/2 16:50
 * @Version 1.0
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hash...");
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof User) {
            User u = (User) o;
            int res = this.age - u.age;
            if (res != 0) {
                return res;
            }
            return this.name.compareTo(u.name);
        } else {
            throw new RuntimeException("类型不匹配");
        }
    }

}
