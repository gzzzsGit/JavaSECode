package com.atguigu06.project.team.domain;

/**
 * className: NoteBook
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 19:01
 * @Version 1.0
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
}
