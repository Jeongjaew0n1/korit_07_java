package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("년도를 입력하세요 >>> ");
        year = scanner.nextInt();
        String leapyear = "윤년입니다.";

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {}
        else { leapyear = "윤년이 아닙니다."; }
        System.out.println(year + "년은 " + leapyear);
    }
}
