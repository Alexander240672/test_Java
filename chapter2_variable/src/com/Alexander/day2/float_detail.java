package com.Alexander.day2;

public class float_detail {
    public static void main(String[] args)
    {
        //java的浮点型常量默认为double型，声明float型常量需后加‘f’或‘F’
        //float num1 = 1.1;->错误的
        float num2 = 1.1F;
        double num3 = 1.1;
        double num4 = 1.1F;//正确的
        //十进制数形式：5.12    512.0f    .512(必须有小数点)
        double num5 = .123;
        System.out.println(num5);
        //科学计数法：5.12e2->5.12*10的2次方   5.12e-2->5.12/10的2次方
        System.out.println(5.12e2);
        System.out.println(5.12e-2);
    }
}
