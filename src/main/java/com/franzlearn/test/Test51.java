package com.franzlearn.test;

import java.util.Scanner;

/**
 * @author FranzLee
 * @ClassName Test51
 * @date 2022/11/15 19:28
 * @Version 1.0
 */
public class Test51 {
    public static void main(String[] args) {
        /*  在实际开发中，电影院选座也会使用到if进行判断
            假设某影院售卖了100张票，票的序号1-100.
            其中奇数票号坐左侧，偶数票号坐右侧
            键盘录入一个整数表示电影票的票号。
            根据不同情况，给出不同的提示：
            如果票号为奇数，那么打印坐左边
            如果票号为偶数，那么打印坐右边
         */

        //分析：
        //1.键盘录入一个整数表示电影票的票号。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个票号：");
        int Ticket = sc.nextInt();
        //只有当Ticket在1-100之间，才是真实有效的票
        //if的嵌套
        if (Ticket >= 1 && Ticket <= 100) {
            //2.判断票号是奇数还是偶数
            if (Ticket % 2 == 1) {
                System.out.println("坐左边");
            }else {
                System.out.println("坐右边");
            }
        }else {
            System.out.println("票号错误");
        }

    }

}
