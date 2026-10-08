package com.itheima.demo;

public class SmartHomeController {
    private SmartHomeController(){

    }
    public static final SmartHomeController instance    = new SmartHomeController();
    public static SmartHomeController getInstance() {
        return instance;
    }
    public void control(JD jd) {
        System.out.println(jd.getName() + "目前状态是:" + (jd.isStatus()?"开启":"关闭"));
        System.out.println("开始控制设备");
        jd.press();
        System.out.println(jd.getName() + "状态已经是:" + (jd.isStatus()?"开启":"关闭"));
    }

    public void showAllStatus(JD[] jds) {
        for (int i = 0; i < jds.length; i++) {
            System.out.println((i+1) + "." + jds[i].getName() + "目前状态是:" + (jds[i].isStatus()?"开启":"关闭"));
        }
    }
}
