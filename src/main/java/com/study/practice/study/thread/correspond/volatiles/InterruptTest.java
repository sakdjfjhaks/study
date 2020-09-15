package com.study.practice.study.thread.correspond.volatiles;

public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();

        Thread.sleep(5000);

        interruptThread.interrupt();
    }
}
