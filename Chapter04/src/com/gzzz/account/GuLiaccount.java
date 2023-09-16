package com.gzzz.account;

import com.gzzz.util.Utility;

/**
 * className: GuLiaccount
 * Package : com.gzzz.account
 * Description:
 *first small project
 * @Author gzzz
 * @Create 2023/7/23 15:54
 * @Version 1.0
 */
public class GuLiaccount {
    public static void main(String[] args) {
        int money = 10000;
        String info = "";
        label: while (true) {
            System.out.println("-----------谷粒记账软件------------");
            System.out.println("              1. 收支明细");
            System.out.println("              2. 登记收入");
            System.out.println("              3. 登记支出");
            System.out.println("              4. 退出\n");
            System.out.print("              请选择(1-4)：");
            char selection = Utility.readMenuSelection();//获取用户选择
            switch (selection) {
                case '1':
                    System.out.println("-----------当前收支明细记录-----------");
                    System.out.println("收支\t账户金额\t收支金额\t说明");
                    System.out.println(info);
                    System.out.println("--------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int gain = Utility.readNumber();
                    System.out.println();
                    System.out.print("本次收入说明：");
                    String gainIntro = Utility.readString();
                    System.out.println();
                    money += gain;
                    info += "收入\t" + money + "\t\t" + gain + "\t\t" + gainIntro + "\n";
                    System.out.println("登记成功！");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int cost = Utility.readNumber();
                    System.out.println();
                    if (cost > money) {
                        System.out.println("支出超过范围！");
                        break;
                    }
                    System.out.print("本次支出说明：");
                    String costIntro = Utility.readString();
                    System.out.println();
                    money -= cost;
                    info += "支出\t" + money + "\t\t" + cost + "\t\t" + costIntro + "\n";
                    System.out.println("登记成功！");
                    break;
                case '4':
                    System.out.println("\n确认是否退出(Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y')
                        break label;
            }
            break;
        }
    }
}

