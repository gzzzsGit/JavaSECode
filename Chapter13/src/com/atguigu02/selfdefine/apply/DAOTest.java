package com.atguigu02.selfdefine.apply;

import org.junit.Test;

import java.util.ArrayList;

/**
 * className: DAOTes
 * Package : com.atguigu02.selfdefine.apply
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 21:01
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.insert(new Customer());
        ArrayList<Customer> customers = dao1.queryForIList(1);
    }

    @Test
    public void test2(){
        OrderDAO dao2 = new OrderDAO();
        dao2.insert(new Order());
        dao2.deleteById(1);
        ArrayList<Order> orders = dao2.queryForIList(1);

    }
}
