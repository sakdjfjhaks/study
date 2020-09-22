package com.study.practice.study.thread.singleton.delayload;

public class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
