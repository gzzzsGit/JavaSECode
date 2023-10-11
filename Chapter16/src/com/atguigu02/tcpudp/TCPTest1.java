package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * className: TCPTest1
 * Package : com.atguigu02.tcpudp
 * Description:
 *客户端发送内容给服务端，服务端将内容打印到控制台上。
 * @Author gzzz
 * @Create 2023/10/11 20:49
 * @Version 1.0
 */
public class TCPTest1 {
    @Test
    public void client() {

        //创建一个Socket
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 8989;
            socket = new Socket(inetAddress, port);

            //发送数据
            os = socket.getOutputStream();
            os.write("hello, this is a socket test.".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server(){

        //创建一个ServerSoceket
        int port = 8989;
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream  baos = new ByteArrayOutputStream();//内部维护了一个byte[],写到自己这个数组里

        try {
            serverSocket = new ServerSocket(port);

            //调用accept(),接收客户端的Socket
            System.out.println("服务器已开启");
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            System.out.println("收到了来自"+socket.getInetAddress().getHostName()+"的数据");

            //读写数据
            byte[] buffer = new byte[5];
            int len;
            baos = new ByteArrayOutputStream();
            while ((len = inputStream.read(buffer)) != -1) {
                //错误的，汉字会产生乱码
//                String str = new String(buffer, 0, len);
//                System.out.println(str);
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
            System.out.println("接收完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭开启的各种流
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
