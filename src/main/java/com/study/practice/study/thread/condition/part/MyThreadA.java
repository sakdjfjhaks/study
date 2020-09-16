package com.study.practice.study.thread.condition.part;

public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.awaitA();
    }
}
