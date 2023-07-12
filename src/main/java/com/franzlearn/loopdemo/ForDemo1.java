package com.franzlearn.loopdemo;

/**
 * @author FranzLee
 * @ClassName ForDemo1
 * @date 2022/11/17 10:58
 * @Version 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        //1.需求打印5次HelloWorld

        //分析：
        //i 1 - 5
        /* for(初始化语句；条件判断语句；条件控制语句){
            循环体；
            }
         */

        //分析：
        //开始条件：1
        //结束条件：5
        for (int i = 1 ; i <= 5; i++ ) {
            //第一次循环：i = 1
            //第二次循环：i = 2
            //i = 1 2 3 4 5
            System.out.println(i);
        }

        //需求2：
        //开始条件：5
        //结束条件：1
        for (int i = 5 ; i >=1 ; i--) {
            //第一次循环：i = 5
            //第二次循环：i = 4
            //i = 5 4 3 2 1
            System.out.println(i);
        }
    }

}
