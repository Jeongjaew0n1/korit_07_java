package ch12_arrays;

/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    김일 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 이름을 등록하세요 >>> 김이
    김이 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 이름을 등록하세요 >>> 김삼
    김삼 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 이름을 등록하세요 >>> 김사
    김사 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 이름을 등록하세요 >>> 김오
    김오 학생의 점수를 입력하세요 >>> 4.1

    김일 김이 김삼 김사 김오
    4.5 4.4 4.3 4.2 4.1
    학생들의 점수 총합은 21.5점입니다.
 */

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[human];
        double[] scores = new double[human];
        double sum = 0;

        for (int i = 0; i < names.length; i++ ) {
            System.out.print((i+1) + "번 학생의 이름을 입력하세요 >>> ");
            names[i] = scanner.nextLine();
            System.out.print(names[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
            sum += scores[i];
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("학생들 점수의 총합은 " + sum + "점 입니다.");

        System.out.print("어떤 학생의 점수를 조회할까요 >>> ");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameSearch)) {
                System.out.println(nameSearch + " 학생의 점수는 " + scores[i] + "입니다.");
            }
        }

        System.out.print("어떤 학생의 점수를 수정할까요 >>> ");
        String studentModify = scanner.nextLine();
        for (int j = 0; j < names.length; j++) {
            if (names[j].equals(studentModify)) {
                System.out.print(names[j] + " 학생의 바뀐 점수를 입력해주세요 >>> ");
                double newScore = scanner.nextDouble();
                scanner.nextLine();
                scores[j] = newScore;
                System.out.println(names[j] + " 학생의 점수는 " + scores[j] + "입니다.");
            }
        } // 학생의 이름을 잘못 적었을때의 출력문을 어디다 적을지 모르겠다.
    }
}

