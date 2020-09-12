package com.study.practice.base.paramter.enums.file;

public enum  FileEnum {
    IN_FILE_PATH("F:\\测试文件\\test.mp4"),
    OUT_MIDER_PATH("F:\\file_copy_test_2"),
    OUT_MIDER_PATH_2("G:");
    private String filePath;

    FileEnum(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
