package com.study.practice.study.thread.singleton.delayload.handler;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
