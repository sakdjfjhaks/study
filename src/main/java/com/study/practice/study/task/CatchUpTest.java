package com.study.practice.study.task;

import java.util.Date;
import java.util.Timer;

public class CatchUpTest {
    public static void main(String[] args){
        MyTask myTask = new MyTask();

        Long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为：" + nowTime);

        Long schedulerTime = (nowTime - 20000);
        System.out.println("计划时间为：" + schedulerTime);

        Timer timer = new Timer();
        timer.schedule(myTask,new Date(schedulerTime),2000);
//        timer.scheduleAtFixedRate(myTask,new Date(schedulerTime),2000);

    }
}
