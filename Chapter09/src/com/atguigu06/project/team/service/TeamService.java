package com.atguigu06.project.team.service;

import com.atguigu06.project.model.service.Status;
import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.domain.Programmer;
import com.atguigu06.project.team.view.TSUtility;

/**
 * className: TeamService
 * Package : com.atguigu06.project.team.service
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/4 4:01
 * @Version 1.0
 */
public class TeamService {
    private static int counter =1;
    private final int Max_member =5;
    private Programmer[] team = new Programmer[Max_member];
    private int total = 0;

    public Programmer[] getTeam(){
        return team;
    }

    public int getTotal() {
        return total;
    }

    public void addMember(Employee e)throws TeamException{
        if (total>Max_member) {
            throw new TeamException("人员已满，无法添加");
        }
        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()) {
                throw new TeamException("请勿重复添加");
            }
        }
        if (e instanceof Programmer) {
            Programmer p = (Programmer) e;
            if (p.getStatus()== Status.BUSY){
                throw new TeamException("该员工已被其他团队选中");
            }
            else if (p.getStatus() ==Status.VOCATION){
                throw new TeamException("该员工休假中");
            }
            else {
                p.setStatus(Status.BUSY);
                team[total] = p;
                p.setMemberId(counter);
                counter += 1;
                total += 1;
            }
        }
        else {
            throw new TeamException("不是开发人员，无法添加");
        }

    }

    public void removeMember(int memberId)throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("删除失败，原因：找不到该成员，无法删除");
        }
        for (int j = i+1; j < total; j++) {
            team[i] = team[j];
            i++;
        }
        team[--total]=null;
        System.out.println("删除成功");
    }
}
