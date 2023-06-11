package com.atguigu.java;

public class test {
    public static void main(String[] args) {

        try {
            Thread.sleep(1000*60*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
