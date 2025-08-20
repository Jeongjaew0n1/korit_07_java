package ch18_static.singleton.products;

public class ProductView {
    // ProductView 클래스의 정적 field의 instance
    // 보통 싱글톤 패턴 만들때 정적 변수 이름이 instance 입니다. -> 이게 시험시 힌트 중 하나.
    private static ProductView instance;

    // private 생성자 선언 -> 객체가 하나만 생성되는걸 보장하기 위한 접근지정자이므로 매우 중요
    private ProductView() {
        int counter = 1; // 이건 객체 생성될 때 만들어지는 지역 번수
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    // static 메스드의 정의 -> 대부분의 경우 getInstance() -> 시험 힌트. 클래스명.메서드명() 호출
    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView(); // ProductView 생성자를 호출하여 instance에 대입
        }
        return instance;
    }



}
