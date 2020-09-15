package com.study.practice.study.thread.communication.wait_notify;

public class WaitNotifyTest {
    public static void main(String[] args) throws InterruptedException {
        MyList myList = new MyList();

        WaitThread volatileThread1 = new WaitThread(myList);
        volatileThread1.start();

        Thread.sleep(3000);

        NotifyThread volatileThread2 = new NotifyThread(myList);
        volatileThread2.start();
    }
}
