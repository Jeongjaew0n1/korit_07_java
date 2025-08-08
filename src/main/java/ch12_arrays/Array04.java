package ch12_arrays;

import java.util.Scanner;

/*
    main 에서 사용하는 불특정 String[] 배열을 매개변수로 하는 메서드를 호출했을 때
    String[] 내부의 요소들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main 에서 사용하는 불특정 String[] 배열을 매개변수로 하는 메서드를 호출했을 때
    String[] 내부 요소들의 값을 하나하나 다 입력받아서 바꾸는 method 정의
 */
public class Array04 {

    public void printElements() {
        String[] names = {"김일","김이","김삼","김사","김오","김육"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }


    public void printElements(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
    public void printElements(double[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    public void printElements(int[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    // 입력 관련 메서드 정의
    public void writesElements(String[] strArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i+1) + "번째 학생의 이름 입력 : ");
            strArray[i] = scanner.nextLine();
        }
    }
    public void writesElements(double[] doubleArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print((i+1) + "번째 학생의 점수 입력 : ");
            doubleArray[i] = scanner.nextDouble();
        }
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        String[] people = new String[5];
        double[] scores = new double[5];

        array04.writesElements(people);
        array04.printElements(people);

        array04.writesElements(scores);
        array04.printElements(scores);



//        array04.printElements();

//        String[] students = {"이일","이이","이삼","이사","이오"};
//        array04.printElements(students);

//        String[] teachers = {"삼일","삼이","삼삼","삼사","삼오"};
//        array04.printElements(teachers);

//        int[] dates = {2025,8,5};
//        array04.printElements(dates);

    }
}
