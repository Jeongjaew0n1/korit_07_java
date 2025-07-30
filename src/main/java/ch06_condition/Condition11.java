package ch06_condition;

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedNum;
        String selectedChar = "";

        System.out.println(" [ 메뉴 선택 ]");
        System.out.println("1. Java를 공부한다");
        System.out.println("2. Python을 공부한다");
        System.out.println("3. JavaScript를 공부한다");
        System.out.println("4. HTML을 공부한다");
        System.out.println("5. 자습한다");
        System.out.println("6. 쉰다");
        System.out.print("메뉴를 선택하세요 >>> ");
        selectedNum = scanner.nextInt();


        // 얘를 만약에 if문으로 작성한다고 가정하면
        // 매력적이지 않은 예시
        if (selectedNum < 1 || selectedNum > 6) {
            System.out.println("불가능한 메뉴 선택입니다.");
        } else {
            if(selectedNum == 1) {
                System.out.println("메뉴 1을 선택하셨습니다.");
            } else if(selectedNum == 2) {
                System.out.println("메뉴 2를 선택하셨습니다.");
            } else if(selectedNum == 3) {
                System.out.println("메뉴 3를 선택하셨습니다.");
            } else if(selectedNum == 4) {
                System.out.println("메뉴 4를 선택하셨습니다.");
            } else if(selectedNum == 5) {
                System.out.println("메뉴 5를 선택하셨습니다.");
            } else {
                System.out.println("메뉴 6을 선택하셨습니다.");
            }
        }
        //        switch (selectedNum) {
//            case 1 :
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;                                          // 조건문을 탈출한다는 의미
//            case 2 :
//                System.out.println("메뉴2를 선택하셨습니다.");
//                break;
//            case 3 :
//                System.out.println("메뉴3을 선택하셨습니다.");
//                break;
//            case 4 :
//                System.out.println("메뉴4를 선택하셨습니다.");
//                break;
//            case 5, 6 :
//                System.out.println("메뉴5를 선택하셨습니다.");
//                break;
//            default :                                       // selectedNum이 case에 속하지 않을 때 실행됨
//                System.out.println("잘못 선택하셨습니다.");
//        }

        switch (selectedChar) {
            case "a" :
                System.out.println("메뉴1을 선택하셨습니다.");
                break;                                          // 조건문을 탈출한다는 의미
            case "b" :
                System.out.println("메뉴2를 선택하셨습니다.");
                break;
            case "c" :
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d" :
                System.out.println("메뉴4를 선택하셨습니다.");
                break;
            case "e" :
                System.out.println("메뉴5를 선택하셨습니다.");
                break;
            default :                                       // selectedNum이 case에 속하지 않을 때 실행됨
                System.out.println("잘못 선택하셨습니다.");
        }

    }
}