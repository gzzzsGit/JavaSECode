package com.atguigu05.map.exer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * className: Exer2
 * Package : com.atguigu05.map.exer2
 * Description:
 *案例：二级联动
 * 将省份和城市的名称保存在集合中，当用户选择省份以后，二级联动，显示对应省份的地级市供用户选择。
 *
 * 提示：如果输入的省份不正确，需要重新输入。 如果输入的城市不正确，需要重新输入。
 * @Author gzzz
 * @Create 2023/10/4 21:24
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        Map map = CityMap.model;
        Set provinces = map.keySet();
        for (Object provice:
             provinces) {
            System.out.println(provice+"\t");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] cities;
        while (true) {

            System.out.println("请输入你所在的省份：");
            String province = scanner.next();
            //获取省份对应的各个城市构成的String[]
            cities = (String[]) map.get(province);
            if ( cities== null ||  cities.length==0) {
                System.out.println("选择有误，请重新输入！");
            } else {
                break;
            }
        }
        for (String city :
                cities) {
            System.out.print(city+"\t");
        }
        System.out.println();
        label: while (true) {
            System.out.println("请输入你所在的城市：");
            String yourCity = scanner.next();
            for (String city :
                    cities) {
                if (city.equals(yourCity)) {
                    System.out.println("信息登记完毕");
                     break label;
                }
            }
            System.out.println("选择有误，请重新输入！");
        }
        scanner.close();
    }
}

class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

}