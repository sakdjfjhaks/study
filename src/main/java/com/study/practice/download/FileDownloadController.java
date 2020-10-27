package com.study.practice.download;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class FileDownloadController {
    @Autowired
    private FileDownloadService fileDownloadService;
    @RequestMapping("/download1")
    public HttpServletResponse download(@RequestParam String fileName,HttpServletResponse response){
         return    fileDownloadService.download1(fileName,response);
    }
    @RequestMapping("/download")
    public void download(@RequestParam String fileName,HttpServletResponse response,@RequestParam boolean isOnLine) throws Exception {
        fileDownloadService.downLoad(fileName,response,isOnLine);
    }
    @RequestMapping("/downloadNet")
    public void downloadNet(HttpServletResponse response) throws Exception {
        fileDownloadService.downloadNet(response);
    }
}
