package org.example;

import java.util.Scanner;

public class BmiCalc {

    public static void calcBmi() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키를 입력하세요(cm) >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게를 입력하세요(kg) >>> ");
        double weight = scanner.nextDouble();
        double Bmi = weight / (height * height);
        if (Bmi >= 35) {
            result = "3단계 비만";
        } else if (Bmi > 34.9) {
            result = "2단계 비만";
        } else if (Bmi > 29.9) {
            result = "1단계 비만";
        } else if (Bmi > 24.9) {
            result = "비만 전단계";
        } else if (Bmi > 22.9) {
            result = "정상";
        } else if (Bmi > 18.5) {
            result = "저체중";
        }
        System.out.printf("%s 님의 BMI 지수는 %.2f으로 %s 입니다.", name, Bmi, result);
    }

    public static void calcBmi(String name, double height, double weight) {
        String result = "";
        double Bmi = weight / ((height/100) * (height/100));
        if (Bmi >= 35) {
            result = "3단계 비만";
        } else if (Bmi > 34.9) {
            result = "2단계 비만";
        } else if (Bmi > 29.9) {
            result = "1단계 비만";
        } else if (Bmi > 24.9) {
            result = "비만 전단계";
        } else if (Bmi > 22.9) {
            result = "정상";
        } else if (Bmi > 18.5) {
            result = "저체중";
        }
        System.out.printf("\n%s 님의 BMI 지수는 %.2f으로 %s 입니다.", name, Bmi, result);
    }

    public static void calcBmi(Person person) {
        String result = "";
        String name = person.getName();
        double weight = person.getWeight();
        double height = person.getHeight() * 0.01;
        double Bmi = weight / (height * height);
        if (Bmi >= 35) {
            result = "3단계 비만";
        } else if (Bmi > 34.9) {
            result = "2단계 비만";
        } else if (Bmi > 29.9) {
            result = "1단계 비만";
        } else if (Bmi > 24.9) {
            result = "비만 전단계";
        } else if (Bmi > 22.9) {
            result = "정상";
        } else if (Bmi > 18.5) {
            result = "저체중";
        }
        System.out.printf("\n%s 님의 BMI 지수는 %.2f으로 %s 입니다.", name, Bmi, result);
    }

    public static void main(String[] args) {
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi();
        bmiCalc.calcBmi("김일",130,130);
        Person person1 = Person.builder()
                .weight(130)
                .name("김일")
                .height(130)
                .build();
        bmiCalc.calcBmi(person1);

    }
}
