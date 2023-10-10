package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * className: FileStreamTest
 * Package : com.atguigu02.filestream
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 12:01
 * @Version 1.0
 */
public class FileStreamTest {
    @Test
    public void test1(){
        //创建相关的File类的对象
        File file1 = new File("C:\\Users\\15120\\Pictures\\image1.jpg");
        File file2 = new File("image1.jpg");

        //创建相关的字节流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            //数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;
            while (((len) = fis.read(buffer))!=-1) {
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
