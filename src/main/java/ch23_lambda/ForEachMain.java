package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성. 선언 및 초기화 한번에
        List<String> fruits = Arrays.asList("사과", "딸기", "바나나");

//         여기서 요소들을 추출하기 위해서 for문 / 향상된 for문 사용했었음
//        // 1. 일반 for문
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println("과일명 : " + fruits.get(i));
//        }
//        // 2. 향상된 for문
//        for (String friut : fruits) {
//            System.out.println("과일명 : " + friut);
//        }
        // 3. 람다식 적용한 method foreach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println((number*2) + " "));


    }
}
