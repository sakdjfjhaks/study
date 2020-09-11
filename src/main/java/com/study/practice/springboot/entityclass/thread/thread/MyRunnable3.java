package com.study.practice.springboot.entityclass.thread.thread;

public class MyRunnable3 implements Runnable {
    private Integer num;
    private String name;

    public MyRunnable3(Integer num,String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            Thread.currentThread().setName(name);
            System.out.println(num);
            System.out.println("当前线程的名字为：" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
