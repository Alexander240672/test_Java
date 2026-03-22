package com.Alexander.day2;

public class jia_hao_de_shi_yong {
    //当加号左右两边都是数值型时，则做加法运算
    //当加号左右两边有字符串时。则做拼接运算
    //运算顺序是从左到右
    public static void main(String[] args)
    {
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 98 + "hello");
        System.out.println("hello" + 100 + 98);
    }
}
