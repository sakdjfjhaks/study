package com.study.practice.study.thread.singleton.delayload;

public class MyObject {
    private volatile static MyObject myObject;

    private MyObject() {
    }

    //    synchronized public static MyObject getInstance(){
//        try {
//            if(myObject != null){
//
//            }else {
//                Thread.sleep(3000);
//                myObject = new MyObject();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return  myObject;
//    }
    public static MyObject getInstance() {
        try {
//            synchronized (MyObject.class) {
            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
//                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
