package com.study.practice.study.thread.condition.model;

public class MySetModelThread extends  Thread {

    private MyModelService myModelService;

    public MySetModelThread(MyModelService myModelService){
        this.myModelService = myModelService;
    }
    @Override
    public void run(){
        for (int i = 0;i<Integer.MAX_VALUE;i++){
//            myModelService.set();
            myModelService.setMore();
        }
    }
}
