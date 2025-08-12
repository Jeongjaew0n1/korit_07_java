package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("정재원")
                .age(28)
                .address("부산광역시 기장군")
                .build();
        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김일")
                .build();
        System.out.println(person2);
    }
}
