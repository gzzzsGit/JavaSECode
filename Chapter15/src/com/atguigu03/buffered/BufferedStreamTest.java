package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * className: BufferedStreamTest
 * Package : com.atguigu03.buffered
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 16:18
 * @Version 1.0
 */
public class BufferedStreamTest {
    @Test
    public void test1(){
        //创建相关的File类的对象
        File file1 = new File("C:\\Users\\15120\\Pictures\\image1.jpg");
        File file2 = new File("image1.jpg");

        //创建相关的字节流、缓冲流
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            //使用缓冲流包好节点流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;
            while (((len) = bis.read(buffer))!=-1) {
                bos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //关闭了外层流会自动关闭内层的流，所以可以省略内层流的关闭
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
