package com.Alexander.day3;

public class logic {
    public static void main(String[] args)
    {
        //&& 短路与 两个条件都为true，结果为true，其他情况false
        //如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高
        int age = 50;
        if(age > 20 && age < 90)
        {
            System.out.println("OK100");
        }
        //& 逻辑与 两个条件都为true，结果为true，其他情况false
        //不管第一个条件是否为false，第二个条件都会判断，效率低
        if(age > 20 & age < 90)
        {
            System.out.println("OK200");
        }
        //区别
        //对于&&而言，第一个条件为false，则第二个条件不会判断
        int a = 4;
        int b = 9;
        if(a < 1 && ++b < 50)
        {
            System.out.println("OK300");
        }
        System.out.println("a = " + a + " b = " + b);
        //对于&而言，第一个条件为false，第二个条件都会判断
        if(a < 1 & ++b < 50)
        {
            System.out.println("OK400");
        }
        System.out.println("a = " + a + " b = " + b);

        //|| 短路或 两个条件只要有一个成立，结果为true，否则为false
        //如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
        //| 逻辑或 只要有一个条件成立，结果为true，否则为false
        //不管第一个条件是否为true，第二个条件都会判断，效率低
        if(age > 20 || age < 30)
        {
            System.out.println("OK500");
        }
        if(age > 20 | age < 30)
        {
            System.out.println("OK600");
        }
        //区别
        //|| 短路或 如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
        if(a > 1 || ++b > 4)
        {
            System.out.println("OK700");
        }
        System.out.println("a = " + a + " b = " + b);
        //| 逻辑或 不管第一个条件是否为true，第二个条件都会判断，效率低
        if(a > 1 | ++b > 4)
        {
            System.out.println("OK800");
        }
        System.out.println("a = " + a + " b = " + b);

        //! 取反 如果条件成立，结果为false，否则为true
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));

        //a^b 逻辑异或 当a与b不同时，则结果为true，否则为false
        boolean c = (10 > 1) ^ (3 < 5);
        boolean e = (10 < 1) ^ (3 < 5);
        System.out.println("c = " + c);
        System.out.println("e = " + e);
    }
}
