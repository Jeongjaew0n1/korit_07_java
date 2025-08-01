package ch08_methods;

/*
    별찍기 관련한 부분을 저희가 메서드화 시켜보도록 하겠습니다.
 */

import java.util.Scanner;

public class Method02 {

    // call4() 유형으로 작성할겁니다. 왜? -> 몇 줄 짜리인지 / 어떤 유형의 별찍기인지를 main 에서 받을 예정

    public static String getStar(int rows, int option) {
        String result = "";
        if (option == 1) {
            for (int i = 1; i < rows + 1; i++) {
                for (int j = 0; j < i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for (int i = 1; i < rows + 1; i++) {
                for (int j = rows; j > i; j--) {
                    result += " ";
                }
                for (int k = 0; k < i; k++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for (int i = rows; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                for (int k = rows; k > i; k--) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            System.out.println("잘못된 옵션을 선택하셨습니다.");
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars;
        int choice;
        String starResult;

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요(1~4) >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars,choice);
        System.out.println(starResult);

        /*
            나머지는 내일 작성하긴 할건데, 이제 여러분들이 주요하게 봐야하는 개념이 뭐냐면
            영어();
            라고 되어있는 부분에서 괄호 있는 영단어/문장이 사실은 메서드였다는 점입니다.
            scanner.nextLine();
            System.out.println("특정내용");
            과 같은 식으로 저희가 여태까지 영어로 명령어를 쓰고 소괄호를 적용한 모든 것들이
            메서드와 관련된 부분이었고, 그래서 사실 잘 쓰고 있었던 것이기 때문에
            낯설게 느껴지기 보다는 원리를 이용하는 과정
         */
    }
}
