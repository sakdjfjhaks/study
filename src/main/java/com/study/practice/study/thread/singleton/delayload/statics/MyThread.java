package com.study.practice.study.thread.singleton.delayload.statics;

public class MyThread extends  Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
