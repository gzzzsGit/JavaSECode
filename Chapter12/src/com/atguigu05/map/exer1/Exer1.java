package com.atguigu05.map.exer1;

import java.util.*;

/**
 * className: E雪儿
 * Package : com.atguigu05.map.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/4 21:06
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        HashMap Singers = new HashMap();

        String singer1 = "杰伦";
        ArrayList songs1 = new ArrayList();
        songs1.add("等你下课");
        songs1.add("爱在西元前");
        songs1.add("告白气球");
        songs1.add("稻香");
        songs1.add("七里香");
        Singers.put(singer1, songs1);

        String singer2 = "Eason";
        ArrayList songs2 = new ArrayList();
        songs2.add("富士山下");
        songs2.add("八号风球");
        songs2.add("红玫瑰");
        songs2.add("十年");
        songs2.add("孤独患者");
        Singers.put(singer2, songs2);

        Set entrySet = Singers.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("歌手有："+entry.getKey());
            System.out.println("歌曲有："+entry.getValue());
        }

    }

}
