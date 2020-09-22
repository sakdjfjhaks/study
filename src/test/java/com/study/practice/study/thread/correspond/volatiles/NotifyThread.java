package com.study.practice.study.thread.correspond.volatiles;

public class NotifyThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadService threadService = new ThreadService();

        for (int i = 0; i < 10; i++) {
            VolatileWaitThread volatileWaitThread = new VolatileWaitThread(threadService);
            volatileWaitThread.start();
        }
        Thread.sleep(1000);
        for (int j = 0; j < 5; j++) {
            VolatileNotifyThread volatileNotifyThread = new VolatileNotifyThread(threadService);
            volatileNotifyThread.start();
            Thread.sleep(1000);
        }
    }
}
