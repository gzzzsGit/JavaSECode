package com.atguigu07.encapsulation.exer2;

/**
 * className: Book
 * Package : com.atguigu07.encapsulation.exer2
 * Description:
 *案例：自定义图书类
 * 设定属性包括：
 * 书名bookName，
 * 作者author，
 * 价格price；
 * 方法包括：
 * 相应属性的get/set方法，
 * 图书信息介绍等。
 * @Author gzzz
 * @Create 2023/8/11 21:57
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private int price;

    public void setBookName(String name){
        bookName = name;
    }

    public String getBookName(){
        return bookName;
    }

    public void setAuthor(String name){
        author = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(int cost){
        price = cost;
    }

    public int getPrice(){
        return price;
    }

    public void showInfo(){
        System.out.println("The bookName is "+bookName+", its arthor is "+author+", and the price is "+price);
    }
}
