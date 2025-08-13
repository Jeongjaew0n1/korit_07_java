package ch19_generic.wildcard;

public class Main {
    // AnimalData에서 필드로 들어온 객체가 Animal 클래스의 서브 클래스인지 확인하는 작업
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }
    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());

        animalData1.showData();
        animalData2.showData();
//        animalData3.showData(); // 오류 발생
        /*
            AnimalData 클래스에서 정의된 메서드 로직을 확인하면 필드를 (Animal()로 형변환 시키는데,
            Car 클래스의 인스턴스를 Animal로 형변환시키는 것이 불가능하기 때문입니다.
            즉 제네릭'만을' 사용했을 때 생길 수 있는 문제점
         */
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);
        /*
            .getAnimal()을 정의하지 않았다고 가정한다면 현재 animalData4,5,6의 필드에 어떤 클래스의 객체가 들어가있느지 모름
         */
        if (animalData4 != null) {
            animalData4.showData();
        }
        if (animalData5 != null) {
            animalData5.showData();
        }
        if (animalData6 != null) {
            animalData6.showData();
        } else {
            System.out.println("아무것도 없습니다.");
        }

    }
}
