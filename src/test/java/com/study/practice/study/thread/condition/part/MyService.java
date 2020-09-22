package com.study.practice.study.thread.condition.part;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin await A 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end await A 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin await B 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end await B 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void singleAllA() {
        try {
            lock.lock();
            System.out.println("singleAllA 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void singleAllB() {
        try {
            lock.lock();
            System.out.println("singleAllB 时间为：  " + System.currentTimeMillis()
                    + " Thread name:" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
