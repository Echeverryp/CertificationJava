package com.java.certification.part2.Q9Estudiar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    private String[] strings = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "abcdefghijklmnopqrstuvwxyz", "0123456789"};
    public void write(String filename) {
        try ( FileChannel fileChannel=new FileOutputStream(filename).getChannel();){

        //line 1
        for (String str : strings) {
            ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
            fileChannel.write(buffer);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        Main test = new Main();
        test.write("file_to_path");
    }
}


