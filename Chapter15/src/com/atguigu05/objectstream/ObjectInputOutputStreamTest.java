package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * className: ObjectInputOutputStreamTest
 * Package : com.atguigu05.objectstream
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 23:44
 * @Version 1.0
 */
public class ObjectInputOutputStreamTest {

    //序列化过程：使用ObjectOutputStream流实现，将内存中的java对象保存到文件中
    @Test
    public void test1() throws IOException {
        File file = new File("object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //序列化过程
        oos.writeUTF("往事暗沉不可追，来日之路光明灿烂");
        oos.writeObject("满堂花醉三千客，一剑霜寒十四州");
        oos.flush();

        oos.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        File file = new File("object.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        //反序列化过程
        String s1 = ois.readUTF();
        System.out.println(s1);//往事暗沉不可追，来日之路光明灿烂

        String s2 = (String) ois.readObject();
        System.out.println(s2);//满堂花醉三千客，一剑霜寒十四州
        ois.close();
    }

    @Test
    public void test3() throws IOException {
        File file = new File("object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //序列化过程
        Person p1 = new Person(23, "kunkun");
        Person p2 = new Person(22,"Zhong Qiu",new Account(200));
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.flush();

        oos.close();
    }

    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("object.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        //反序列化过程
        Person p1 = (Person) ois.readObject();
        System.out.println(p1);
        Person p2 = (Person) ois.readObject();
        System.out.println(p2);

        ois.close();
    }
}
