package ch12_arrays;

public class Array08 {

    public static int calcSum(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static double calcAvg(int[] doubleArray) {
        double avg;
        double sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }
        avg = sum / doubleArray.length;
        return avg;
    }


    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100,97,55,24,49,68,20,77,89};

        // 이상의 예시 배열을 매개변수로 하는 총합을 구하는 method calcSum,
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형

        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("총합 : " + array08.calcAvg(scores) + "점");
    }
}
