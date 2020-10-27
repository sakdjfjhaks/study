package com.study.practice;

import com.study.practice.entity.upload.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//开启异步调用方法
@EnableAsync
//开启定时任务
//@EnableScheduling
@EnableConfigurationProperties({FileStorageProperties.class})
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

}
