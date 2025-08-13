package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalData<T> {
    private T animal;
    /*
    현재 AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은
    Tiger / Human 객체를 필드에 대입

    근데 T에는 어떤 클래스도 들어갈 수 있기 때문에 현재 상황에서는
    Car 클래스의 객체도 animal 필드에 들어갈 수 있을겁니다.

    목표는 특정 클래스라면(즉 Animal 클래스의 상속을 받은 서브 클래스)
    해당 클래스에 맞는 객체 정보를 출력
 */
    public void showData() {
        ((Animal) animal).move();
        // 앞부분의 Animal은 형변환 / animal은 필드 이름
        // AnimalData의 필드인 animal을 Animal 타입으로 형변환하여 .move() 메서드를 호출
        // 호랑이가 네 발로 뜁니다. / 사람이 두 발로 뜁니다. 출력
        if (animal.getClass() == Human.class) {
            ((Human)animal).read();
            // 현재 필드에 들어간 animal 객체의 클래스를 확인하여
            // .getclass를 통해 그게 Human 클래스라면 고유 메서드 read 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }

}
