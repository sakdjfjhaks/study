package com.study.practice.study.locks.condition.model;

public class ModelRun {
    public static void main(String[] args){
        MyModelService myModelService = new MyModelService();

        MySetModelThread mySetModelThread = new MySetModelThread(myModelService);
        mySetModelThread.start();

        MyGetModelThread myGetModelThread = new MyGetModelThread(myModelService);
        myGetModelThread.start();
    }


}
