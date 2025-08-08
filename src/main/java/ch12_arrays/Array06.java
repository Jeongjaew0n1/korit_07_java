package ch12_arrays;

public class Array06 {
/*
    int[] scores = {100,90,80,70,60,50,40,30,20,10};
    총합과 평균을 계산해서 다음과 같이 출력하시오.
    총합 : ~점
    평균 : ~점 (double 형변환)
 */

    public static void main(String[] args) {
        int[] scores = {100,90,80,70,60,50,40,30,20,10};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double)sum/scores.length);
    }
}
