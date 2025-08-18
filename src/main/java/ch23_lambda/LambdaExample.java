package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java");
            }
        }; // 객체 정의기 때문에 ;필수
        runnable.run(); // 이상의 방법은 메서드명이 명시되니까 편함

        Runnable lambdaRunnable = () -> System.out.println("Hello, Java");
        lambdaRunnable.run(); // 얘는 윗줄을 봐도 메서드명이 없고, 아까 add / sub에서 calculate를 추론할 수 없던 이유 중 하나

        // 다른 유형의 함수형 인터페이스 실행 예제
        // 2. Consumer -> call2()
        Consumer<String> stringConsumer = (memo) -> System.out.println("메시지 : " + memo);
        stringConsumer.accept("comsumer");

        // 3. Supplier -> call3()
        Supplier<String> stringSupplier = () -> "Hello, Supplier";
        System.out.println(stringSupplier.get());
        String message = stringSupplier.get();
        System.out.println(message); // 둘 중 편한 방법으로 사용
    }
}
