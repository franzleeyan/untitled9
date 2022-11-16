package com.franzlearn.switchdemo;

/**
 * @author FranzLee
 * @ClassName SwitchDemo1
 * @date 2022/11/16 16:34
 * @Version 1.0
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        //兰州拉面、武汉热干面、北京炸酱面、陕西油泼面

        //1.定义变量记录我心里想吃的面
        String noodle = "兰州拉面";
        //2.拿这个面利用switch跟四种面条匹配
        switch (noodle){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                default :
                    System.out.println("吃方便面");
                    break;
        }
    }

}
