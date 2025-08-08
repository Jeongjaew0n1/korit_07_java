package ch12_arrays;
/*
    20250805에 정수 배열의 내부 요소들의 합과 평균

    내부 요소들의 값들의 정수 범위를 조사
    90이상은 A
    80이상은 B
    70이상은 C
    60이상은 D
    59이하는 F
    A가 몇명이고, B기 몇밍이고 ~ 출력
 */

public class Array07 {

    public static void main(String[] args) {
        int[] scores = {100,97,83,85,77,76,64,64,58,5,92,100};

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        // int[] != int
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                a++;
            } else if (scores[i] >= 80) {
                b++;
            } else if (scores[i] >= 70) {
                c++;
            } else if (scores[i] >= 60) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 어차피 변수 abcd 하나하나 int니까
        // int[] 배열을 선언해서 선언하는 변수 개수를 줄일 수 있지 않을까
        // A에 해당하는 점수라면 grade[0] 숫자를 +1 해주고, B에 해당하면 grade[1] +1.
        int[] grades = {0,0,0,0,0};
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                grades[0]++;
            } else if (scores[i] >= 80) {
                grades[1]++;
            } else if (scores[i] >= 70) {
                grades[2]++;
            } else if (scores[i] >= 60) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }
        System.out.println("배열 A 학생 수 : " + grades[0]);
        System.out.println("배열 B 학생 수 : " + grades[1]);
        System.out.println("배열 C 학생 수 : " + grades[2]);
        System.out.println("배열 D 학생 수 : " + grades[3]);
        System.out.println("배열 F 학생 수 : " + grades[4]);

    }
}
