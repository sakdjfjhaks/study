package com.study.practice.async.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AsyncTask {

    @Scheduled(fixedDelay = 1000)
    @Async("taskExecutor")
    public Future<Boolean> doTask11() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }

    @Scheduled(fixedDelay = 1000)
    @Async("taskExecutor")
    public Future<Boolean> doTask22() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }

    @Scheduled(fixedDelay = 1000)
    @Async("taskExecutor")
    public Future<Boolean> doTask33() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }
}