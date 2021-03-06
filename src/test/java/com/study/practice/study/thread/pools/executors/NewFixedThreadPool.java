package com.study.practice.study.thread.pools.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NewFixedThreadPool {
    public static void main(String[] args) {
        newFixedThreadPool();
    }

    public static void newFixedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newFixedThreadPool(66);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            //我们在等执行下一线程的时候，在此等待1S，等前一个线程执行完成
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getId() + "==>" + index);
                }
            });
            System.out.println("当前线程池中线程数量" + ((ThreadPoolExecutor) cachedThreadPool).getPoolSize());
        }
    }
}
