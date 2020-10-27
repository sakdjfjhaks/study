package com.study.practice.entity.upload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        String filePath = "F:\\upload\\";

        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
        }
        return "上传失败！";
    }

    @RequestMapping(value = "download")
    public void download(@RequestParam("fileName") String filename) throws IOException {

    }
}
