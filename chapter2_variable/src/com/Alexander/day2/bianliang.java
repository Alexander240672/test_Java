package com.Alexander.day2;

public class bianliang {
    public static void main(String[] args)
    {
        //变量必须先声明再使用
        int a = 50;
        System.out.println(a);
        //该区域的数据可以在同一类型范围内不断变化
        //变量在同一个作用域内不能重名->int a = 70是错误的
        a = 80;
        System.out.println(a);
    }
}
