package com.study.practice.study.thread.correspond.volatiles;

public class ThreadService {
    private Object lock = new Object();
    private MyList myList = new MyList();
    public void waitMethod(){
        try {
            synchronized (lock) {
                if (myList.size() != 5) {
                    System.out.println("开始 wait time   " + System.currentTimeMillis() +"   "+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("结束 wait time   " + System.currentTimeMillis() +"   "+Thread.currentThread().getName());
//                    lock.notify();
//                    System.out.println("已经发出通知");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void notifyMethod(){
        try {
            synchronized (lock) {
                System.out.println("开始 notify time " + System.currentTimeMillis() +"   "+Thread.currentThread().getName());
                for(int i=0;i<10;i++){
                    myList.add();
                    if (myList.size() == 5){
                        lock.notify();
                        System.out.println("已经发出通知");
//                        lock.wait();
//                        System.out.println("已经重新启动");
                    }
                    System.out.println("添加了"+(i+1)+"个元素");
                    Thread.sleep(1000);
                }
                System.out.println("结束 notify time " + System.currentTimeMillis() +"   "+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void interruptMethod(){
        try{
            synchronized (lock){
                System.out.println("begin wait");
                this.lock.wait();
                System.out.println("end wait");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }

    public void notifyAllMethod(){
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
