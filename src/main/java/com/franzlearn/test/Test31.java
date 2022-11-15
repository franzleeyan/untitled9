package com.franzlearn.test;

import java.util.Scanner;

/**
 * @author FranzLee
 * @ClassName Test31
 * @date 2022/11/15 19:11
 * @Version 1.0
 */
public class Test31 {
    public static void main(String[] args) {
        /* 需求：键盘录入一个整数，表示身上的钱。
                如果大于等于100，就是网红餐厅。
                否则就吃经济实惠的沙县小吃。
         */

        //分析：
        //1.键盘录入一个整数，表示身上的钱。
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上的钱：");
        int Money = sc.nextInt();
        //2.对钱进行判断(二选一)
        if (Money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }
    }

}
