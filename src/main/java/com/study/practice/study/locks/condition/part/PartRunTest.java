package com.study.practice.study.locks.condition.part;

import com.study.practice.study.locks.condition.MyService;
import com.study.practice.study.locks.condition.MyThreadA;
import com.study.practice.study.locks.condition.MyThreadB;

public class PartRunTest {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.setName("A");
        myThreadA.start();

        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadB.setName("B");
        myThreadB.start();

        Thread.sleep(1000);

        myService.singleAllA();
    }
}
