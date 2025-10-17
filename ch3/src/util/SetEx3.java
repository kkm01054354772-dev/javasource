package util;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("hong12", "hong12", "홍길동"));
        set.add(new Member("hong34", "hong34", "홍길동"));
        set.add(new Member("hong56", "hong56", "홍길동"));
        set.add(new Member("hong12", "hong78", "홍길동"));
        for (Member member : set) {
            System.out.println(member);
        }

    }
}
