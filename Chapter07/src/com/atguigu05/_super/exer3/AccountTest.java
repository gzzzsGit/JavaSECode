package com.atguigu05._super.exer3;

/**
 * className: AccountTest
 * Package : com.atguigu05._super.exer3
 * Description:
 *写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 * 使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * 运行结果如图所示。
 * @Author gzzz
 * @Create 2023/8/16 3:04
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,30000);
        System.out.println("您的帐户余额为："+account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的帐户余额为："+account.getBalance());
        System.out.println("月利率为："+account.getMonthlyInterest());

    }
}
