package com.atguigu06.project.team.domain;

/**
 * className: Architect
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 15:08
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;

    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t\t"+getSalary()+"\t"+"架构师"+"\t"+getStatus()+"\t"
                +getBonus()+"\t"+stock+"\t"+getEquipment().getDescription();
    }

    public int getStock() {
        return stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }
}
