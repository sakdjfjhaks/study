package com.study.practice.study.thread.pools.thread;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MyDelayedRunnableTest implements Runnable, Delayed {
    private Integer num;
    private String name;

    public MyDelayedRunnableTest(Integer num,String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            Thread.currentThread().setName(name);
            System.out.println(num);
            System.out.println("当前线程的名字为：" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public int compareTo(Delayed o) {
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }
}
