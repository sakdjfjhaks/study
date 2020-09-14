package com.study.practice.study.thread.lock;

public class ThreadTest {
    public static void main(String[] args) {
        new MyRunnableLockTest().run();
        new MyRunnableLockTest().run();
        new MyRunnableLockTest().run();
    }
}
