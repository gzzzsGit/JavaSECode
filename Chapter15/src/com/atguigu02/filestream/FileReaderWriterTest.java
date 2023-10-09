package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * className: FileReaderWriterTest
 * Package : com.atguigu02.filestream
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/9 21:03
 * @Version 1.0
 */
public class FileReaderWriterTest {
    @Test
    public void test1()  {
        //创建File类的对象，对应hello.txt文件
        File file = new File("hello.txt");

        FileReader fileReader = null;
        try {
            //创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);//h

            //读取数据并打印到控制台
            System.out.println((char)fileReader.read());//读取一个数据
            int data ;
            while ((data = fileReader.read())!= -1) {
                System.out.println((char)data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流资源
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对test1进行优化，一次读取多个字符
    @Test
    public void test2()  {
        //创建File类的对象，对应hello.txt文件
        File file = new File("hello.txt");

        FileReader fileReader = null;
        try {
            //创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);//h

            //读取数据并打印到控制台
            char[] cbuffer = new char[5];
            int len;
            while ((len = fileReader.read(cbuffer))!=-1) {
                for (int i = 0; i < len; i++) {
                    System.out.println(cbuffer[i]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流资源
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        FileWriter fileWriter = null;
        try {
            //1.创建File类对象
            File file = new File("write.txt");

            //追加内容使用的构造器
            //fileWriter = new FileWriter(file, true);
            //创建输出流,默认是覆盖文件的构造器
            fileWriter = new FileWriter(file);

            //写出具体过程
            //输出的方法：public void write(String str)，public void write(char[] cdata)
            //如果文件不存在则自动创建，存在则覆盖原文件
            fileWriter.write("test writting");
            fileWriter.write("\nhello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Test
    public void test4(){
        File fileSrc = new File("hello.txt");
        File fileDst = new File("hello_copy.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            //创建输入输出流
            fileReader = new FileReader(fileSrc);
            fileWriter = new FileWriter(fileDst);

            //读写数据
            int len;
            char[] cbuffer = new char[5];
            while ((len = fileReader.read(cbuffer)) != -1) {
                fileWriter.write(cbuffer,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
