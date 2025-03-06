package com.example.nettystudy.bio;

/**
 * 作者: bwh
 * 创建日期: 2025/3/6
 */

import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class BIOClient {
    public static void main(String[] args) {
        try {
            // 创建一个Socket对象，连接到服务器
            Socket socket = new Socket("localhost", 8080);
            System.out.println("客户端已连接到服务器");

            // 获取输出流，向服务器发送数据
            OutputStream outputStream = socket.getOutputStream();
            Random random = new Random();
            String message = "Hello, Server!" + random.nextInt(1000);
            outputStream.write(message.getBytes());
            outputStream.flush();
            System.out.println("客户端发送数据: " + message);

            // 关闭输出流和Socket
            outputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

