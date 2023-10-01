package com.atguigu05.other;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * className: OtherAPITest
 * Package : com.atguigu05.other
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/27 20:44
 * @Version 1.0
 */
public class OtherAPITest {
    @Test
    public void test1(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的版本号："+javaVersion);// java的版本号：17.0.7

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home："+javaHome); //C:\Program Files\Java\jdk-17

        String osnName = System.getProperty("os.name");
        System.out.println("操作系统的名称："+osnName);//Windows 11

        String osVersion = System.getProperty("os.version");
        System.out.println("操作系统的版本号："+osVersion);//10.0

        String userName = System.getProperty("user.name");
        System.out.println("用户名："+userName);//15120

        String userHome = System.getProperty("user.home");
        System.out.println("用户的home："+userHome);//C:\Users\15120

        String userDir = System.getProperty("user.dir");
        System.out.println("用户工作目录："+userDir);//D:\code\workspace_learn\JavaSECode\Chapter11

        System.gc();
    }
    
    @Test
    public void test2(){
        Runtime runtime = Runtime.getRuntime();
        long initialMemory = runtime.totalMemory();//:返回Java虚拟机中初始化时的内存总量。此方法返回的值可能随时间的推移而变化，这取决于主机环境。默认方为[理电脑内存的1/64。
        long maxMemory = runtime.maxMemory();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str+=1;
        }
        long freeMemory = runtime.freeMemory();

        System.out.println("总内存："+initialMemory/1024/1024*64+"MB");
        System.out.println("总内存："+maxMemory/1024/1024*4+"MB");
        System.out.println("剩余内存："+freeMemory/1024/1024+"MB");
        System.out.println("已用内存："+(initialMemory-freeMemory)/1024/1024+"MB");
    }
    
    @Test
    public void test3(){
        //四舍五入，负数相反，即floor(x+0.5)
        System.out.println(Math.round(12.3));//12
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(-12.3));//-12
        System.out.println(Math.round(-12.5));//-12

        //取绝对值absolute
        System.out.println(Math.abs(-12.2));//12.2

        //返回大于等于参数的最小整数
        System.out.println(Math.ceil(12.2));//13.0

        //返回小于等于参数的最大整数
        System.out.println(Math.floor(12.2));//12.0
    }

    @Test
    public void test4(){
        BigInteger b1 = new BigInteger("70465463436436543646354365");
        BigInteger b2 = new BigInteger("1148774864135135135456322");
        System.out.println(b1.divide(b2));//61
        System.out.println(b1.remainder(b2));//390196724193300383518723 取余数
    }

    @Test
    public void test5(){
        BigDecimal b1 = new BigDecimal("13216533414124.1354164432546435135");
        BigDecimal b2 = new BigDecimal("1531551255151.544564564356");
        System.out.println(b1.divide(b2,BigDecimal.ROUND_HALF_UP));//8.6295077423421786973,除不尽四舍五入
        System.out.println(b1.divide(b2,15,BigDecimal.ROUND_HALF_UP));//8.629507742342179 保留指定位小数
    }
    
    @Test
    public void test6(){
        Random random = new Random();
        System.out.println(random.nextInt());//返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的int值。

        int i = random.nextInt(10);
        System.out.println(i);//设定上界，此时范围是[0,10)
    }

    @Test
    public void test(){
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 ==s2);
    }
}
