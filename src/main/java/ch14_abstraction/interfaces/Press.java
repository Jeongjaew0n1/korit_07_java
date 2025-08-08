package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    // 안되는 예시
//    String age; // field(인스턴스 변수) 선언 불가능
//    public Press(){} // 생성자 불가능
//    void popout() {
//        System.out.println();  ("추상 메서드 x / 얘는 일반 메서드")
//    }

    void onPressed();
}
