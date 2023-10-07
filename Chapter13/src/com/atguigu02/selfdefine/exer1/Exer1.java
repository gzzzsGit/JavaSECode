package com.atguigu02.selfdefine.exer1;

import org.junit.Test;

import java.util.List;

/**
 * className: Exer1
 * Package : com.atguigu02.selfdefine.exer1
 * Description:
 *定义一个测试类：
 * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 * 使用 Junit 单元测试类进行测试。
 * @Author gzzz
 * @Create 2023/10/6 21:15
 * @Version 1.0
 */
public class Exer1 {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();
        User u1 = new User(1,30,"AA");
        User u2 = new User(2,34,"bb");
        User u3 = new User(3,24,"cc");
        User u4 = new User(4,29,"tt");
        User u5= new User(5,18,"dd");

        dao.save("1",u1);
        dao.save("2",u2);
        dao.save("3",u3);
        dao.save("4",u4);
        dao.save("5",u5);

        User user = dao.get("2");
        System.out.println(user);

        dao.update("2",new User(7,7,"newUser"));

        for (User user1 : dao.list()) {
            System.out.println(user1);
        }

        dao.delete("1");

        List<User> list1 = dao.list();
        System.out.println(list1);
    }
}
