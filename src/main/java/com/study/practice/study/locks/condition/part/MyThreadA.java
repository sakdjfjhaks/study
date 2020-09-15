package com.study.practice.study.locks.condition.part;

import com.study.practice.study.locks.condition.part.MyService;

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
