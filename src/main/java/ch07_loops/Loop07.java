package ch07_loops;

/*
    scanner를 이용한 별찍기
    몇 줄의 별을 찍겠습니까?

    *
    **
    ***

 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.print("몇줄의 별을 찍겠습니까? >>> ");
        row = scanner.nextInt();
//        for (int i = 1; i < row+1; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i=row; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
