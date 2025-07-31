package ch07_loops;

/*
    for (int i = 0 ; i < 10 ; i ++) {
        (반복실행문1-a)
        for(int j = 0 ; j < 10 ; j ++) {
            반복실행문2
        }
        (반복실행문1-b)
        for(int k = 0 ; k < 10 ; k++) {
            반복실행문3
        }
        (반복실행문1-c)
    }

    *
    **
    ***
    ****
    *****
    고려 사항
    반복은 몇 번 이루어지는가?
    무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
    왜 라인마다 별의 갯수가 달라지는가?

 */
public class Loop06 {
    public static void main(String[] args) {

//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            별 찍기를 통한 for 문 구조 학습
                    i = 0, j = 0일 때는 두 번째 for 문이 작동 안하기 때문에 개행만. 별x
            *       i = 1, j = 0일 때 별 하나 찍고, i = 1 / j = 1일 때 false
            **      i = 2, j = 0일 때 별 두 개
            ***     i = 3...
         */

        /*
        *****
        ****
        ***
        **
        *
         */

//        for (int i = 5 ; i > 0 ; i--) {
//            for (int j = 0 ; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j - i > 0; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 100부터 1까지 역순으로
//        for (int i = 100 ; i > 0 ; i--) {
//            System.out.println(i);
//        }

        // window + . 이모지 사용법
    }
}