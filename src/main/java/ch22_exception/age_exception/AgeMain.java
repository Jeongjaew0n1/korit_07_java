package ch22_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {
    // 예외 클래스는 별개로 정의했지만 메서드를 호출했을 때 예외를 처리해야 하기 때문에 여기에 추가적으로 메서드 정의 해야함
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 200) {
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
        // 음수값이나 200 초과 정수가 입력이 가능해 오류가 발생할 수 있음
        try {
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("입력된 나이는 : " + age + "살입니다.");
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요");
        } finally {
            System.out.println("프로그램 종료");
        }
        /*
            이상의 코드에서 정상적인 데이터 한 번 / 비정상적인 데이터를 한 번 실행시켜봤을 때의 콘솔 출력 숫자를 고려할 필요가 있음
            예외가 발생하지 않는다면 예외 관련 객체가 생성되지도 않고 catch문은 실행되지 않습니다.
            예외가 발생한다면 예외 발생 시점 이후의 try 문은 실행되지 않고 곧장 finally문이 실행됩니다.
            그리고 예회 발생 유무와 관계 없이 finally 문은 맨 마지막에 실행됨
         */
    }
}
