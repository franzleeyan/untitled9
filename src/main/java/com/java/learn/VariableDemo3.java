package com.java.learn;

/**
 * @author lin
 * @date 2022/11/02/12:46
 */
public class VariableDemo3 {
    //主入口
    public static void main(String[] args) {
        //byte
        byte b = 10;
        //打印b，等于10
        System.out.println(b);
        //short
        short s = 20;
        //打印s，等于20
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long类型的变量
        //在数值的后面需要加一个L作为后缀
        //L可以是大写，也可以是小写的。
        //建议：使用大写
        long n = 9999999999L;
        System.out.println(n);


        //float
        //注意点：定义float类型变量的时候
        //数值也需要加一个F作为后缀
        float f = 10.1F;
        System.out.println(f);
        //double
        double d = 20.2;
        System.out.println(d);

        //char
        char c = '中';
        System.out.println(c);

        //boolean
        //true false
        boolean o = true;
        System.out.println(o);


    }
}
