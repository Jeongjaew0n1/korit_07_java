package ch08_methods;

public class Overloading {
    // 메서드 정의 영역
    public static void add() {
        System.out.println("add()");
    }

    // 오버로딩 적용
    // call2() 유형
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s + "!");
    }

    // call2() 유형으로
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println(a+b);
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(a + " / " + s);
    }

    public static void add(int a, int b, double c) {
        System.out.println("int a, int b, double c");
        System.out.println("a + b + c = " + (a+b+c));
    }

    public static void main(String[] args) {
        add();
        add("안녕하세요");
        add(1,2);
        add(1,"a");
        add("a",1);
        add(1,2,4.5);
    }


}
