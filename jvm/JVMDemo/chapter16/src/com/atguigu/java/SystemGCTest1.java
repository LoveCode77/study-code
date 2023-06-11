package com.atguigu.java;

/**
 * @author xd
 */
public class SystemGCTest1 {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+"    ");
            new SystemGCTest1();
            System.gc();
            System.runFinalization();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
