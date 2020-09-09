package com.study.practice.base.utils.file.copy;

import com.study.practice.base.paramter.constant.FilePathConstant;
import com.study.practice.base.paramter.enums.file.FileEnum;
import com.study.practice.base.utils.SnowFlakeId;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

public class FileCopyUtil {

    /**
     * 无限复制文件到磁盘存满
     * */
    public static void fileCopyInfinite(String inFilePath) {
        Long startTime=System.currentTimeMillis();   //获取开始时间
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
                System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
                System.out.println("存满报错");
            }
        }
    }
    /**
     * 根据路径删除文件以及文件夹
     * */
    public static void deleteFolder(){
        File file = new File(FileEnum.OUT_MIDER_PATH_2.getFilePath());
        deleteFile(file);
    }
    /**
     * 批量删除文件以及文件夹
     * */
    public static void deleteFolderAll(){
        for(String filePath: FilePathConstant.FILE_PATHS_CONSTANT){
            File file = new File(filePath);
            deleteFile(file);
        }

    }
    /**
     * 删除文件夹以及子文件
     * */
    public static void deleteFile(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files!=null){
                for(File fileDelete:files){
                    if(fileDelete.isDirectory()){
                        deleteFile(fileDelete);
                    }
                    fileDelete.delete();
                }
            }
        }
        file.delete();
    }
}
