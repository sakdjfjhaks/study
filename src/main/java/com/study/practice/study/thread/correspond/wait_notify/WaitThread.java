package com.study.practice.study.thread.correspond.wait_notify;

public class WaitThread extends Thread {
    private MyList list;

    public WaitThread(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            synchronized (list) {
                System.out.println("开始 wait time" + System.currentTimeMillis());
                list.wait();
                System.out.println("结束 wait time" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
