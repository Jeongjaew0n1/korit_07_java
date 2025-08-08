package ch12_arrays;

import java.util.Arrays;

public class Array13 {

    public static void main(String[] args) {
        int[][] arr03 = {{1,2},{3,4},{5,6}};
        // 5라는 숫자를 뽑아내고 싶다.
//        System.out.println(arr03[2][0]);
//        System.out.println(arr03[2]);   // 결과값 : [I@36baf30c
//        System.out.println(arr03);      // 결과값 : [[I@7a81197d
//        System.out.println(Arrays.toString(arr03)); // 결과값 : [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        // 2차 배열의 요소 출력 -> 중첩 for문 사용
        for (int i = 0; i < arr03.length; i++) {
            for (int j = 0; j < arr03[i].length; j++) {
                System.out.println(arr03[i][j]);
            }
        }

        // 그렇다면 향상문 for 문으로 2중 배열 내부 요소 출력
        for (int[] numi : arr03) {
            for (int numj : numi) {
                System.out.print(numj + " ");
            }
        }



    }

}
