package com.atguigu06.otherstream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

/**
 * className: OtherStreamTest
 * Package : com.atguigu06.otherstream
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/11 10:24
 * @Version 1.0
 */
public class OtherStreamTest {
    @Test
    public void test1(){
        System.out.println("请输入信息(退出输入e或exit):");

        // 把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
        BufferedReader br = null;
        String s ;
        try {
            br = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
            while ((s = br.readLine()) != null) { // 读取用户输入的一行数据 --> 阻塞程序
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("安全退出!!");
                    break;
                }
                // 将读取到的整行字符串转成大写输出
                System.out.println("-->:" + s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); // 关闭过滤流时,会自动关闭它包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Test
    public void test2() throws IOException {
        PrintStream ps = null;
        BufferedReader br = null;
        try {
            ps = new PrintStream("printStream.txt");
            ps.println("This is a test!");
            ps.print("a".toUpperCase());

            // 把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
            br = new BufferedReader(new InputStreamReader(System.in));
            ps.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
            ps.close();
        }
    }
    
    @Test
    public void test3(){
        PrintStream ps = null;

        try {
            // 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(new FileOutputStream(new File("printStreamTest3.txt")),true);
            if (ps != null) {
                System.setOut(ps);//更改输出的位置，从控制台改为文件
            }

            for (int i = 0; i < 256; i++) {
                System.out.print((char)i);
                if (i % 50==0) {//每50个一行
                    System.out.println();//换行
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
    
    @Test
    public void test4(){
        Logger.log("今天我学习了使用打印流来写日志文件");
        Logger.log("天天向上！");
    }
    
    @Test
    public void test5(){
        File fileSrc = new File("img2.png");
        File fileDst = new File("img2_copy.txt");

        try {
            FileUtils.copyFile(fileSrc, fileDst);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("复制完成");
    }
}
