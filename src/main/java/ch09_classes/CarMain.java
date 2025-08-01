package ch09_classes;
/*
    CarMain 클래스를 생성
    Car의 인스턴스인 myCar 라는 객체를 생성하시오.
    color에 빨강 대입, speed에 160 대입
    yourCar 객체 생성하시오.
    color에 노랑 대입, speed 180 대입
    myCar는 drive() 메서드 호출
    yourCar는 brake() 메서드 호출
    myCar, yourCar에 각각 displayInfo() 메서드 호출하시오.
 */
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        myCar.speed = 160;
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();

    }
}
