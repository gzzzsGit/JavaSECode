package com.atguigu04.other.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * className: AnnotationTest
 * Package : com.atguigu04.other.annotation
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 16:22
 * @Version 1.0
 */
public class AnnotationTest {
    @Test
    public void test1(){
        Class clazz = Customer.class;
        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);
        System.out.println(annotation.value());//table_customer
    }

    @Test
    public void test2() throws NoSuchFieldException {
        Class clazz = Customer.class;
        Field name = clazz.getDeclaredField("name");
        Column annotation = name.getDeclaredAnnotation(Column.class);
        System.out.println(annotation.columnName());//cust_name
        System.out.println(annotation.columnType());//varchar(15)
    }
}
