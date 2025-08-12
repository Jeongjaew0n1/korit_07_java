package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        /*
            이상의 코드는 ProductView.java 를 확인햇을 때 객체를 생성하는 method
            생성자를 호출하지 않은 이유는 생성자가 private
            하지만 이상의 코드를 실행했을 때 1 번쨰 객체가 생성되었습니다.만 출력되었습니다.
            그런데 그 전에 static 배웠을 때는 1,2,3,4,5번째 객체가 생성되었습니다로 출력되었는데
            차이가 생성자 내에 지역 변수로 int counter 를 선언하고 초기화 했기 때문
            그래서 static 패키지 내부의 코드와 이번 ProductView 코드를 비교 / 대조해서 확인 해야함
         */


    }
}
