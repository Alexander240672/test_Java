package com.Alexander.day3;

public class increment_decrement {
    public static void main(String[] args)
    {
        //自增与自减使用方法一样
        //i++ -> 先使用再++
        //++i -> 先++再使用
        int i = 1;
        i = i++;//1.temp = i; 2.i = i + 1; 3.i = temp;
        System.out.println(i);
        int j = 1;
        j = ++j;//1.j = j + 1; 2.temp = j; 3.j = temp;
        System.out.println(j);
    }
}
