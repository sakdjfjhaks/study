package com.study.practice.study.thread.pools.thread;

public class MyRunnablePriority implements Runnable, Comparable {
    private Integer num;
    private String name;
    private Integer priority;

    public MyRunnablePriority(Integer num, String name, Integer priority) {
        this.num = num;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            Thread.currentThread().setName(name);
            Thread.currentThread().setPriority(priority);
            System.out.println("当前线程的名字为：" + Thread.currentThread().getName() + "优先级为：" + priority);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(Object o) {
        return priority;
    }
}
