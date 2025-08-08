package ch12_arrays;

import ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array12 {

    public static void main(String[] args) {
        // 동일한 메서드 명이지만 클래스에 따라 다른 로직일 수 있다는 예시
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        Random sc = new Random(); // 이런 방식은 추천하지 않음
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num2 =scanner.nextInt();
//        System.out.println(num2);

        // int[] numbers 배열에 1, 2, 3, ... 10 까지 대입해주세요
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

        Method01.call1();
        System.out.println(Method01.call3());

        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};
        System.out.println("정렬 전 배열 : " + Arrays.toString(nums));

        // 오름 차순 정렬
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 후 배열 : " + Arrays.toString(nums));

        // 내림 차순 정렬
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 후 배열 : " + Arrays.toString(nums));

        /*
            이상의 경우는 보면 sort() 메서드에 오름차순에서는 매개변수가 하나였는데,
            내림 차순할 때는 매개변수가 2개 입니다. 이상의 과정이 오버로딩이 이루어졌습니다.
            그리고 두 번째 매개변수로 Comparator.reverseOrder();가 사용되었는데,
            Comparator.reverseOrder()의 결과값/return 값이 sort() 메서드의 두 번째 매개변수로 사용되었다는
            점에서 역시 함수형 프로그래밍의 일종이라고 볼 수 있습니다.
            근데 Comparator.reverseOrder() 메서드를 쓰려면 기본 자료형(원시 자료형/ primitive type) int[] 배열을 사용할 수 없어서
            Integer[] 배열을 사용하였는데, 현재는 char -> String 처럼 int -> Integer 라고만 생각해두시면 돠겠습니다.
         */
    }
}
