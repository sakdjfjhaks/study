package com.study.practice.study.thread.pools.pool.queue;

import com.study.practice.study.thread.pools.thread.MyRunnablePriority;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(1, 2, 10000L,
                        TimeUnit.MICROSECONDS, new PriorityBlockingQueue<>(),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );
        for (Integer i = 10; i >= 1; i--) {
            executor.execute(new MyRunnablePriority(i, "thread name is:" + i, i));
            System.out.println("进入线程池的顺序：" + i);
        }
    }
}
