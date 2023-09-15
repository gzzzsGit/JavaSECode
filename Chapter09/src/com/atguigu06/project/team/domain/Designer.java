package com.atguigu06.project.team.domain;

/**
 * className: Designer
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 15:08
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;

    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t\t"+getSalary()+"\t"+"设计师"+"\t"+getStatus()+"\t"
                +bonus+"\t"+getEquipment().getDescription();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
