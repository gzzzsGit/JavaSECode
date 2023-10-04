package com.atguigu05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * className: PropertiesTest
 * Package : com.atguigu05.map
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/4 20:54
 * @Version 1.0
 */
public class PropertiesTest {
    @Test
    public void test() throws IOException {
        File file = new File("info.properties");
        System.out.println(file.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\Chapter12\info.properties
        FileInputStream fis = new FileInputStream(file);

        Properties pros = new Properties();
        pros.load (fis);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println("name: "+name+", password: "+password);

        fis.close();
    }

    public static void main(String[] args) {
        File file = new File("info.properties");
        System.out.println(file.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\info.properties
    }
}
