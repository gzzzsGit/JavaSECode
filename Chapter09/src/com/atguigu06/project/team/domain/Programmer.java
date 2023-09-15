package com.atguigu06.project.team.domain;

import com.atguigu06.project.model.service.Status;

/**
 * className: Programmer
 * Package : com.atguigu06.project.team.domain
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/3 15:06
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t\t"+getSalary()+"\t"+"程序员"+"\t"+status+"\t"+equipment.getDescription();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }


}
