package com.study.practice.study.thread.communication.wait_notify;

public class NotifyThread extends Thread {
    private MyList list;

    public NotifyThread(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            System.out.println("开始 notify time" + System.currentTimeMillis());
            list.notify();
            System.out.println("结束 notify time" + System.currentTimeMillis());
        }
    }
}
