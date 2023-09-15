package com.atguigu06.project.team.view;

import com.atguigu06.project.team.domain.Architect;
import com.atguigu06.project.team.domain.Designer;
import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.domain.Programmer;
import com.atguigu06.project.team.service.Data;
import com.atguigu06.project.team.service.NameListService;
import com.atguigu06.project.team.service.TeamException;
import com.atguigu06.project.team.service.TeamService;

/**
 * className: TeamService
 * Package : com.atguigu06.project.team.view
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/5 3:20
 * @Version 1.0
 */
public class TeamView {
    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
    private final NameListService listSvc= new NameListService();
    private final TeamService teamSvc = new TeamService();


    public void enterMainMenu() {
        boolean endFlag = false;
        char selection = '0';
        while (!endFlag) {
            if (selection!='1') {
                listAllEmployees();
            }
            System.out.print("1-团队成员  2-添加团队成员  3-删除团队成员  4-退出  请选择(1-4): ");
            selection = TSUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("\n-------------------------------团队成员列表--------------------------------\n");
                    if (teamSvc.getTotal() ==0){
                        System.out.println("开发团队目前没有成员！");
                        break;
                    }
                    getTeam();
                    break;
                case '2':
                    System.out.print("请输入要添加的员工ID: ");;
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("请确认是否退出(Y/N):");
                    if ('Y'==TSUtility.readConfirmSelection()){
                        endFlag = true;
                    }
                    else{
                        break;
                    }
            }
        }
    }


    private void listAllEmployees(){
        Employee[] employees = listSvc.getAllEmployees();
        System.out.println("\n-------------------------------优尚开发团队调度系统--------------------------------\n");
        if (employees.length == 0){
            System.out.println("没有客户记录！");
            return;
        }
        else {
            System.out.println("ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------------------------------------------------------");
    }


    private void getTeam(){
        Programmer[] team = teamSvc.getTeam();
        if (team.length == 0){
            System.out.println("开发团队目前没有成员！");
            return;
        }
        else {
            System.out.println("TID/ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t奖金\t\t股票");
        }
        for (int i = 0; i < teamSvc.getTotal(); i++) {
            String res = team[i].getMemberId()+"/"+team[i].getId()+"\t\t"+team[i].getName()+'\t'+team[i].
                    getAge()+ '\t'+team[i].getSalary()+'\t'+team[i].getClass().getSimpleName()+'\t';
            if (team[i] instanceof Designer){
                res += ((Designer) team[i]).getBonus()+"\t";
                if (team[i] instanceof Architect){
                    res += ((Architect) team[i]).getStock();
                }
            }
            System.out.println(res);
        }
    }


    public void addMember(){
        int id = TSUtility.readInt();
        try {
            teamSvc.addMember(listSvc.getEmployee(id));
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败,原因："+e.getMessage());
        }
        TSUtility.readReturn();
    }


    public void deleteMember (){
        System.out.print("请输入要删除员工的TID：");
        int id = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)：");
        if (TSUtility.readConfirmSelection() =='Y'){
            try {
                teamSvc.removeMember(id);
            } catch (TeamException e) {
                System.out.println(e.getMessage());
            }
            TSUtility.readReturn();
        }
    }
}