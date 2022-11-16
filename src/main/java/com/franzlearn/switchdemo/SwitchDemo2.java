package com.franzlearn.switchdemo;

/**
 * @author FranzLee
 * @ClassName SwitchDemo2
 * @date 2022/11/16 19:19
 * @Version 1.0
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        /* default的位置和省略
            1.位置
            2.省略
         */

        int number = 100;
        switch (number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1，10或者20");
                break;
        }
    }

}
