package com.atguigu01.file.exer2;

import java.io.File;
import java.io.FilenameFilter;

/**
 * className: Exer2
 * Package : com.atguigu01.file.exer2
 * Description:
 *判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 *
 * 提示：File类提供了文件过滤器方法(拓展)
 * public String[] list(FilenameFilter filter)
 * @Author gzzz
 * @Create 2023/10/9 20:02
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\15120\\Desktop\\个人资料");

        String[] strings = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //调用String类的endsWith方法
                if (name.endsWith(".jpg")) {
                    return true;
                }
                return false;
            }
        });

        for (String files:
            strings) {
            System.out.println(files);
        }

    }
}
