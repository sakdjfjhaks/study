package com.study.practice.study.thread.task;

import java.util.Timer;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为：" + nowTime);

        Long schedulerTime = (nowTime + 5000);
        System.out.println("计划时间为：" + System.currentTimeMillis());

        MyTask myTask = new MyTask();

//        Timer timer1 = new Timer();
//        timer1.schedule(myTask,new Date(schedulerTime));

//        Timer timer2 = new Timer();
//        timer2.schedule(myTask,new Date(schedulerTime),4000);

//        Timer timer3 = new Timer();
//        timer3.schedule(myTask,4000);

        Timer timer4 = new Timer();
        timer4.schedule(myTask,4000,4000);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
