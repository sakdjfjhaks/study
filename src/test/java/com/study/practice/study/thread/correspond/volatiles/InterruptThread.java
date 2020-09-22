package com.study.practice.study.thread.correspond.volatiles;

public class InterruptThread extends Thread {

    public InterruptThread() {
    }

    @Override
    public void run() {
        ThreadService threadService = new ThreadService();
        threadService.interruptMethod();
    }
}
