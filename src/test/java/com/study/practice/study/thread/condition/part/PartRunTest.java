package com.study.practice.study.thread.condition.part;

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
