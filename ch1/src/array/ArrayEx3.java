package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 배열은 한번 생성하면 길이 변경이 불가능
        // 다른 길이의 배열로 이동시켜줘야 함
        // (1) 원래 배열
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        // (2) 직접 복사하기
        int[] tmp = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        System.out.println(Arrays.toString(tmp));

        // (3) System.arraycopy() : 시스템 코드 이용하기
        int[] tmp2 = new int[array.length * 2];
        System.arraycopy(array, 0, tmp2, 0, array.length);
        System.out.println(Arrays.toString(tmp2));

        // // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // for (int i = 0; i < tmp.length; i++) {
        // System.out.println(array[i]);
        // }

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // 두 배열 합치기
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);

        System.out.println(Arrays.toString(result));
    }
}
