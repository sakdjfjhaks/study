package com.study.practice.study.thread.correspond.wait_notify;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    volatile static private List<String> list = new ArrayList();

    public static void add() {
        list.add("test");
    }

    public static Integer size() {
        return list.size();
    }
}
