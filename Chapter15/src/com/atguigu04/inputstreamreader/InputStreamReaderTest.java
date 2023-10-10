package com.atguigu04.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * className: InputStreamReaderTest
 * Package : com.atguigu04.inputstreamreader
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 19:53
 * @Version 1.0
 */
public class InputStreamReaderTest {
    @Test
    public void test1() throws IOException {
        File file = new File("dbcp_utf-8.txt");

        //创建
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);

        char[] cBuffer = new char[1024];
        int len;

        while ((len = isr.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }

        isr.close();
    }
    
    @Test
    public void test2()  {
        File file = new File("dbcp_utf-8.txt");

        //创建流
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            //使用不兼容的解码格式，导致输出乱码
            isr = new InputStreamReader(fis,"gbk");

            char[] cBuffer = new char[1024];
            int len;

            while ((len = isr.read(cBuffer)) != -1) {
                String str = new String(cBuffer, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test3(){
        File file1 = new File("dbcp_utf-8.txt");
        File file2 = new File("dbcp_gbk.txt");

        //创建流
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            //使用不兼容的解码格式，导致输出乱码
            isr = new InputStreamReader(fis,"utf-8");
            br = new BufferedReader(isr);
            osw = new OutputStreamWriter(fos, "gbk");
            bw = new BufferedWriter(osw);

            char[] cBuffer = new char[100];
            int len;

            while ((len = br.read(cBuffer)) != -1) {
                String str = new String(cBuffer, 0, len);
                bw.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
