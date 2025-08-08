package ch10_getter_setter.univ_student;

public class UnivStudentMain {

    public static void main(String[] args) {
        /*
         4. UnixStudentMain 에서
         student1 -> 기본 생성자 김일 / 1 / 3.3
         student2 -> 기본 생성자 김이 / 3 / -30 -> 실패하고 4.0 입력
         student3 -> 기본 생성자 김삼 / 5  -> 실패하고 2 / 2.7
         student4 -> 기본 생성자 김사 / 4 / 3.8
         student5 -> 기본 생성자 김오 / 3 / 1.0
         으로 객체 생성
         */
        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent();
        UnivStudent univStudent3 = new UnivStudent();
        UnivStudent univStudent4 = new UnivStudent();
        UnivStudent univStudent5 = new UnivStudent();

        univStudent1.setName("김일");
        univStudent2.setName("김이");
        univStudent3.setName("김삼");
        univStudent4.setName("김사");
        univStudent5.setName("김오");

        univStudent1.setGrade(1);
        univStudent2.setGrade(3);
        univStudent3.setGrade(5);
        univStudent4.setGrade(4);
        univStudent5.setGrade(3);

        univStudent1.setScore(3.3);
        univStudent2.setScore(-30);
        univStudent3.setScore(2.7);
        univStudent4.setScore(3.8);
        univStudent5.setScore(1);

        univStudent2.setScore(4);
        univStudent3.setGrade(2);

        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();
    }
}
