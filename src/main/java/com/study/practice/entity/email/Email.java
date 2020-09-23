package com.study.practice.entity.email;

public class Email {
    private String fromEmailUser;
    private String[] toEmailUsers;
    private String subject;
    private String content;
    private String filePath;
    private String[] filePathArray;

    public Email() {
    }

    public String getFromEmailUser() {
        return fromEmailUser;
    }

    public void setFromEmailUser(String fromEmailUser) {
        this.fromEmailUser = fromEmailUser;
    }

    public String[] getToEmailUsers() {
        return toEmailUsers;
    }

    public void setToEmailUsers(String[] toEmailUsers) {
        this.toEmailUsers = toEmailUsers;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String[] getFilePathArray() {
        return filePathArray;
    }

    public void setFilePathArray(String[] filePathArray) {
        this.filePathArray = filePathArray;
    }
}
