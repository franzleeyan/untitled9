package com.franzlearn.arithmeticoperator;

/**
 * @author FranzLee
 * @ClassName ArithmeticoperatorDemo5
 * @date 2023/7/14 14:54
 * @Version 1.0
 */
public class ArithmeticoperatorDemo5 {
    public static void main(String[] args) {
        //++ 和 --
        int a = 10;
        //表示把变量a里面的值+1
        a++;
        System.out.println(a);
        //结果 = 11

        //表示把变量a里面的值+1
        ++a;
        System.out.println(a);
        //结果 = 12

        //表示把变量a里面的值-1
        --a;
        System.out.println(a);
        //结果 = 11

        //表示把变量里面的结果-1
        --a;
        System.out.println(a);
        //结果 = 10


    }

}
