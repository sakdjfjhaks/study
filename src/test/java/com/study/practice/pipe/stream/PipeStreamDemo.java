package com.study.practice.pipe.stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreamDemo {
    public static void main(String[] args) {
        try {
            Sender sender = new Sender();	// 创建线程对象Sender
            Receiver receiver = new Receiver();	// 创建线程对象Receiver
            PipedOutputStream out = sender.getOutputStream();	// 写入
            PipedInputStream in = receiver.getInputStream();	// 读出
            out.connect(in); // 将输出发送到输入
            sender.start();// 启动线程
            receiver.start();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}

class Sender extends Thread {
    private PipedOutputStream out = new PipedOutputStream();
    public PipedOutputStream getOutputStream() {
        return out;
    }
    public void run() {
        String s = new String("Receiver,你好!");
        try {
            while (true){
                out.write(s.getBytes());
                Thread.sleep(100);
            }
        }
        catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Receiver extends Thread {
    private PipedInputStream in = new PipedInputStream();
    public PipedInputStream getInputStream() {
        return in;
    }
    public void run() {
        String s = null;
        byte[] b = new byte[1024];
        try {
            while(true){
                int len = in.read(b);
                s = new String(b, 0, len);
                System.out.println("收到了以下信息:" + s);
                Thread.sleep(100);
            }
        }
        catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

