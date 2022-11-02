package com.java.learn;

/** 定义变量VariableTest
 * @author franzlee*/
public class VariableTest {
    /** 主入口 */
    public static void main(String[] args) {
        // 开始一个乘客都没有 */
        int count = 0;
        //第一站：上去一个乘客
        //在原有基础上 + 1
        count = count + 1;
        // System.out.println(count);
        // 第二站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第三站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第四站：下来一位乘客
        count = count - 1;
        // 第五站：上来一位乘客
        count = count + 1;
        // 请问：到了终点站，车上一共几位乘客
        System.out.println(count);

    }
}
