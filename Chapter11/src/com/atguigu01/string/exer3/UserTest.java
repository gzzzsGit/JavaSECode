package com.atguigu01.string.exer3;

import java.util.Scanner;

/**
 * className: UserTest
 * Package : com.atguigu01.string.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/25 21:38
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("Tom","132" );
        users[1] = new User("Jerry", "8888");
        users[2] = new User("krystal","666666");

        System.out.println("库中的用户有：");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
            
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = scan.next();
        System.out.println("请输入密码：");
        String password = scan.next();

        boolean isFlag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(userName) ) {
                if (users[i].getPassword().equals(password))
                    System.out.println("登陆成功！");
                else {
                    System.out.println("密码错误！");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("不存在该用户名！");
        }
        scan.close();
    }
}
