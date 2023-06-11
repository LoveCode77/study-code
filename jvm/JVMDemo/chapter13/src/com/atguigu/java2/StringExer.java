package com.atguigu.java2;

public class StringExer {
        // 对象内存地址可以使用System.identityHashCode(object)方法获取
        public static void main(String[] args) {
            String s1 = new String("a") + new String("b");//执行完以后，不会在字符串常量池中会生成"ab"
            System.out.println(System.identityHashCode(s1));
            s1.intern();
            System.out.println(System.identityHashCode(s1));
            String s2 = "ab";
            System.out.println(System.identityHashCode(s2));
            System.out.println(s1 == s2); // true
    }
}
