package com.study.practice.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        Stream<String> stream6 = map.values().stream();
        System.out.println("stream6:" + stream6.collect(joining()));
    }
}
