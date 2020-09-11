package com.study.practice.springboot.entityclass.thread.pool.policy;

import com.study.practice.springboot.entityclass.thread.thread.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AbortPolicyTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(6, 11, 10000L,
                        TimeUnit.MICROSECONDS, new SynchronousQueue<Runnable>(),
                        new ThreadPoolExecutor.AbortPolicy()
                );
        for (Integer i = 1; i <= 50; i++) {
            executor.execute(new MyRunnable1(i));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
