package com.atguigu03.url;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * className: URLTest1
 * Package : com.atguigu03.url
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/12 22:35
 * @Version 1.0
 */
public class URLTest1 {
    @Test
    public void test1()  {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //获取URL实例
            URL url = new URL("http://127.0.0.1:8080/examples/image.png");

            //建立与服务器的连接
            urlConnection = (HttpURLConnection) url.openConnection();

            //获取输入流，创建输出流
            is = urlConnection.getInputStream();
            File file = new File("urlTest.png");
            fos = new FileOutputStream(file);

            //读写数据
            byte[] buffer = new byte[50];
            int len;
            while ((len = is.read(buffer))!= -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("下载完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流和url连接
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            urlConnection.disconnect();
        }
    }
}
