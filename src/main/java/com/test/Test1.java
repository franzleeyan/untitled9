package com.test;

import java.util.Scanner;

/**
 * @author lin
 * @date 2022/11/03/19:04
 */
public class Test1 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数");
        int number = sc.nextInt();
        //2.获取个位，十位，百位
        //公式：
        //个位：   数字 % 10
        //十位：   数字 / 10 % 10
        //百位：   数字 / 10 / % 10
        //...
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;
        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
    }
}
