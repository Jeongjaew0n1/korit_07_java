package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .name("김일")
                .age(20)
                .address("부산광역시")
                .build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().address("서울특별시").build();
        System.out.println(person3);
    }
}
