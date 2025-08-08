package ch10_getter_setter.univ_student;

import ch10_getter_setter.Person;

public class UnivStudent {
    /*
    1. 클래스 설계
    name / grade(1,2,3) / score(double) 로 필드 정의
     */
    String name;
    int grade;
    double score;

    /*
    2. 생성자
    1) 기본
    2) 이름만
    3) 학년만
    4) 이름과 학년
    5) 전부 다
     */
    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    /*
    3. Setter / Getter 메서드 정의
    각각의 필드에 대한 Setter / Getter를 정의
    Setter 3개 / Getter 3개
    1) setGrade의 범위 1~4학년
    2) setScore 범위 0.0 ~ 4.5
    범위를 벗어날 경우 불가능한 입력입니다. 가 출력되도록 작성
     */
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5) {
            this.grade = grade;
        } else {
            System.out.println(name + " 학생의 학년이 불가능한 입력입니다.");
        }
    }

    public void setScore(double score) {
        if (score > 4.5 || score < 0.0) {
            System.out.println(name + "학생의 점수가 불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    /*
    5. 콘솔창에
         이름 : 김일
         학년 : 1학년
         점수 :  3.3
         으로 출력되도록 showInfo() 메서드를 call1() 유형으로 작성
     */
    void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
        System.out.println();
    }
}

