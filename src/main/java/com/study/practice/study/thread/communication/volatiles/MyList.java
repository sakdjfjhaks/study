package com.study.practice.study.thread.communication.volatiles;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    static private List<String> list = new ArrayList();

    public static void add() {
        list.add("test");
    }

    public static Integer size() {
        return list.size();
    }
}
