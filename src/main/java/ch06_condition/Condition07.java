package ch06_condition;

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 중첩 if 문을 적용한 조건문 작성
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}