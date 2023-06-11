package xiong;

import java.sql.DriverManager;

public class ClassLoaderTest02 {
    public static void main(String[] args) {

        try {
            //String类的classLoader是bootstrapClassLoader 在java中null
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println("classLoader = " + classLoader);
            //单前线程的classLoader一般是AppClassLoader
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println("contextClassLoader = " + contextClassLoader);
            //系统classLoader==AppClassLoader
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            System.out.println("systemClassLoader = " + systemClassLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
