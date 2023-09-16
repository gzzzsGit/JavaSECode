package com.atguigu05.method_more._03valuetransfer;


/**
 * @author 尚硅谷-宋红康
 * @create 21:42
 */
public class ValueTransferTest {
    int testid ;
    public static void main(String[] args) {

        ValueTransferTest test = new ValueTransferTest();
        test.testid = 1;
        int m = 10;

        test.add(m);
        System.out.println(m);

        test.add(test);
        System.out.println(test.testid);
    }
    public void add(int m){
        m++;
    }
    public void add(ValueTransferTest test){
        test.testid++;
    }
}

