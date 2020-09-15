package com.study.practice.study.thread.synchronizeds;

import com.study.practice.study.thread.constant.ThreadConstant;

public class MyRunnableSychronizedTest implements Runnable {
    @Override
    public void run() {
            try {
                Thread.sleep(100);
                ThreadConstant.NUM++;
                System.out.println(ThreadConstant.NUM);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
