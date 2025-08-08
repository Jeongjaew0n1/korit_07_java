package ch14_abstraction.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 하나 올립니다.");
    }

    @Override
    public String onUp() {
        return "볼륨을 계속 " + super.onUp();
    }

}