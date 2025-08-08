package ch02_variable;

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 정재원입니다.");
//        System.out.println(안녕하세요, 제 이름은 정재원입니다.); -> 오류 발생
        System.out.println(1);              // 1
        System.out.println("1");            // 1
        System.out.println(1 + 2);          // 3
        System.out.println("1 + 2");        // 1 + 2
        System.out.println("1" + "2");      // 12
        System.out.println("1" + 2);        // 12

        // 이상과 같은 방식의 코드 대입을 하드 코딩이라는 표현을 씁니다.
        // 명령문에 데이터(변수에 대입되지 않은 데이터를 리터럴(literal))를 바로 집어넣는 것
        // 데이터를 변수에 대입하고, 변수를 통해서 명령을 내리는 것이 권장됨.

        int scoreEnglish = 100;
        System.out.println(scoreEnglish);

        String introduction = "안녕하세요. 저는 Java를 가르치게 된 안근수입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드리겠습니다.");

        // 변수의 의미에 주목해보면 데이터 값이 바뀔 수 있음을 뜻합니다.
        scoreEnglish = 90;
        System.out.println(scoreEnglish);
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓(true / false)
        // 자료형 변수명 = 데이터;           변수의 선언 및 초기화
        boolean checkFlag1 = false;
        // 변수에 데이터 재대입
        checkFlag1 = true;

        boolean checkFlag2;             // 변수의 선언
        checkFlag2 = true;              // 변수의 초기화
        checkFlag2 = false;             // 변수의 재대입

        // 2. 문자 자료형 변수 char
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';
        // char -> 문자 / String -> 문자열

        System.out.println(name1 + name2 + name3);  // 144732
        System.out.println("" + name1 + name2 + name3);  // 안근수
        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터는 생각보다 멍청해서 개발자인 저희가
            하나하나 지정을 해줘야 한다는 점입니다. 문자와 문자열은 서로 다른 개념인데,
            문자(하나짜리)를 세 번 더했을 경우에 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않습니다

            그렇기 때문에 저희는 sout()의 () 안에 ""를 넣어줌으로써,
            () 내부가 전체적으로 문자"열"로 인식되도록 꼼수를 부렸다고 할 수 있습니다.

            여기서 알 수 있는 점은 sout()에서 가장 먼저 나온 데이터의 자료형을
            따라간다는 점입니다.
         */
        System.out.println(123+1);  // 124
        System.out.println("123" + 1);  // 1231
        System.out.println(123 + "1");  // 1231 -> 근데 얘가 예외

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);  // 300 숫자끼리는 연산이 가능합니다.
        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4); // 300400
        // 문자열끼리는 연산이 아니라 "나열"되는거라 순서가 중요

        // 4. 실수 자료형 변수 double

        // pi 변수를 이용하여 원의 반지름이 43인 원의 둘레 및 넓이를 구하시오.
        // 원의 둘레 공식 : 지름 x pi
        // 원의 넓이 공식 : 반지름 제곱 x pi
        double pi = 3.1415926;
        System.out.println("원의 둘레는 : " + 43 * 2 * pi);
        System.out.println("원의 넓이는 : " + 43 * 43 * pi);
        // 5. 문자열 자료형 변수 String
        // 주의해야할 점 : 얘는 대문자인데 나중에 머리 아픈 일들이 생기게 됩니다.
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 it 아카데미 국비 강사";
        String previousJob = "영어교사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);
        // 이상과 같이 변수에 대입하고 그 변수를 그대로 출력하는 방법이 가능합니다.
        // 하지만 아까 봤던 것처럼

        System.out.println("안녕하세요 제 이름은 " + name + "입니다. 제 전공은 " + major
                + "이고, 그래서 예전 직업은 " + previousJob + "였습니다. 현재는 " +
                currentJob + "을 가지고 있습니다."
        );
        // 와 같은 식으로 literal과 연결 지어서 사용할 수도 있습니다.

        // 연습
        String name10;
        String major10;
        String mbti10;
        int age10;

        // 제가 위에 선언한 변수들에 여러분들에게 적합한 데이터로 '초기화'하여
        // 저는 코리아 it 아카데미 7월 국비 과정을 수강하고 있는 ??입니다. ??살입니다. -> 줄바꿈
        // 제 전공은 ??학과이며, mbti는 블라블라입니다. 열심히 할게요!!!
        // 와 같이 출력되도록 sout을 작성하시오.
        name10 = "정재원";
        age10 = 28;
        major10 = "해양컴퓨터공학과";
        mbti10 = "ENFJ";

        System.out.println("저는 코리아 it 아카데미 7월 국비 과정을 수강하고 있는 " + name10 + "입니다. 나이는 "
                + age10 + "살입니다.\n" + "제 전공은 " + major10 + "이며, mbti는 " + mbti10 +"입니다. 열심히 할게요!!!");
    }
}