package com.study.practice.java.io;

import com.study.practice.base.utils.SnowFlakeId;
import com.study.practice.entity.addtest.AddTest;

import java.io.*;

public class ObjectStream {

    public static void main(String[] args) {
        ObjectStream l = new ObjectStream();
        String filePath = "F:\\666\\" + SnowFlakeId.generateID() +".txt";
        AddTest addTest = new AddTest(1L,"你好");
        System.out.println(addTest.toString());

        l.writerStream(filePath,addTest);
        System.out.println(l.readerStream(filePath));
    }

    public <T> void writerStream (String filePath,T t) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> Object readerStream(String filePath){
        try {
            FileInputStream fileOutputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return (T)object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
