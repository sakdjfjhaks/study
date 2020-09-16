package com.study.practice.study.thread.task;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test2 {
    static class MyTask extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("begin time ：" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end   time ：" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Long nowTime = System.currentTimeMillis();

        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask,new Date(nowTime),3000);
    }
}
