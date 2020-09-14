package com.study.practice.study.thread.pools.factory;

import com.study.practice.study.thread.pools.thread.MyThread;

import java.util.concurrent.ThreadFactory;

public class TestThreadRunnableFactory implements ThreadFactory {
    @Override
    public MyThread newThread(Runnable r) {
        return new MyThread();
    }
}
