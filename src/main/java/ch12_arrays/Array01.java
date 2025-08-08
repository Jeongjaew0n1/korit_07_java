package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};
//        int i = 1;
//        System.out.println(i);
//        System.out.println(arr01);
//        System.out.println(arr01[0]);
//        System.out.println(arr01[1]);
//        System.out.println(arr01[2]);
//        System.out.println(arr01[3]);
//        System.out.println(arr01[4]);
        // 현재 상태에서 내부의 값을 호출할 수가 없습니다. 주소만 호출됩니다.
        // 배열 내부의 각 숫자들을 뭐라고 한다 ?
        // 현재 배열 내부에는 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능합니다.
        // 즉 element 들을 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요합니다.
        // 이때 필요한 개념이 index(주소지라고하기도 합니다) 개념입니다

//        for (int i = 0; i < arr01.length; i++) {
//            System.out.print(arr01[i] + " ");
//            System.out.println();
//        }

        // 향상된 for문
//        for (int j : arr01) {
//            System.out.print(j + " ");
//        }

        "안녕하세요".length();

        // 근데 우리가 필드를 참조할 때 객체명.필드 형태로 참조했었습니다.
        // bank1.accountHolder와 같은 방식으로 참조 가능했습니다.
        // 그리고 field를 직접 참조했다는 말은 length 필드는 public 이라고 볼 수 있겠네요

        // 그렇다면 배열은 객체인가    -> 완전히 그렇다고는 x / 하지만 field로 length를 가진다
        // 빈 배열 생성

        // 이상의 모든 것을 종합했을 때,
        // 배열 내부의 방의 개수 / 주소지의 한계값 - 1을 우리가 항상 알고 있는 것은 아니기 때문에
        // element 값을 출력하기 위한 반복문의 한계값을 설정할 때
        // 배열명.length를 쓰는 것을 생활화하자.

        // arr01 내부에 있는 1, 2, 3, 4, 5는 굳이 따지자면 arr01[0], arr01[1], ..., arr01[4]라는 변수명을 지니고
        // 있다고 볼 수 있습니다.

        // 변수의 개념을 우리는 다시 생각 해야 합니다.
        int[] arr02 = new int[10];

        // arr02 밑에 추가 정보 입력

//        arr01[0] = 10;
//        System.out.println(arr01[0]);

//        for (int i = 0; i < arr02.length; i++) {
//            System.out.println(arr02[i]);
//        }

        // arr02에 21,22,23 -> 42, 44, 46
        for (int i = 0; i < arr02.length; i++) {
            arr02[i] = 42 + i * 2;
            System.out.print(arr02[i] + ", ");
        }

        String[] strArray01 = {"안","녕","하","세","요"};
        System.out.println(strArray01[0]);
        // 그래서 다른 자료형의 배열이라더라도 기본적으로 element를 추출하는 절차는 동일합니다.
    }
}
