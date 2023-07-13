package com.franzlearn.scanner;

/*
  @author lin
 * @date 2022/11/02/16:00
 */

//1.导包，找到Scanner这个类在哪儿
//书写要注意：要写在类定义的上面
import java.util.Scanner;

/**
 * @author franzlee
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        //2.创建对象，标识现在准备要用Scanner这个类
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数：");

        /*
        3.接收数据
        变量i记录了键盘录入的数据
        */
        int i = sc.nextInt();

        //4.打印i输入的内容信息
        System.out.println(i);
    }
}
