package com.study.practice.study.thread.singleton.delayload.enums;

public enum  MyObjectEnum {
    MY_OBJECT;
    private MyObject myObject;
     MyObjectEnum(){
         System.out.println("调用次数");
        myObject = new MyObject();
    }
    public MyObject getMyObject(){
         return myObject;
    }
}
