package com.study.practice.study.locks.condition.model;

public class MyGetModelThread extends Thread {
    private MyModelService myModelService;

    public MyGetModelThread(MyModelService myModelService){
        this.myModelService = myModelService;
    }
    @Override
    public void run(){
        for (int i = 0;i<Integer.MAX_VALUE;i++){
//            myModelService.get();
            myModelService.getMore();
        }
    }
}
