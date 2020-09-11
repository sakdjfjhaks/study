package com.study.practice.springboot.entityclass.thread.thread;

public class MyRunnable1 implements Runnable {
    private Integer num;

    public MyRunnable1(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            System.out.println(num);
            System.out.println("当前线程的名字为：" + Thread.currentThread().getName());
        } catch (Exception e) {

        }
    }
}