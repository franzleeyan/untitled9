package com.franzlearn.test;

import java.util.Scanner;

/**
 * @author FranzLee
 * @ClassName Test41
 * @date 2022/11/15 19:18
 * @Version 1.0
 */
public class Test41 {
    public static void main(String[] args) {
        /* 在实际开发中，如果要根据两种不同的情况，来执行不同的代码，就需要用到if的第二种格式
        需求：
        假设，用户在超市实际购买，商品总价为：600元。
        键盘录入一个整数表示用户实际支付的钱。
        如果付款大于等于600，表示付款成功，否则付款失败。
         */

        //分析：
        //1.键盘录入一个整数表示用户实际支付的钱。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你支付钱的总额：");
        //System.out.print("请输入你支付钱的总额：");
        int Money = sc.nextInt();
        //2.判断
        if (Money >= 600) {
            System.out.println("付款成功");
        }   else {
            System.out.println("付款失败");
        }
    }

}
