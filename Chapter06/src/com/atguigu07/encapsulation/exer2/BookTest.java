package com.atguigu07.encapsulation.exer2;

/**
 * className: BookTeste
 * Package : com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/12 0:16
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("晚熟的人");
        book.setAuthor("莫言");
        book.setPrice(180);
        book.showInfo();
    }
}
