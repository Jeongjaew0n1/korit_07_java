package ch06_condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 변수와 상수의 선언 및 초기화
        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if (point > 80) {
            System.out.println("회원 등급 : VIP");
        } else if (point > 60) {
            System.out.println("회원 등급 : GOLD");
        } else if (point > 40) {
            System.out.println("회원 등급 : SILVER");
        } else if (point > 20) {
            System.out.println("회원 등급 : BRONZE");
        } else {
            System.out.println("일반 회원입니다.");
        }

        // 기능은 동일하지만 개발자 친화적(유지보수가 용이한 형태)으로 재작성
        // 1. sout이 많다.

        String userGrade = "";
        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        } else {
            userGrade = "일반 회원입니다.";
        }

        System.out.println("회원 등급 : " + userGrade);

        // 2. 요구 등급에 대한 포인트 규정이 바뀔 경우에 조건문에서 일일히 수정해야 한다.
        String userGrade2 = "";
        if (point > VIP_POINT) {
            userGrade2 = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade2 = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade2 = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade2 = "BRONZE";
        } else {
            userGrade2 = "일반 회원입니다.";
        }

        System.out.println("회원 등급 : " + userGrade2);
    }
}

