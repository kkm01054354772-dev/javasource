package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // a, b, c, d 담기
        char array1[] = { 'a', 'b', 'c', 'd' };
        // 99.8, 85, 77.8, 63.8
        double array2[] = { 99.8, 85, 77.8, 63.8 };
        // "bear","snow", "sun"
        String[] array3 = { "bear", "snow", "sun" };

        // 1~10의 임의의 수 생성 후 초기화
        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 10) + 1;
        }

        Scanner sc = new Scanner(System.in);

        // 배열의 길이를 입력 받아서 결정
        System.out.println("Array5의 배열 길이 입력 : ");
        int[] array5 = new int[sc.nextInt()];

        // 배열 출력
        // (1) Arrays.toString() : 배열이 가지고 있는 실제 값 출력
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));
        // (2) for 출력
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        // (3) 향상된 for (for each) : 배열 안에서 하나씩 차례대로 가지고 나옴
        for (String i : array3) {
            System.out.println(i);
        }

    }
}
