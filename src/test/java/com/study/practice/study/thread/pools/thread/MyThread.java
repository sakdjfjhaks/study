package com.study.practice.study.thread.pools.thread;

public class MyThread extends Thread {
    private Integer i;

    public MyThread(Integer i) {
        this.i = i;
    }

    public MyThread() {

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            System.out.println("this is MyThread:" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
