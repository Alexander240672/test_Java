package com.Alexander.day3;

public class ternary {
    public static void main(String[] args)
    {
        //三元运算符
        //条件表达式 ? 表达式1 : 表达式2
        //如果条件表达式为true，运算后的结果为表达式1
        //如果条件表达式为false，运算后的结果为表达式2
        int a = 10;
        int b = 99;
        //a > b为false
        //b--先返回b的值再b-1
        //返回结果为99
        int result = a > b ? a++ : b--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        //细节
        //表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换或强制转换）
        //三元运算符可以转成if-else
        int c = 3;
        int d = 8;
        int e = a > b ? (int)1.1 : (int)3.4;
        System.out.println(e);
        //int e = a > b ? 1.1 : 3.4;错误的，double类型赋值给int类型
        double f = a > b ? a : b + 3;//正确
        System.out.println(f);
        //实例求三个数最大数
        int n1 = 553;
        int n2 = 33;
        int n3 = 123;
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数=" + max2);
        //一条语句实现
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println("最大数=" + max);
    }
}
