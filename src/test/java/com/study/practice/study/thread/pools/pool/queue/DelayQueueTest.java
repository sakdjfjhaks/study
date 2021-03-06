package com.study.practice.study.thread.pools.pool.queue;

import com.study.practice.study.thread.pools.thread.MyDelayedRunnableTest;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue delayQueue = new DelayQueue();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(1, 2, 10000L,
                        TimeUnit.MICROSECONDS, delayQueue
                );
        executor.prestartAllCoreThreads();
        for (Integer i = 1; i <= 7; i++) {
            executor.execute(new MyDelayedRunnableTest(i, "thread name is:" + i));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
