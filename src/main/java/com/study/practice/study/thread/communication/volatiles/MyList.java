package com.study.practice.study.thread.communication.volatiles;

import java.util.ArrayList;
import java.util.List;

public class MyList {
     volatile private List<String> list = new ArrayList();

    public  void add() {
        list.add("test");
    }

    public  Integer size() {
        return list.size();
    }
}
