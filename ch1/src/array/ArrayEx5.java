package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 숫자섞기 코드

        // 0~9까지 10개의 정수를 담는 배열
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        int tmp = 0;

        // 0~9 사이의 임의의 수 추출
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            tmp = arr[0];
            arr[0] = arr[random]; // 0~ 9
            arr[random] = tmp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
