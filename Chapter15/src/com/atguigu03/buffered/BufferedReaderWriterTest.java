package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * className: BufferedReaderWriterTest
 * Package : com.atguigu03.buffered
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 16:46
 * @Version 1.0
 */
public class BufferedReaderWriterTest {
    @Test
    public void test1(){
        File file = new File("dbcp_utf-8.txt");

        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(file));
//
//            //方式一:read()
//            char[] cbuffer = new char[10];
//            int len;
//            while ((len = br.read(cbuffer)) != -1) {
//                //使用char型数组创建字符串
//                String str = new String(cbuffer, 0, len);
//                System.out.print(str);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        //方式二：readLine()
        try {
            br = new BufferedReader(new FileReader(file));
            String str = null;
            //readLine()读取一行不包括换行符
            while ((str = br.readLine())!= null) {
                //使用char型数组创建字符串
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Test
    public void test2(){
        File file1 = new File("dbcp_utf-8.txt");
        File file2 = new File("dbcp_utf-8_copy.txt");

        BufferedReader br = null;
        BufferedWriter wr = null;

        try {
            br = new BufferedReader(new FileReader(file1));
            wr = new BufferedWriter(new FileWriter(file2));
            String str;
            while ((str = br.readLine()) != null) {
                //wr.write(str);
                // wr.newLine();
                wr.write(str + '\n');
            }
            wr.flush();//刷新，每当调用此方法，就会主动将内存的数据写到磁盘文件
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (wr != null) {
                    wr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
