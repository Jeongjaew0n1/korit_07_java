package ch09_classes;

public class Constructor {
    int num;
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨.
    }

    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }

}
