package com.atguigu06.project.team.service;


import com.atguigu06.project.team.domain.*;

/**
 * className: NameListService
 * test
 * Package : com.atguigu06.project.team.service
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/4 2:04
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            int salary =Integer.parseInt(Data.EMPLOYEES[i][4]);
            switch (type){
                case 10:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case 11:
                    employees[i] = new Programmer(id, name, age, salary,createEquipement(i));
                    break;
                case 12:
                    double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary,createEquipement(i),bonus);
                    break;
                case 13:
                    double bonus1 = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary,createEquipement(i),bonus1,stock);
                    break;
            }
        }
    }

    public Equipment createEquipement(int index){
        int equipType = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        Equipment equipment;
        switch (equipType){
            case 21:
                equipment = new PC(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS[index][2]);
                break;
            case 22:
                equipment = new NoteBook(Data.EQUIPMENTS[index][1],Double.parseDouble(Data.EQUIPMENTS[index][2]));
                break;
            case 23:
                equipment = new Printer(Data.EQUIPMENTS[index][1],Data.EQUIPMENTS[index][2]);
                break;
            default:
                equipment = new Equipment() {
                    @Override
                    public String getDescription() {
                        return null;
                    }
                };
        }
        return equipment;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        try {
            return employees[id-1];
        } catch (TeamException | IndexOutOfBoundsException e) {
            throw new TeamException("找不到指定的员工");
        }
    }

}
