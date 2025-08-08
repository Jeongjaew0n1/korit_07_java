package ch13_inheritance;

public class Tiger extends Animal{ // 자식클래스 extends 부모클래스
    // field에 getter / setter는 없지만
    // Tiger의 고유 메서드는 또 따르 정의 가능

    public void Hunt() {
        System.out.println(getAnimalName() + "이(가) 사냥합니다.");
    }

    public void Hunt(String prev) {
        System.out.println(getAnimalName() + "이(가) " + prev + "를 사냥합니다.");
    }

    // 재정의된 method : 부모 메서드의 결과값과 다르게 작성한다면 전부 재정의에 해당함.
    @Override
    public String getAnimalName() {
        return super.getAnimalName() + "님";
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override   // 이 경우는 method 명만 동일하게 하고 전부 다 재정의합니다.
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}
