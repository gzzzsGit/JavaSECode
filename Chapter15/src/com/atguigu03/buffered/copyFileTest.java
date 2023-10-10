package com.atguigu03.buffered;

import java.io.*;

/**
 * className: copyFileTest
 * Package : com.atguigu03.buffered
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/10 16:27
 * @Version 1.0
 */
public class copyFileTest {
    public static void main(String[] args) {
        copyFileTest test = new copyFileTest();
        long time1 = System.currentTimeMillis();
        test.copyFileByFileStream("C:\\Users\\15120\\Pictures\\image1.jpg","image2.jpg");
        System.out.println("使用节点流复制花费时长："+(System.currentTimeMillis()-time1));

        long time2 = System.currentTimeMillis();
        test.copyFileByBufferedStream("C:\\Users\\15120\\Pictures\\image1.jpg","image3.jpg");
        System.out.println("使用缓冲流复制花费时长："+(System.currentTimeMillis()-time2));
    }

    public void copyFileByFileStream(String src, String dst) {
        //创建相关的File类的对象
        File file1 = new File(src);
        File file2 = new File(dst);

        //创建相关的字节流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            //数据的读入和写出
            byte[] buffer = new byte[50];
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

    public void copyFileByBufferedStream(String src, String dst) {
        //创建相关的File类的对象
        File file1 = new File(src);
        File file2 = new File(dst);

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
            byte[] buffer = new byte[50];
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
