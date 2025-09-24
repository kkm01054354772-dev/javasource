package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단항연산자 : ++,--(1증가, 1감소)
        int i = 5;
        i++; // i=i+1;
        System.out.println(i);
        i--;
        System.out.println(i);

        int j = 10;
        ++j;
        System.out.println(j);

        // ++ 앞 뒤에 들어갔을 때의 차이

        int k = 5, l = 0;
        l = k++; // l=k; k++; 담고나서 +
        System.out.println("l= k++ 실행 후, k=" + k + ",l=" + l); // k=6, l=5

        k = 5;
        l = 0;
        l = ++k; // ++k; l=k; +하고 담기
        System.out.println("l= ++k 실행 후, k=" + k + ",l=" + l); // k=6, l=6

    }
}
