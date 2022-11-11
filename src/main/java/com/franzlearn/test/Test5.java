package com.franzlearn.test;

/**
 * @author FranzLee
 * @ClassName Test5
 * @date 2022/11/11 14:41
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
     /* 需求：一座寺庙里面住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
     请用程序实现获取三个和尚的最高身高
      */

        //1.定义三个变量记录三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2.拿第一给和尚和第二个和尚进行比较
        //再拿着结果跟第三个和尚进行比较即可
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
