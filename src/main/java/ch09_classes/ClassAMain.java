package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {

        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + " 학생의 " +
                "학번은 " + classA1.num + "이고, 석정은 " +
                classA1.score + "점입니다.");

        classA1.callName();
    }
}
