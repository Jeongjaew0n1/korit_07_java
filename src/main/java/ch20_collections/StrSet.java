package ch20_collections;

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        // Set 객체와 List 객체 생성
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일합니다. 리스트or셋명.add(element)
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
//        System.out.println(strList);

        strSet.add("TypeScript");
//        System.out.println(strSet);

        // List의 element 들을 전부 Set에 대입 -> Set명.addAll(리스트명)
        strSet.addAll(strList);
        System.out.println(strList); // 원래 List는 그대로 유지
        System.out.println(strSet); // Set에 List 요소들이 더해졌지만, 중복 제거

//        System.out.println(strSet.size());
        // 현재 상황에서 Set 내부에 있는 각 요소들을 추출하여 뒤에 " 언어"라고 붙여서 java 언어, 와 같이 데이터를 조작하는 것이 불가능함
        // 이와 같은 문제로 Set -> List로 변환도 자주 쓰임
        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);
        // 중복 제거된 set 요소들을 새로운 List에 대입
        System.out.println(modifiedStrList);
        // set의 순서와 동일하게 들어있기 때문에 마찬가지로 순서가 보장
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        // 일반 for문
        for (int i = 0; i<modifiedStrList.size(); i++) {
            System.out.println(modifiedStrList.get(i) + " 언어");
        }
        System.out.println();
        // 향상된 for문
        for (String moList : modifiedStrList) {
            System.out.println(moList + " 언어");
        }
    }
}


