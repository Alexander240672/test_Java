package com.Alexander.day2;

public class autoconvert {
    public static void main(String[] args)
    {
        //自动转化
        //char->int->long->float->double
        //byte->short->int->long->float->double
        int num = 'a';
        double d1 = 80;
        System.out.println(num);
        System.out.println(d1);
        //细节
        //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后计算
        int n1 = 10;
        //float d2 = n1 + 1.1;->错误的，结果类型是double
        double d2 = n1 + 1.1;
        float d3 = n1 + 1.1f;
        //当把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时就会报错，反之就会进行自动类型转换
        //int n2 = 1.1;->错误的
        //（byte，short）和char之间不会相互自动转换
        //byte,short,char三者可运算，在计算时先转换为int
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        //short s2 = b2 + s1;->错的，b2 + s1->int
        int s2 = b2 + s1;
        //byte b4 = b3 + b2;->错的，b3 + b2->int
        //boolean不参与转换
        //自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
    }
}
