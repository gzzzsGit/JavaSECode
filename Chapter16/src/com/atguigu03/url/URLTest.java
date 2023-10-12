package com.atguigu03.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * className: URLTest
 * Package : com.atguigu03.url
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/12 22:14
 * @Version 1.0
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/examples/hello.txtd");
            System.out.println(url.getProtocol());//http
            System.out.println(url.getHost());//localhost
            System.out.println(url.getPort());//8080
            System.out.println(url.getPath());// /examples/hello.txtd
            System.out.println(url.getFile());// /examples/hello.txtd
            System.out.println(url.getQuery());//null
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
