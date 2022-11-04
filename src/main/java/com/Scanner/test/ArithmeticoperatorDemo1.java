package com.Scanner.test;

/**
 * @author lin
 * @date 2022/11/03/17:05
 */
public class ArithmeticoperatorDemo1 {
    //主入口
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);
        //-
        System.out.println(5 - 1);
        //shift + 数字8
        System.out.println(7 * 9);

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与计算，结果有可能不精确的；
        //为什么呢？
        //暂时只要知道这个结论就可以了
        //具体的原因，我们到了JaveSE的时候，会再详细的讲解
        System.out.println(1.1 + 1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);


    }
}
