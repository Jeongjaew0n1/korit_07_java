package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오",};
        /*
        1 번 : 김일
        2 번 : 김이
        ...
        일반 for문
        향상된 for문
         */

        // 일반 for문
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + " 번 : " + persons[i]);
        }
        // 향상된 for문
        int count = 0;
        for (String person : persons) {
            System.out.println(++count + " 번 : " + person);
        }
    }
}
