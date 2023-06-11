package com.xiong.jvm;

public class jvm {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            sum+=i;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

    }
}
