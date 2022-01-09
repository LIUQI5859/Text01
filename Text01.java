package com.itheima;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        
    while (true) {
        
        System.out.println("请输入星期数:[1-7]");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("今天的减肥活动是跑步！！！");
        }else if (number == 2) {
            System.out.println("今天的减肥活动是游泳！！！");
        }else if (number == 3 ){
            System.out.println("今天的减肥活动是慢走！！！");
        }else if (number == 4) {
            System.out.println("今天的减肥活动是骑动感单车！！！");
        }else if (number == 5) {
            System.out.println("今天的减肥活动是打拳击！！！");
        }else if (number == 6) {
            System.out.println("今天的减肥活动是爬山！！！");
        }else if (number == 7){
            System.out.println("今天是星期天哦，不用运动，可以好好吃一顿！！！");
        }else {
            System.out.println("您输入的数字不符合规定");
        }
    }
    }
}
