package com.example.nettystudy.nio;

import java.nio.IntBuffer;

/**
 * 作者: bwh
 * 创建日期: 2025/3/6
 */
public class BufferExample {
    public static void main(String[] args) {
        //分配10个大小的buffer
        IntBuffer buffer = IntBuffer.allocate(10);

        //写入数据
        for(int i= 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        //切换读模式
        buffer.flip();


        //读buffer数据
        while(buffer.hasRemaining()) {
            System.out.printf(buffer.get() + " ");
        }
        System.out.println();

        //重置位置
        buffer.rewind();

        //再次读buffer数据
        while (buffer.hasRemaining()) {
            System.out.printf(buffer.get() + " ");
        }
        System.out.println();
        //清空buffer
        buffer.clear();

        //写入新数据
        for(int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i * 2);
        }

        buffer.flip();

        while(buffer.hasRemaining()) {
            System.out.printf(buffer.get() + " ");
        }
        System.out.println();
    }
}
