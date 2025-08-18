package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a,b);
    }

    public static void main(String[] args) {
        /*
            interface Calculator를 사용. 근데 인터페이스 내부에 두 개의 매개변수만 정의되있음
            여기서 추가 조작을 통해 사칙 연산을 시도
         */
        Calculator add = (x, y) -> x + y; // Calculator 인터페이스의 객체명이 add, 내부 메서드는 calculate()
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println(add.calculate(2,3));
        System.out.println(sub.calculate(2,3));
        System.out.println("--- static method ---");
        System.out.println("2 + 3 = " + operate(2,3,add));
        System.out.println("2 x 3 = " + operate(2,3,mul));

    }
}
