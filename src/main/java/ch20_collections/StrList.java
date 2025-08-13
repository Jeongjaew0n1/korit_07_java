package ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 1. Array 와의 차이점
        // 선언 방식
        List<String> strList = new ArrayList<>();
        String[] strArray = new String[5];
        // List의 경우 인덱스 넘버 고정이 없지만, 배열의 경우 인덱스 넘버를 고정해줘야만 합니다.

        // 2. 값을 대입하는 방법
        // Array
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List -> 메서드를 통해 저장
        strList.add("java");
        strList.add("python");
        strList.add("javascript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장된다고 했기 때문에 집어 넣는 순서대로 값이 들어갑니다.

        // 3. 출력 방식
        // Array
//        System.out.println(strArray);
//        System.out.println(Arrays.toString(strArray));

        // List    -toString()
//        System.out.println(strList);

        // 특정 element(List내의) 검색 -> contains() 메서드 사용 리스트명.contains(목적어)
//        String searchElme1 = "python";
//        boolean contains1 = strList.contains(searchElme1);
//        System.out.println(searchElme1 + " 포함 여부 : " + contains1);

//        String searchElme2 = "py";
//        boolean contains2 = strList.contains(searchElme2);
//        System.out.println(searchElme2 + " 포함 여부 : " + contains2); // 단어가 정확하게 일치해야 가능

        // 특정 element 삭제 -> 리스트명.remove(element)
//        String removeElem1 = "javascript";
//        boolean isRemoved = strList.remove(removeElem1);
//        System.out.println(removeElem1 + " 제거 여부 : " + isRemoved);
//        System.out.println(strList);
        // FIFO / .pop() -> 삭제 여부가 아니라 collection 에서 삭제하고 삭제된 요소 return

        // List 정렬
//        Collections.sort(strList); // 배열 정렬과 같음. 원본 List의 결과값이 바뀝니다.
//        System.out.println(strList);

        // List 역순 정렬
//        Collections.sort(strList, Comparator.reverseOrder());
//        System.out.println(strList);

        // 전체 element들 출력 방법
        // 1. 배열
        for (int i = 0; i < strArray.length; i++) {
            System.out.println((i+1) + "번째 : " + strArray[i]);
        }
        System.out.println();
        for(String data : strArray){
            System.out.print(data + " ");
        }
        System.out.println();
        // 2. 리스트
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();
        for (String data2 : strList) {
            System.out.print(data2 + " ");
        }


    }
}
