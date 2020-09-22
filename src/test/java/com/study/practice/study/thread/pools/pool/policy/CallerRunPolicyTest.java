package com.study.practice.study.thread.pools.pool.policy;

import com.study.practice.study.thread.pools.thread.MyRunnable1;
import com.study.practice.study.thread.pools.thread.MyRunnable2;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallerRunPolicyTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(6, 11, 10000L,
                        TimeUnit.MICROSECONDS, new SynchronousQueue<Runnable>(),
                        new ThreadPoolExecutor.CallerRunsPolicy()
                );
        for (Integer i = 1; i <= 50; i++) {
            if (i <= 11) {
                executor.execute(new MyRunnable1(i));
            }
            if (i > 11) {
                executor.execute(new MyRunnable2(i));
            }
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
