package com.atguigu01._this.exer2;

/**
 * className: Bank
 * Package : com.atguigu01._this.exer2
 * Description:
 *按照UML类图，创建Bank类，提供必要的结构。
 * - addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。
 *   还必须把 numberOfCustomer 属性的值加 1。
 * - getNumOfCustomers 方法返回 numberofCustomers 属性值。
 * - getCustomer方法返回与给出的index参数相关的客户。
 * @Author gzzz
 * @Create 2023/8/14 16:07
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l){
        customers[numberOfCustomer] = new Customer(f,l);
        numberOfCustomer++;
    }

    public Customer getCustomer(int index) {
        if (index<customers.length)
            return customers[index];
        else
            System.out.println("索引越界");
        return null;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
