package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것

        // 변수 선언 및 초기화 : 자료형 변수명 = 값;
        // 업캐스팅 방법 # 1
        // 형변환을 하기 위해서는 '(바꿀데이터타입)변수명'으로 작성하시면 됩니다.
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        System.out.println("변형 : " + (int)cast1); // A를 int로 형변환 시 65

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2); // a는 97

        // 업캐스팅 방법 # 2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법입니다.
        char cast3 = 'b';
        int casted3 = cast3; // 여기서는 (int)로 안씀.
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // 다운캐스팅 : 용량이 더 적은 자료형으로 변형하는 것
        int cast4 = 99;         // 얘는 # 1로
        int cast5 = 100;        // 얘는 # 2로
        // 지시 사항 : 다운캐스팅하는 방법을 업캐스팅 방법 # 1, 2를 참조하여 char 형으로 바꾼 후
        // 콘솔창에 원형과 변형을 모두 출력하시오.

        // # 1 방법
        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);

        // # 2 방법
        char casted5 = (char) cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + casted5);

        /*
        현재 36번 라인 코드에서 오류가 발생하는 것은 정상.
        추후 수업에서 더 중요하게 적용되는 개념인데, upcasting의 경우 메모리 용량이 커지면 되니까
        기존 데이터가 변형이 일어날 가능성이 없어서 암시적(implicit)으로 변형이 가능한 반면,
        downcasting의 경우에는 데이터 용량이 축소되는 과정에서 변수가 메모리 용량을 벗어나게 되는
        경우가 있습니다. 용량 오버에 해당하는 현상을 미리 점검하기 위해
        다운캐스팅 시에는 명시적(explicit)으로만 변형이 가능합니다.

        -> 현재는 기본 자료형을 기준으로 예시를 들었지만 나중에는 참조자료형 캐스팅 개념과 연결합니다.
         */
    }
}

