package com.atguigu06.project.team.domain;

/**
 * className: Printer
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 19:03
 * @Version 1.0
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name+"("+type+")";
    }
}
