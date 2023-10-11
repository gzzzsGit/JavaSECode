package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * className: InetAddressTest
 * Package : com.atguigu01.net
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/11 18:56
 * @Version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //getByName(String host):获取指定IP对应的InetAddress实例
            InetAddress inet1 = InetAddress.getByName("192.168.2.1");
            System.out.println(inet1);//  /192.168.2.1

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);//www.baidu.com/220.181.38.149

            //getLocalHost():获取本机IP对应的InetAddress实例
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);//gzzz_desktop/10.129.114.253

            //获取域名和ip
            System.out.println(inet2.getHostName());//www.baidu.com
            System.out.println(inet2.getHostAddress());//220.181.38.149

            //查不到域名返回
            System.out.println(inet1.getHostName());//192.168.2.1
            System.out.println(inet1.getHostAddress());//192.168.2.1
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
