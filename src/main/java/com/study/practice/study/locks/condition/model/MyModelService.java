package com.study.practice.study.locks.condition.model;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyModelService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        try {
            lock.lock();
            if(hasValue == true){
                condition.await();
            }
            System.out.println("set 打印★");
            hasValue = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void get(){
        try {
            lock.lock();
            if(hasValue == false){
                condition.await();
            }
            System.out.println("get 打印☆");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void setMore(){
        try {
            lock.lock();
            while (hasValue == true){
                System.out.println("有可能★★连续");
                condition.await();
            }
            System.out.println("set 打印★");
            hasValue = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void getMore(){
        try {
            lock.lock();
            while (hasValue == false){
                System.out.println("有可能☆☆连续");
                condition.await();
            }
            System.out.println("get 打印☆");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
