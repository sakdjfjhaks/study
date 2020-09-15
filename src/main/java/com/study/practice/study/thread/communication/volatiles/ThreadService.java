package com.study.practice.study.thread.communication.volatiles;

public class ThreadService {
    private Object lock = new Object();
    private MyList myList = new MyList();
    public void waitMethod(){
        try {
            synchronized (lock) {
                if (myList.size() != 5) {
                    System.out.println("开始 wait time   " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("结束 wait time   " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void notifyMethod(){
        try {
            synchronized (lock) {
                System.out.println("开始 notify time " + System.currentTimeMillis());
                for(int i=0;i<10;i++){
                    myList.add();
                    if (myList.size() == 5){
                        lock.notify();
                        System.out.println("已经发出通知");
                    }
                    System.out.println("添加了"+(i+1)+"个元素");
                    Thread.sleep(1000);
                }
                System.out.println("结束 notify time " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
