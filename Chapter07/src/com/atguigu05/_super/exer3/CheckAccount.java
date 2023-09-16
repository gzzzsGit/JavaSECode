package com.atguigu05._super.exer3;

/**
 * className: CheckAccount
 * Package : com.atguigu05._super.exer3
 * Description:
 *2、创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
 * ————————————————————————————————————————
 * 如果（取款金额<账户余额），
 * 	可直接取款
 * 如果（取款金额>账户余额），
 * 	计算需要透支的额度
 * 	判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 		将账户余额修改为0，冲减可透支金额
 * 	如果不可以
 * 		提示用户超过可透支额的限额
 * ————————————————————————————————————————
 * @Author gzzz
 * @Create 2023/8/16 13:19
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(double overdraft,int id,double balance, double annualinterestrate) {
        super(id,balance,annualinterestrate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amt) {
        if (amt<=getBalance())
            super.withdraw(amt);
        else if (amt-getBalance()<=overdraft) {
            overdraft -= amt-getBalance();
            setBalance(0);
            System.out.println("取款成功");
        }
        else
            System.out.println("超过可透支限额");
    }

}
