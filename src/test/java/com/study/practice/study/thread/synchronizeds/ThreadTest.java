package com.study.practice.study.thread.synchronizeds;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( new MyRunnableSychronizedTest());
        Thread thread2 = new Thread( new MyRunnableSychronizedTest());
        Thread thread3 = new Thread( new MyRunnableSychronizedTest());
        Thread thread4 = new Thread( new MyRunnableSychronizedTest());
        Thread thread5 = new Thread( new MyRunnableSychronizedTest());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
