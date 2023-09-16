package com.atguigu05._super.exer3;

/**
 * className: CheckAccountTest
 * Package : com.atguigu05._super.exer3
 * Description:
 *要求：写一个用户程序测试CheckAccount类。
 * 在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 * 提示：
 * （1）子类CheckAccount的构造方法需要将从父类继承的3个属性和子类自己的属性全部初始化。
 * （2）父类Account的属性balance被设置为private，但在子类CheckAccount的withdraw方法中需要修改它的值，因此应修改父类的balance属性
 * ，定义其为protected。
 * @Author gzzz
 * @Create 2023/8/16 13:22
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkaccount = new CheckAccount(5000,1122,20000, 0.045);
        checkaccount.withdraw(5000);
        System.out.println("余额为："+checkaccount.getBalance()+",可透支额度为："+checkaccount.getOverdraft());
        checkaccount.withdraw(18000);
        System.out.println("余额为："+checkaccount.getBalance()+",可透支额度为："+checkaccount.getOverdraft());
        checkaccount.withdraw(3000);
        System.out.println("余额为："+checkaccount.getBalance()+",可透支额度为："+checkaccount.getOverdraft());

    }
}
