package com.study.practice.springboot.entityclass.file;

import com.study.practice.base.paramter.constant.FilePathConstant;
import com.study.practice.base.paramter.enums.file.FileEnum;
import com.study.practice.base.utils.file.copy.FileCopyUtil;
import com.study.practice.base.utils.file.copy.FileCreatUtil;

public class DoFile {
    public static void main(String[] args) throws Exception {
        FileCreatUtil.createNewFile(FilePathConstant.CREATE_FILE_PATH, FilePathConstant.CREATE_FILE_SIZE);
        FileCopyUtil.deleteFolderAll();
        FileCopyUtil.fileCopyInfinite(FilePathConstant.CREATE_FILE_PATH);
    }
}
