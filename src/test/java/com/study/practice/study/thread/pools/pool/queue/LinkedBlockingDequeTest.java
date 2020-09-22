package com.study.practice.study.thread.pools.pool.queue;

import com.study.practice.study.thread.pools.thread.MyRunnable3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(1, 1, 10000L,
                        TimeUnit.MICROSECONDS, new LinkedBlockingDeque<Runnable>(2),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );
        for (Integer i = 1; i <= 7; i++) {
            executor.execute(new MyRunnable3(i, "thread name is:" + i));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
        executor.shutdown();
    }
}
