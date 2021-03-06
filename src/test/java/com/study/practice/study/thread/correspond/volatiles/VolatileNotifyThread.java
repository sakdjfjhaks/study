package com.study.practice.study.thread.correspond.volatiles;

public class VolatileNotifyThread extends Thread {
    private ThreadService threadService;

    public VolatileNotifyThread(ThreadService threadService) {
        super();
        this.threadService = threadService;
    }

    @Override
    public void run() {
        threadService.notifyMethod();
    }
}
