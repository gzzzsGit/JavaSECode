package com.atguigu01.use.exer1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * className: exer1
 * Package : com.atguigu01.use.exer1
 * Description:
 * 3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）
 *
 * 4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 *    1). 使Employee 实现 Comparable 接口，并按 name 排序
 *    2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 * @Author gzzz
 * @Create 2023/10/5 21:48
 * @Version 1.0
 */
public class exer1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", 20, new MyDate(2003, 12, 12));
        Employee e2 = new Employee("Jerry", 23, new MyDate(2000, 6, 30));
        Employee e3 = new Employee("Fish", 44, new MyDate(1979, 5, 22));
        Employee e4 = new Employee("Curry", 40, new MyDate(1983, 3, 32));
        Employee e5 = new Employee("Lebron", 40, new MyDate(1983, 12, 7));

//        降序
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
//        TreeSet<Employee> set =new TreeSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        var iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
