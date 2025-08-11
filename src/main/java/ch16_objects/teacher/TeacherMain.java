package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수","코리아아이티");
        Teacher teacher2 = new Teacher("안근수","코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);

        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        System.out.println(tClass.getSimpleName());
        System.out.println(teacher1.getClass().getSimpleName());

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields); // 주소지 출력됨
        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
        }
        // 향상된 for문으로 출력
        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());
        }

        System.out.println("-------------------------------------");
        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("메서드 및 출력 : " + methods[i].getName());
            System.out.println("기본 타입 출력 : " + methods[i].getReturnType() + "\n");
        }

        // 새로운 객체 만들건데 주의사항
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("안근수","코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); // 결0과값 : false - 필드값이 똑같다 하더라도 클래스가 다르다면 다르다
//        System.out.println(teacher3 instanceof Teacher); // teacher3의 자료형은 ch16_objects.Teacher


    }
}
