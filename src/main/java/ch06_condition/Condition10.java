package ch06_condition;

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max;
//        int max2;
//        // a > b 라면 max에 a를 대입 / 아니라면 max에 b를 대입
//        max = (a > b) ? a : b;
//        System.out.println("max에 저장된 값은? : " + max);
//
//        // 이상의 삼항연산자를 if - else문으로 풀어 쓴다면
//        if(a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println("max에 저장된 값은? : " + max);

        // 이상의 삼항연산자 개념을 윤년에 응용하도록 하겠습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
//        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0));
//        String result = isLeapYear ? "윤년입니다" : "윤년이 아닙니다";
//        System.out.println(year + "년은 " + result);

        // 음수 연도를 걸러내기 위한 방법
//        String result2 = "";
        boolean isLeapYear2 = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//        if (year < 0) {
//            result2 = "불가능한 연도 입력입니다.";
//        } else { // 그러면 얘는 0 이상
//            result2 = isLeapYear2 ? "윤년입니다" : "윤년이 아닙니다";
//        }
//        System.out.println(year + "년은 " + result2);

        // 음수 연도를 걸러내기 위한 방법 #2
        String result3 = year <= 0 ? "불가능한 연도 입력입니다."
                : (isLeapYear2) ? "윤년입니다." : "윤년이 아닙니다.";

        System.out.println(year + "년은 " + result3);
    }
}