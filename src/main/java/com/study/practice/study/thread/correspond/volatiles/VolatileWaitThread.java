package com.study.practice.study.thread.correspond.volatiles;

public class VolatileWaitThread extends Thread {
    private ThreadService threadService;

    public VolatileWaitThread(ThreadService threadService) {
        super();
        this.threadService = threadService;
    }

    @Override
    public void run() {
        threadService.waitMethod();
    }
}
