package com.study.practice.study.thread.communication.volatiles;

public class VolatileWaitThread extends Thread {
    private Object lock;

    public VolatileWaitThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("开始 wait time " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("结束 wait time " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
