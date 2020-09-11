package com.study.practice.springboot.entityclass.thread.factory;

import com.study.practice.springboot.entityclass.thread.thread.MyThread;

import java.util.concurrent.ThreadFactory;

public class TestThreadRunnableFactory implements ThreadFactory {
    @Override
    public MyThread newThread(Runnable r) {
        return new MyThread();
    }
}
