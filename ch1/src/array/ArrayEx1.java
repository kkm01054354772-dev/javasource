package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열
        // '같은 타입'의 여러 변수를 하나의 묶음으로 다루는 것
        // 타입 배열명[]=new 타입[개수]; 배열 선언과 생성
        // 타입[] 배열명=new 타입[개수]; 이렇게 써도 됨
        // 기본형(int, long, float, double ,char, boolean), 참조형(String...)

        int[] array1 = new int[10]; // 정수형 기본 값 0
        System.out.println(array1[3]);

        double[] array2 = new double[5]; // 실수형 기본 값 0.0
        System.out.println(array2[2]);

        boolean[] array3 = new boolean[3]; // 논리형 기본 값 False
        System.out.println(array3[1]);

        char[] array4 = new char[3]; // 문자형 기본 값 비어있음
        System.out.println(array4[0]);

        int[] array5; // 배열 선언
        array5 = new int[5]; // 배열 생성

        // 초기화
        array1[0] = 88;
        array1[1] = 90;
        System.out.println(array1[1]);

        // 배열 선언 생성 초기화를 한번에 하는 방법
        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
