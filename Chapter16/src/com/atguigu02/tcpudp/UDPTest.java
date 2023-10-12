package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * className: UDPTest
 * Package : com.atguigu02.tcpudp
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/12 21:09
 * @Version 1.0
 */
public class UDPTest {
    @Test
    public void sender() throws IOException {
        //创建DatagramSocket实例
        DatagramSocket ds = new DatagramSocket();

        //将数据、IP地址、端口号都封装在DatagramSocket中
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] buffer = "这是一个udp数据报".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer,0, buffer.length, address,port);

        ds.send(packet);

        ds.close();

    }

    @Test
    public void receiver() throws IOException {
        //创建DatagramSocket的实例
        int port = 9090;
        DatagramSocket ds = new DatagramSocket(port);

        //创建数据包的对象
        byte[] buffer = new byte[1024*64];//udp数据包最多发送64kb数据
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        //接收数据
        ds.receive(packet);

        //读取数据，打印
        String str = new String(packet.getData(), 0, packet.getLength());
        System.out.println(str);
    }
}
