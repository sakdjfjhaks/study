package com.study.practice.study.thread.pools.thread;

public class MyRunnable2 implements Runnable {
    private Integer num;

    public MyRunnable2(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
            System.out.println(num);
            System.out.println("当前线程的名字为：" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
