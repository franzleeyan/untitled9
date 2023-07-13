package com.franzlearn.Ternaryoperator;

/**
 * @author FranzLee
 * @ClassName TernaryoperatorDemo1
 * @date 2022/11/11 09:47
 * @Version 1.0
 */
public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //需求：使用三元运算符，获取两个数的较大值

        //分析：
        //1。定义两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;

        //2.使用三元运算符获取两个整数的最大值
        //格式：   关系表达式 ？ 表达式1 ： 表达式2；
        //整个三元运算符的结果必须要被使用
        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);

        System.out.println(number1 > number2 ? number1 : number2);
    }

}
