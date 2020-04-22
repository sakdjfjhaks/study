package com.study.practice.exercises.md5;

public class PasswordUtilTest {
    public static void main(String[] args) throws Exception {
        String key = "4567861295303412";
        String content = "nizhenqiang";
        String contentKey = PasswordUtil.encrypt(content,key,key);
        System.out.println(contentKey);

        String content1 = PasswordUtil.desEncrypt(contentKey,key,key);
        System.out.println(content1);


    }
}
