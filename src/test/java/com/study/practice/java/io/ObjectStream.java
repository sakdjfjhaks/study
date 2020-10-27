package com.study.practice.java.io;

import com.study.practice.base.utils.SnowFlakeId;
import com.study.practice.entity.addtest.AddTest;

import java.io.*;

public class ObjectStream {

    public static void main(String[] args) {
        ObjectStream objectStream = new ObjectStream();
        String filePath = "F:\\666\\" + SnowFlakeId.generateID() +".txt";
        AddTest addTest = new AddTest(1L,"你好");
        System.out.println(addTest.toString());
        String s = "dasd";
        objectStream.writerStream(filePath,addTest);
        objectStream.writerStream(filePath,s);
        System.out.println(objectStream.readerStream(filePath));
    }

    public <T> void writerStream (String filePath,T t) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> Object readerStream(String filePath){
        try {
            FileInputStream fileOutputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
            T value = (T) objectInputStream.readObject();
            objectInputStream.close();
            return value;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
