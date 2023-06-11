package test02;

public class Test {
    int number;
    String str;
    void demo(){
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(str);

    }

    public static void main(String[] args) {
     new Test().demo();
    }
}
