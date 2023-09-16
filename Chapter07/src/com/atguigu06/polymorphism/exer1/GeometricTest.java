package com.atguigu06.polymorphism.exer1;

/**
 * className: GeometricTest
 * Package : com.atguigu06.polymorphism.exer1
 * Description:
 * *编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型），
 *  * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）。
 * @Author gzzz
 * @Create 2023/8/16 20:53
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        GeometricObject a = new Circle(2,"yellow",1);
        GeometricObject b = new MyRectangle(2,2,"blue",1);
        System.out.println("Area of a:"+test.displayGeometricObject(a));
        System.out.println("Area of b:"+test.displayGeometricObject(b));
        System.out.println("a = b is: "+test.equalsArea(a,b));

    }
    public boolean equalsArea(GeometricObject a,GeometricObject b){
        return a.findArea()==b.findArea();
    }

    public double displayGeometricObject(GeometricObject a){
        return a.findArea();
    }
}
