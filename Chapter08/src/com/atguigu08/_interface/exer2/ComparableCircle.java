package com.atguigu08._interface.exer2;

/**
 * className: ComparableCircle
 * Package : com.atguigu08._interface.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 19:51
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) throws Exception {
       if (this == o){
           return 0;
       }
       if (o instanceof ComparableCircle){
           if (getRadius()-((ComparableCircle) o).getRadius()>0){
               return 1;
           } else if (getRadius()-((ComparableCircle) o).getRadius()<0) {
               return -1;
           }
           else
               return 0;
       }
       else {
           throw new Exception( "输入类型不合法");
       }
    }
}
