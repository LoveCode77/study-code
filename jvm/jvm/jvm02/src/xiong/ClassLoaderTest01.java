package xiong;

import sun.misc.Launcher;
import sun.net.spi.nameservice.dns.DNSNameService;

import java.net.URL;

public class ClassLoaderTest01 {
    public static void main(String[] args) {
        //获取bootstrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }


        ClassLoader classLoader = DNSNameService.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);


    }
}
