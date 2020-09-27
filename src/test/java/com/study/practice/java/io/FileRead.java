package com.study.practice.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        System.out.println(fileReader("F:\\wangkun\\1.txt"));
    }

    public static String fileReader(String inFilePath) throws IOException {
        File file = new File(inFilePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String string = bufferedReader.readLine();
        return string;
    }
}
