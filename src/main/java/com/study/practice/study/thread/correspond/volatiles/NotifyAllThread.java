package com.study.practice.study.thread.correspond.volatiles;

public class NotifyAllThread extends Thread {

    @Override
    public void run(){
        ThreadService threadService =  new ThreadService();
        threadService.notifyAllMethod();
    }
}
