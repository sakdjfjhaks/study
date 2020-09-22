package com.study.practice.study.thread.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + System.currentTimeMillis());
        System.out.println("任务执行了，时间为：" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ").format(new Date()));
    }
}
