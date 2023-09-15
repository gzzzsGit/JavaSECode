package com.atguigu06.project.team.domain;

/**
 * className: PC
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 18:51
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return  model+"("+display+")";
    }
}
