package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        //目标:面向对象实现只能家居控制系统
        //角色:设备(空调,洗衣机,电视机,吊灯......)
        //具备的功能:打开,关闭
        //谁控制它们:智能控制系统
        //1.定义设备类,创建设备对象
        //2.准备这些设备对象,放到数组中
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视", true);
        jds[1] = new Air("格力空调", true);
        jds[2] = new WashMachine("海尔洗衣机", true);
        jds[3] = new Lamp(" Philips 吊灯", true);
        //3.为每个设备制定开和关的功能,定义一个接口让家电实现开关功能
        //4.创建智能控制系统对象,控制设备开关
        SmartHomeController shc = SmartHomeController.getInstance();
        Scanner sc = new Scanner(System.in);
//        shc.control(jds[0]);
        //展示全部设备的情况
        while (true) {
            shc.showAllStatus(jds);
            System.out.println("请您选择要控制的设备:");

            String choice = sc.next();
            switch(choice){
                case "1":
                    shc.control(jds[0]);
                    break;
                case "2":
                    shc.control(jds[1]);
                    break;
                case "3":
                    shc.control(jds[2]);
                    break;
                case "4":
                    shc.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
