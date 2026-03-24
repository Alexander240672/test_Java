package com.Alexander.day3;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        //接受用户输入
        //scanner类 表示 简单文本扫描器，在java。util包
        //1.引入/导入 scanner类所在包
        //2.创建scanner对象，new创建一个对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();
        System.out.println("信息如下：");
        System.out.println("name=" + name + " age=" + age + " 1sal=" + sal);
    }
}
