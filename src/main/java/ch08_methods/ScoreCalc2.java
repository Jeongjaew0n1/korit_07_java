package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {

    public static void calcSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg;
        int numOfSubs;
        System.out.print("몇 과목의 점수를 입력하시겠습니까 >>> ");
        numOfSubs = scanner.nextInt();
        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i + 1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.print("점수의 총 합은 " + sum + "점이고, 평균은 " + avg + "입니다.");
    }

    public static void main(String[] args) {
        calcSumAndAvg();
    }
}
