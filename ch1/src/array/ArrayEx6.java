package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 1~45를 저장
        // [0]~[5]까지 중 하나와 [0]~[44] 중 하나를 무작위로 교환

        int arr[] = new int[45];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int tmp = 0;
        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 45);
            tmp = arr[i];
            arr[i] = arr[random];
            arr[random] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
