package com.study.practice.study.thread.synchronizeds;

import com.study.practice.study.thread.constant.ThreadConstant;

public class MyRunnableSychronizedTest implements Runnable {
    @Override
    public void run() {
            try {
                ThreadConstant.NUM++;
                System.out.println(ThreadConstant.NUM);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
