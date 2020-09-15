package com.study.practice.study.thread.communication.volatiles;

public class VolatileTest {
    public static void main(String[] args) {
        Object object = new Object();

        VolatileWaitThread volatileWaitThread = new VolatileWaitThread(object);
        volatileWaitThread.start();

        VolatileNotifyThread volatileNotifyThread = new VolatileNotifyThread(object);
        volatileNotifyThread.start();
    }
}
