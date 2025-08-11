package ch15_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨의 전원을 끕니다.");
    }

    // downcasting
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿨습니다.");
    }
}
