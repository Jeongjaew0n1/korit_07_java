package ch11_access_modifier;

import ch08_methods.ScoreCalc2;

class Character {
    /*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로 다양한 접근 수준의 필드와 매서드로 갖는 캐릭터 클래스를 정의하고
    이를 CharacterMain 클래스에서 기능 테스트를 수행할 것입니다.

    클래스 설계
    1. 필드
    name - 캐릭터 이름 -> 공개가능
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬이름 -> 자식 클래스만
    exp - 경험치 -> 외부에서 완전 차단

    Character 클래스에 인스턴스인 warrior를 생성하고
    이름 전사
    체력 100
    공격력 100
    스킬 세로베기
    exp 10
    으로 기본 생성자를 통해 생성하고, setter를 통해 데이터를 설정

    2. 메서드 정의
    getHealth() -> 체력 값을 반환하는 getter -> public / 이미 자동완성으로 만들었습니다.
    attack() -> 공격 시 콘솔 장애
        name 이 power로 공격 !
        name 이(가) 경헙치 amount을(를) 업었습니다. -> 라고 두 줄 출력되게 작성할 것. call1() 유형으로
    heal() -> 체력이 10 회복하고, 현재 체력 출력
        체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력)
    gainExp(int amount) -> call2()유형 경험치 증가 시키는 메서드(내부 전용)
    실행 예
    name이(가) 경험치 amount을(를) 얻었습니다.
     */

    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;
    private int amount;

    /*
    heal() -> 체력이 10 회복하고, 현재 체력 출력
        체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력)
     */
    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health);
    }

    /*
    attack() -> 공격 시 콘솔 장애
        name 이 power로 공격 !
        name 이(가) 경헙치 amount을(를) 얻었습니다. -> 라고 두 줄 출력되게 작성할 것. call1() 유형으로
     */
    public void attack() {
        System.out.println(name + "가(이) " + power + "로 공격 !\n");
    }

    /*
     gainExp(int amount) -> call2()유형 경험치 증가 시키는 메서드(내부 전용)
     */
    public void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치 " + amount + "을(를) 얻었습니다.\n");
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
    }

    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    void showCharacter() {
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + health);
        System.out.println("공격력 : " + power);
        System.out.println("스킬 : " + skill);
        System.out.println("exp : " + exp);
    }

}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character("전사",200,"세로베기");
//        warrior.setName("전사");
//        warrior.setHealth(100);
//        warrior.setPower(100);
//        warrior.setSkill("세로베기");
//        warrior.setExp(10);

//        warrior.gainExp(1000); // gainExp()를 private 처리했기 때문에 오류
        warrior.attack();
        warrior.heal();
    }
}
