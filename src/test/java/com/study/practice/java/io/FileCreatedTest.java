package com.study.practice.java.io;

import com.study.practice.base.utils.SnowFlakeId;

import java.io.*;

public class FileCreatedTest {
    public static void main(String[] args) throws IOException {
        while (true){
            createdFile("F:\\wangkun",80);
        }
    }

    
    /**
     * 创造文件，制定大小和路径
     * */
    public static void createdFile(String outFilePath,int size) throws IOException {
        File file = new File(outFilePath + "\\"+SnowFlakeId.generateID() + ".txt");
        String string = sizeString(size);
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter out = new BufferedWriter(writer)
        ) {
            out.write(string); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
        }
    }


    /**
     * 创造一个十兆大小的String
     * */
    public static String stringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<1024*1024;i++){
            stringBuffer.append(1111111111);
        }
        return stringBuffer.toString();
    }


    /**
     * 创造一个制定兆数的String
     * */
    public static String sizeString(int size){
        if(size>1000||size<0){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<size;i++){
            stringBuffer.append(stringBuffer());
        }
        return stringBuffer.toString();
    }

}
