package com.study.practice.study.thread.unsafe;

import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{
                "2000-01-02",
                "2001-01-01",
                "2000-03-03",
                "2033-01-06",
                "2000-10-08",

                "2100-10-08",
                "2300-10-08",
                "2400-10-08",
                "2500-10-08",
                "2000-01-09"
        };

        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(simpleDateFormat, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
