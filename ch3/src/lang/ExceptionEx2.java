package lang;

public class ExceptionEx2 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[0];
        System.out.println("총합 : " + getTotal(arr));
        System.out.println("평균 : " + getAverage(arr));

    }

    public static int getTotal(int arr[]) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    public static double getAverage(int arr[]) throws Exception {
        if (arr.length == 0) {
            throw new Exception("비어있는 배열입니다.");
        }
        return getTotal(arr) / arr.length;
    }

}
