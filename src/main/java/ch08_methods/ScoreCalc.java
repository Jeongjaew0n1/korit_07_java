package ch08_methods;
/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램 작성
 */

import java.util.Scanner;

public class ScoreCalc {
    public static void main(String[] args) {
        /*
            3과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔창에 표시하시오
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>>
            1 과목의 점수를 입력하세요 >>>
            2 과목의 점수를 입력하세요 >>>
            3 과목의 점수를 입력하세요 >>>
            총합은 ~~이고, 평균은 ~~입니다.
         */
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg;
        int numOfSubs;
        System.out.print("몇 과목의 점수를 입력하시겠습니까 >>> ");
        numOfSubs = scanner.nextInt();
        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.print("점수의 총 합은 " + sum + "점이고, 평균은 " + avg + "입니다.");
    }
}

