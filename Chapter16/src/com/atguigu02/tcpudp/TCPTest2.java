package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * className: TCPTest2
 * Package : com.atguigu02.tcpudp
 * Description:
 *客户端发送文件给服务端，服务端将文件保存在本地。
 * @Author gzzz
 * @Create 2023/10/11 23:51
 * @Version 1.0
 */
public class TCPTest2 {
    @Test
    public void client(){
        //创建socket
        FileInputStream fis = null;
        Socket socket1 = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            socket1 = new Socket(inetAddress, port);

            //创建File的实例、FileInputStream的实例
            File file = new File("img.png");
            fis = new FileInputStream(file);

            //通过Socket，获取输出流
            os = socket1.getOutputStream();

            //读写数据
            byte[] buffer = new byte[100];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }
            System.out.println("数据发送完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭Socket和相关的流
            try {
                socket1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void server(){
        Socket socket2 = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //创建ServerSocket
            ServerSocket serverSocket = new ServerSocket(9090);

            //接受客户端的socket：accept()
            System.out.println("开始接受数据");
            socket2 = serverSocket.accept();

            //通过Socket获取一个输入流
            is = socket2.getInputStream();

            //创建File类的实例，FileOutputStream
            File file = new File("img_copy.jpg");
            fos = new FileOutputStream(file);

            //读写数据
            byte[] buffer = new byte[100];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("数据接收完毕  ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            try {
                socket2.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
