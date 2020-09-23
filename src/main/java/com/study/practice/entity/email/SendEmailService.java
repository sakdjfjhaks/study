package com.study.practice.entity.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class SendEmailService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendSimpleEmail(Email email){
        //创建简单邮件消息
        SimpleMailMessage message = new SimpleMailMessage();
        //谁发的
        message.setFrom(email.getFromEmailUser());
        //谁要接收
        message.setTo(email.getToEmailUsers());
        //邮件标题
        message.setSubject("hello");
        //邮件内容
        message.setText("first email");
        try {
            mailSender.send(message);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }

    public void staticEmail(Email email) {
        //创建一个MINE消息
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
            //谁发
            mimeMessageHelper.setFrom(email.getFromEmailUser());
            //谁接收
            mimeMessageHelper.setTo(email.getToEmailUsers());
            //邮件主题
            mimeMessageHelper.setSubject(email.getSubject());
            //邮件内容   true 表示带有附件或html
            //邮件内容拼接
            String content =
                    "<html><body><img width='250px' src=\'cid:" + "\'>" + email.getContent()
                            + "</body></html>";
            mimeMessageHelper.setText(content, true);
            //蒋 multpartfile 转为file

            //添加内联资源，一个id对应一个资源，最终通过id来找到该资源
            Integer length = email.getFilePathArray().length;
            if(length>0){
                for(int i=0;i<length;i++){
                    File file = new File(email.getFilePathArray()[i]);
                    mimeMessageHelper.addInline(String.valueOf(i), file);
                }
            }

            mailSender.send(message);
        } catch ( MessagingException e) {
        }
    }

}
