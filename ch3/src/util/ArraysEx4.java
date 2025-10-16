package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // Integer[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

        // 검색
        // 1. 순차검색
        // 2. 이진검색 : 정렬 후 실행해야 함
        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 62);
        System.out.print("62는 " + (pos + 1) + "번째에 있다");
    }
}
