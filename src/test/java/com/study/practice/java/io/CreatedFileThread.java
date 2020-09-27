package com.study.practice.java.io;

import java.io.IOException;

public class CreatedFileThread extends Thread {
    private String outFilePath;
    private int size;
    public CreatedFileThread(String outFilePath, int size){
        this.outFilePath =outFilePath;
        this.size = size;
    }
    @Override
    public void run() {
        try {
            FileCreatedTest.createdFileByPrintWriter(outFilePath,size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
