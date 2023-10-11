package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * className: TCPTest3
 * Package : com.atguigu02.tcpudp
 * Description:
 *从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 * @Author gzzz
 * @Create 2023/10/12 0:32
 * @Version 1.0
 */
public class TCPTest3 {
    @Test
    public void client(){
        //创建socket
        FileInputStream fis = null;
        Socket socket1 = null;
        OutputStream os = null;
        ServerSocket serverSocket = null;
        FileOutputStream fos =null;
        ByteArrayOutputStream baos = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            socket1 = new Socket(inetAddress, port);

            //创建File的实例、FileInputStream的实例
            File file = new File("TCP3.txt");
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
            socket1.shutdownOutput();
            //接收数据

            InputStream is = socket1.getInputStream();
            fos = new FileOutputStream("res.txt");
            baos = new ByteArrayOutputStream();
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer,0,len);
            }
            baos.writeTo(fos);
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
            try {
                baos.close();
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

    @Test
    public void server(){
        Socket socket2 = null;
        InputStream is = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = null;
        OutputStream os =null;


        try {
            //创建ServerSocket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            ServerSocket serverSocket = new ServerSocket(port);

            //接受客户端的socket：accept()
            System.out.println("开始接受数据");
            socket2 = serverSocket.accept();

            //通过Socket获取一个输入流
            is = socket2.getInputStream();

            //创建File类的实例，FileOutputStream
            File file = new File("TCP3_copy.txt");
            fos = new FileOutputStream(file);
            //读写数据
            byte[] buffer = new byte[100];
            int len;
            baos = new ByteArrayOutputStream();
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer,0,len);
            }
            baos.writeTo(fos);
            System.out.println("数据接收完毕  ");

            //发送信息给客户端
            os = socket2.getOutputStream();
            os.write("发送成功！".getBytes());


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
            try {
                baos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
