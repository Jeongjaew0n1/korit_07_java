package ch22_exception;

import java.util.Scanner;

class Person {
    int age;
    String name;
    void showInfo() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
    }
}
public class Exception01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = 20;
//        person1.school = "코리아아이티"; // 예외처리가 아닌 예시
        person1.showInfo();
//        person1.displayInfo(); // 예외처리가 아닌 예시


//        int a = 10;
//        int b = 0;
//        int result = a / b;
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (b == 0) {
//            System.out.println("나눌 수 없습니다.");
//        }else {
//            System.out.println("결과는 : " + a / b);
//        }

//        int a = 10;
//        int b = 0;
//        try {
//            int result = a / b;
//            System.out.println("결과 : " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        } finally {
//            System.out.println("프로그램 정상 종료");
//        }

//        int[] numbers = { 1, 2, 3, 4};
//        try {
//            System.out.println(numbers[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("프로그램 종료");
//        }


    }
}
