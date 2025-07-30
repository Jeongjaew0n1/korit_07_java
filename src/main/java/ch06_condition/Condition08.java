package ch06_condition;

import java.util.Scanner;

public class Condition08 {
    public static void main(String[] args) {
        /*
        과제 :
        윤년 계산기 작성
        윤년(leap year)은 특정 조건을 만족하는 년을 말합니다.

        윤년을 판단하는 규칙은
        1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도 있음'
        2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님.
        3. 그러나 100으로 나누어 떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당됨

        예를 들어
        2020년은 4로 나누어 떨어지기 때문에 윤년(100으로는 안나우어지니까요)
        1900년은 100으로 나누어 떨어지기 떄문에 윤년이 아닙니다(400으로도 안나누어집니다)
        2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당됨

        이상의 조건을 만족하는 윤년 계산기를 작성하고,
         */

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("년도를 입력하세요 >>> ");
        year = scanner.nextInt();
        String leapyear = "윤년입니다.";

        if (year % 400 == 0) {}
        else if (year % 100 == 0) { leapyear = "윤년이 아닙니다."; }
        else if (year % 4 == 0) {}
        else { leapyear = "윤년이 아닙니다."; }
        System.out.println(year + "년은 " + leapyear);

    }
}

