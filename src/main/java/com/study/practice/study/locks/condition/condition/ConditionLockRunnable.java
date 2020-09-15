package com.study.practice.study.locks.condition.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionLockRunnable implements Runnable {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    @Override
    public void run() {
        try {
            lock.lock();

            System.out.println("开始线程时间：" + System.currentTimeMillis());
            System.out.println("我陷入了等待............");

            condition.await();
        }catch (Exception e){

        }
        finally {
            lock.unlock();
            System.out.println("释放锁............");
        }
    }

    public void sigle(){
        try{
            lock.lock();
            System.out.println("锁终于被释放了。。。。。。。。。" + System.currentTimeMillis());
            condition.signal();
        }catch (Exception e){

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionLockRunnable conditionLockRunnable = new ConditionLockRunnable();
        Thread thread = new Thread(conditionLockRunnable,"线程1");
        thread.start();
        Thread.sleep(3000);
        conditionLockRunnable.sigle();
    }
}
