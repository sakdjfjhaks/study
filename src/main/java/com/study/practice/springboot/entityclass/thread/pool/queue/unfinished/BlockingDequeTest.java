package com.study.practice.springboot.entityclass.thread.pool.queue.unfinished;

import com.study.practice.springboot.entityclass.thread.thread.MyRunnable3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockingDequeTest {
//    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor executor =
//                new ThreadPoolExecutor(1, 2, 10000L,
//                        TimeUnit.MICROSECONDS,
//                        new BlockingDeque<Runnable>(3),
//                        new ThreadPoolExecutor.DiscardOldestPolicy()
//                );
//        for (Integer i = 1; i <= 7; i++) {
//            executor.execute(new MyRunnable3(i, "thread name is:" + i));
//            System.out.println("当前线程池的数量为：" + executor.getPoolSize());
//        }
//    }
}
