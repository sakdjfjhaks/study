package com.study.practice.springboot.entityclass.thread.pool.queue;

import com.study.practice.springboot.entityclass.thread.thread.MyRunnable3;
import com.study.practice.springboot.entityclass.thread.thread.MyRunnablePriority;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(1, 2, 10000L,
                        TimeUnit.MICROSECONDS, new PriorityBlockingQueue<>(3),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );
        for (Integer i = 7; i >= 1; i--) {
            executor.execute(new MyRunnablePriority(i, "thread name is:" + i,i%10));
            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
        }
    }
}
