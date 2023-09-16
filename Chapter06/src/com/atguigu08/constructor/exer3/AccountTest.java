package com.atguigu08.constructor.exer3;

/**
 * className: AccountTest
 * Package : com.atguigu08.constructor.exer3
 * Description:
 *（1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 * （2）对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息：
 *
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
 * @Author gzzz
 * @Create 2023/8/13 17:37
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane","Smith");
        //匿名对象往往只能被调用一次
        //匿名对象常常作为实参传递给方法的形参。
        c1.setAccount(new Account(1000,2000,0.0123));

        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);

        System.out.println("Customer ["+c1.getFirstName()+", "+c1.getLastName()+"] has a account: id is "+
                c1.getAccount().getId()+ ", annualInterestRate is "+(c1.getAccount().getAnnualInterestRate()*100+"%")+
                ", balance is "+c1.getAccount().getBalance());
    }
}
