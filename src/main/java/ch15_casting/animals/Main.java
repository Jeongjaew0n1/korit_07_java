package ch15_casting.animals;

public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = new Dog(); // 업캐스팅 #1
        Animal animal2 = new Dog(); // A a = new B();
        animal1.makeSound();
        // Dog 클래스의 메서드가 적용됨. 즉 재정의된 method가 호출됨.
//        animal1.fetch(); // 실행안됨

        Animal animal3 = new Animal();
        animal3.makeSound();

        // Animal animal1 = new Dog();
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal2 instanceof Animal;
        System.out.println(result2);

        // 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();
        // Animal animal2 = new Dog();
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);

        // animal3의 경우 Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);

        System.out.println("↑ 업캐스팅 부분입니다.");
        System.out.println("↓ 다운캐스팅 부분입니다.");

        Dog dog2 = (Dog) animal2;
        // 다운캐스팅 방법 -> 위에 보시면 Animal animal2 = new Dog();으로 생성해서 dog2 객체명은 없습니다.

        dog2.makeSound();
        dog2.fetch();
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스턴스인 animal2를 downcasting했습니다.
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고,
        // Dog 클래스의 고유 메서드인 fetch();도 호출이 가능합니다.
        // 여전히 B b = new B();로 생성하면 귀찮은 일 없지 않냐는 의문이 존재합니다.

//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();

        /*
             즉 애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
             (A a = new A();이기 때문에)
             하위 클래스의 인스턴스로 다운캐스팅하는 것이 불가능합니다.

         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야 합니다.(그리고 둘은 상속관계여야합니다)

        System.out.println("animal4 검증");
        if (animal4 instanceof Dog) { // 이 조건식이 true라면 animal4의 생성시 호출된 생성자는 Dog();
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3은 다운캐스팅 안되는거 알았으니까 검증 후에 다운캐스팅 시도해야겠네요");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }
    }
}
