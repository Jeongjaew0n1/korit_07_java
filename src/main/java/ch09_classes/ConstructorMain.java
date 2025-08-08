package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        // int 매개변수
        Constructor constructor2 = new Constructor(1);
        // String 매개변수
        Constructor constructor3 = new Constructor("정재원");
        System.out.println(constructor3.name);



    }
}
