package com.study.practice.study.thread.pools.pool;

import com.study.practice.study.thread.pools.factory.TestThreadRunnableFactory;
import com.study.practice.study.thread.pools.thread.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(6, 11, 10000L,
                        TimeUnit.MICROSECONDS, new SynchronousQueue<Runnable>(), new TestThreadRunnableFactory(),
                        new ThreadPoolExecutor.CallerRunsPolicy()
                );
        for (Integer i = 1; i <= 50; i++) {
            executor.execute(new MyRunnable1(i));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
