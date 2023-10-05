package com.atguigu06.collections.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * className: Exer
 * Package : com.atguigu06.collections.exer
 * Description:
 *模拟斗地主洗牌和发牌，牌没有排序
 * 效果如图。
 *
 * 提示：不要忘了大王、小王
 * @Author gzzz
 * @Create 2023/10/5 16:39
 * @Version 1.0
 */
public class Exer {
    public static void main(String[] args) {
        //组成一幅牌
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
        ArrayList poker = new ArrayList();
        for (String colors:
             color) {
            for (String nums :
                    num) {
                poker.add(colors + nums);
            }
        }
        poker.add("大王");
        poker.add("小王");

        //洗牌
        Collections.shuffle(poker);

        //发牌
        //创建三个人和底牌
        ArrayList user1 = new ArrayList();
        ArrayList user2 = new ArrayList();
        ArrayList user3 = new ArrayList();
        ArrayList last = new ArrayList();
        getPokers(0,user1,poker);
        getPokers(1,user2,poker);
        getPokers(2,user3,poker);

        for (int i = 0; i < 3; i++) {
            last.add(poker.get(53-i));
        }

        HashMap Tom = new HashMap();
        Tom.put("Tom", user1);
        HashMap Jerry = new HashMap();
        Jerry.put("Jerry", user2);
        HashMap me = new HashMap();
        me.put("me", user3);
        HashMap lastPokers = new HashMap();
        lastPokers.put("底牌", last);

        System.out.println(Tom.keySet().iterator().next()+":");
        System.out.println(Tom.values().iterator().next());
        System.out.println(Jerry.keySet().iterator().next()+":");
        System.out.println(Jerry.values().iterator().next());
        System.out.println(me.keySet().iterator().next()+":");
        System.out.println(me.values().iterator().next());
        System.out.println(lastPokers.keySet().iterator().next()+":");
        System.out.println((lastPokers.values()).iterator().next());
    }

    public static void getPokers(int index, ArrayList list,ArrayList poker) {
        for (int i = index; i+3 < 54; i+=3) {
            list.add(poker.get(i));
        }
    }
}
