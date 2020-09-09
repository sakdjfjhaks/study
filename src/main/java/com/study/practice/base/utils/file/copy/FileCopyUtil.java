package com.study.practice.base.utils.file.copy;

import com.study.practice.base.paramter.enums.file.FileEnum;
import com.study.practice.base.utils.SnowFlakeId;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

public class FileCopyUtil {

    public static void fileCopy(String inFilePath, String outFilePath) throws IOException {
        File inFile = new File(inFilePath);
        File outFile = new File(outFilePath);
        FileUtils.copyFile(inFile, outFile);
    }
    /**
     * 无限复制文件到磁盘存满
     * */
    public static void fileCopyInfinite() {
        Long startTime=System.currentTimeMillis();   //获取开始时间
        String inFilePath = FileEnum.IN_FILE_PATH.getFilePath();
        String inFileType = inFilePath.substring(inFilePath.lastIndexOf(".")+1);
        File inFile = new File(inFilePath);
        Boolean doBoolean = true;
        while (doBoolean) {
            String outFilePath = FileEnum.OUT_MIDER_PATH_2.getFilePath()+"\\" + SnowFlakeId.generateID() +"."+ inFileType;
            File outFile = new File(outFilePath);
            try {
                FileUtils.copyFile(inFile, outFile);
            } catch (IOException e) {
                doBoolean = false;

                Long endTime=System.currentTimeMillis(); //获取结束时间
                System.out.println("程序运行时间： "+(startTime-endTime)+"ms");
                System.out.println("存满报错");
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        FileCopyUtil.fileCopy("F:\\测试文件\\test.mp4","F:\\file_copy_test\\1.mp4");
        FileCopyUtil.fileCopyInfinite();
    }

}
