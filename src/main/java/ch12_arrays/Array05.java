package ch12_arrays;

import java.util.Scanner;

public class Array05 {
    /*
        String[] scores 배열에
        A / B / C / D / F 요소를 입력하고
        실행 예
        A+ B+ C+ D+ F
        출력
     */
    public void writeScore(String[] strArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i+1) + "번째 점수 입력 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }
    public void printScore(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            if (!strArray[i].equals("F")) {
                System.out.print(strArray[i] + "+ ");
            } else {
                System.out.print(strArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();

        String[] scores = new String[5];
        array05.writeScore(scores);
        array05.printScore(scores);

    }
}
