package com.study.practice.base.utils.processor;

public class Processor {
    /**
     * 获取cpu核心数
     */
    public static Integer getProcessorNum() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {
        System.out.println(Processor.getProcessorNum());
    }
}
