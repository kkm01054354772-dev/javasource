package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        // add : 추가 (append랑 비슷)
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");

        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.size()); // length 대신 size 사용

        // remove : 제거
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);

        // set : 특정위치의 값 변경
        list1.set(0, "포도");
        System.out.println(list1);

        // add : 중간 삽입도 가능
        list1.add(2, "딸기");
        System.out.println(list1);

        for (String string : list1) {
            System.out.println(string);
        }

        // sort : 정렬
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);

    }
}
