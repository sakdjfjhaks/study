package com.study.practice.study.thread.singleton.delayload.handler;

public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
