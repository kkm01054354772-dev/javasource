package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("포도");
        list.add("멜론");
        list.add("바나나");

        String[] strArr = {"오렌지","배","감"};
        // 배열 => List 변경
        List<String> list2 =Arrays.asList(strArr);
       

        // 정렬 후  출력 (Array , List 모두 원본이 변화함)
        // list.sort(Comparator.naturalOrder());
        // System.out.println(list);
        // System.out.println();
        
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(strArr));
        // System.out.println();

        // list => stream 변경
        Stream<String> stream1 = list.stream();
        // 배열 => stream 변경
        Stream<String> stream2= Arrays.stream(strArr);

        // 원본을 변경하지 않음
        stream1.sorted().forEach((x) -> System.out.println(x));
        stream2.sorted().forEach((x) -> System.out.println(x));
        System.out.println(list);
        System.out.println(Arrays.toString(strArr));


    }
}
