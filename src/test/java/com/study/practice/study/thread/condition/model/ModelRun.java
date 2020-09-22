package com.study.practice.study.thread.condition.model;

public class ModelRun {
    public static void main(String[] args){
        MyModelService myModelService = new MyModelService();

//        MySetModelThread mySetModelThread = new MySetModelThread(myModelService);
//        mySetModelThread.start();
//
//        MyGetModelThread myGetModelThread = new MyGetModelThread(myModelService);
//        myGetModelThread.start();
        Integer length =1000;
        MySetModelThread[] mySetModelThread = new MySetModelThread[length];
        MyGetModelThread[] myGetModelThread = new MyGetModelThread[length];
        for(int i=0;i<length;i++){
            mySetModelThread[i] = new MySetModelThread(myModelService);
            myGetModelThread[i] = new MyGetModelThread(myModelService);
            mySetModelThread[i].start();
            myGetModelThread[i].start();
        }
    }


}
