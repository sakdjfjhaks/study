package com.study.practice.study.thread.singleton.delayload.enums;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObjectEnum.MY_OBJECT.getMyObject().hashCode());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
