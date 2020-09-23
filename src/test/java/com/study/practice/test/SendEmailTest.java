package com.study.practice.test;

import com.study.practice.entity.async.task.AsyncTask;
import com.study.practice.entity.email.Email;
import com.study.practice.entity.email.SendEmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SendEmailTest {

    @Autowired
    private SendEmailService sendEmailService;

    @Test
    public void test1() throws Exception {
        Email email = new Email();
        email.setContent("test");
        email.setSubject("test");
        email.setFromEmailUser("1449377343@qq.com");
        String[] emailUsers = {
                "1449377343@qq.com",
                "2077449456@qq.com",
        };
        email.setToEmailUsers(emailUsers);
        sendEmailService.sendSimpleEmail(email);
    }

    @Test
    public void test2() throws Exception {
        Email email = new Email();
        email.setContent("test");
        email.setSubject("test");
        email.setFromEmailUser("1449377343@qq.com");
        String[] emailUsers = {
                "1449377343@qq.com",
                "2077449456@qq.com",
        };
        email.setToEmailUsers(emailUsers);

        String[] filePaths = {
                "F:\\测试文件\\1.pdf",
                "F:\\测试文件\\2.jpg",
        };
        email.setFilePathArray(filePaths);
        sendEmailService.staticEmail(email);
    }
}
