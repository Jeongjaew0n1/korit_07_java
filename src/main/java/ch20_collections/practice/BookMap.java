package ch20_collections.practice;

import java.util.*;

/*
    서점에서 판매하는 책 재고를 관리하는 프로그램
    지시 사항
    1. Map을 사용하여 도서명(String)을 Key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map에 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>> 10
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 2
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    도서명 : 자바의 정석, 재고 수량 : 9 권

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램이 종료되었습니다.
 */
public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> BookInventory = new HashMap<>();

        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    String Bookname = scanner.nextLine();
                    if (BookInventory.containsKey(Bookname)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else{
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int BookStock = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print(Bookname + " 도서가 " + BookStock + " 권 추가되었습니다.\n");
                        BookInventory.put(Bookname, BookStock);
                    }
                    break;
                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    String changeBookName = scanner.nextLine();
                    if (BookInventory.containsKey(changeBookName)) {
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        int changeBookStock = scanner.nextInt();
                        scanner.nextLine();
                        BookInventory.replace(changeBookName, changeBookStock);
                        System.out.print(changeBookName + " 도서가 " + changeBookStock + "권으로 변경되었습니다.\n");
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.\n");
                    }
                    break;
                case 3:
                    Set<String> keySet = BookInventory.keySet();
                    List<String> keyList = new ArrayList<>(keySet);

                    for (String key : keyList) {
                        System.out.println("도서명 : " + key + " , 재고 수량 : " + BookInventory.get(key));
                    }
                    break;
                case 4:
                    System.out.println("프로그램이 종료되었습니다.");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
