package com.study.practice.study.thread.communication.volatiles;

public class VolatileTest {
    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();

        VolatileWaitThread volatileWaitThread = new VolatileWaitThread(threadService);
        volatileWaitThread.start();

        VolatileNotifyThread volatileNotifyThread = new VolatileNotifyThread(threadService);
        volatileNotifyThread.start();
    }
}
