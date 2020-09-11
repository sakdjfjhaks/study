package com.study.practice.springboot.entityclass.thread.pool;

import com.study.practice.springboot.entityclass.thread.thread.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DiscardOldestPolicyTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(6, 11, 10000L,
                        TimeUnit.MICROSECONDS, new SynchronousQueue<Runnable>(),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );
        for (Integer i = 1; i <= 50; i++) {
            Thread.sleep(50L);
            executor.execute(new MyRunnable1(i));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
