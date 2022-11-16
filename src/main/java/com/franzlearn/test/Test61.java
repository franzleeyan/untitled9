package com.franzlearn.test;

import java.util.Scanner;

/**
 * @author FranzLee
 * @ClassName Test61
 * @date 2022/11/16 09:45
 * @Version 1.0
 */
public class Test61 {
    public static void main(String[] args) {
        /*
        根据不同的分数送不同的礼物。
        如果是95-100分，送自行车一辆
        如果是90-94分，游乐场玩一天
        如果是80-89分，送变形金刚一个
        如果是80分，揍一顿
         */


        //分析：
        //1.键盘输入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("键入本次考试成绩：");
        int score = sc.nextInt();

        //对异常数据进行判断
        //0-100合理数字
        if (score >0 && score <= 100) {
            //2.通过成绩情况判断，给出不同的奖励
            if (score >=95 && score <= 100) {
                System.out.println("送自行车一辆");
            }else if (score >= 90 && score <= 94){
                System.out.println("游乐场玩一天");
            }else if (score >= 80 && score <=89){
                System.out.println("送变形金刚一个");
            }else {
                System.out.println("揍一顿");
            }
        }else {
            System.out.println("输入的成绩不合法");
        }
    }

}
