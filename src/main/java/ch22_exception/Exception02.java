package ch22_exception;

import ch15_casting.centralcontrol.LED;

class LoginFailedException extends Exception {
    // 매개변수 생성자
    public LoginFailedException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

public class Exception02 {

    public static void login(String id, String pawd) throws LoginFailedException {
        String correctId = "admin";
        String correctPawd = "1q2w3e4r";

        if (!id.equals(correctId) || !pawd.equals(correctPawd)) {
//            System.out.println("ID / 비밀번호를 다시 입력해주세요.");
        } throw new LoginFailedException("ID 혹은 passward 가 틀렸습니다.");

    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPawd = "1234qwer";
//        login(inputId, inputPawd);
        try {
            login(inputId, inputPawd);
        } catch (LoginFailedException e) {
            // 자동완성으로 사용자 정의 Exception 클래스가 나왔는데,
            // 그 근거는 login() 메서드 다음에 throws LoginFailedException 을 작성했기 때문
            System.out.println("로그인 실패 : " + e.getMessage());

        } finally {
            System.out.println("프로그램 종료");
        }


    }
}



