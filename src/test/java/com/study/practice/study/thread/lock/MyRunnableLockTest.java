package com.study.practice.study.thread.lock;

import com.study.practice.study.thread.constant.ThreadConstant;

public class MyRunnableLockTest implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            System.out.println(ThreadConstant.FILE_NAME + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
