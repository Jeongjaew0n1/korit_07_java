package ch06_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {

        /*
        고민해봐야 할 사항 Condition05의 코드는
        100초과 / 0미만의 점수가 입력됐을 때 각자 A / F 라는 결과값이 나오게 됩니다.
        애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고 안내를 하려면 어떻게 될 수 있을까요?
        100초과 / 0미만의 경우 grade를 X라고 하겠습니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String grade;

        if (score > 100 || score < 0) {
            grade = "X";
        }
        else if (score >= 90) {
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
        System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
    }
}