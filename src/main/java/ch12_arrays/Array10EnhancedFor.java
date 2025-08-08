package ch12_arrays;

public class Array10EnhancedFor {
    public static void main(String[] args) {
        int[] nums = new int[200];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        // 향상된 for문
        for (int number : nums) {
            System.out.print(number + " ");
        }
        System.out.println();
//        number = 201; 오류 발생

        // String 배열에 김일, 김이, 김삼, 김사, 김오 라는 요소를 가지도록 작성하고
        // 일반 for 문으로 김일 김이 김삼 ~ 출력
        // 향상문 for문 출력
        String[] names = {"김일","김이","김삼","김사","김오"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for (String name :names){
            System.out.print(name + " ");
        }
    }
}



