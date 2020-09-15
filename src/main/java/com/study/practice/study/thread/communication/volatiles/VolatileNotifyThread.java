package com.study.practice.study.thread.communication.volatiles;

public class VolatileNotifyThread extends Thread {
    private Object lock;

    public VolatileNotifyThread(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                  for(int i=0;i<10;i++){
                      MyList.add();
                      if (MyList.size() == 5){
                          lock.notify();
                          System.out.println("已经发出通知");
                      }
                      System.out.println("添加了"+(i+1)+"个元素");
                      Thread.sleep(1000);
                  }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
