package com.franzlearn.test;

/**
 * @author FranzLee
 * @ClassName Test21
 * @date 2022/11/15 17:46
 * @Version 1.0
 */
public class Test21 {
    public static void main(String[] args) {
        //汽车无人驾驶涉及到大量的判断
        //当汽车行驶的时候遇到红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶

        //1.定义三个变量表示灯的状态
        //true 亮 false 灭
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        //2.判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶
        if (isLightGreen){
            System.out.println("GoGoGo!!!");
        }

        if (isLightYellow) {
            System.out.println("Slow!!!");
        }

        if (isLightRed) {
            System.out.println("Stop!!!");
        }
    }

}
