package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student("홍길동", 98));
        list.add(new Student("김길동", 65));
        list.add(new Student("이길동", 78));
        list.add(new Student("박길동", 80));
        
        // forEach

        // list.forEach(null);
        // list.stream().forEach((s)->System.out.println(s.getName() + " : " + s.getScore()));

        list.stream().forEach(System.out::println); 
        // list.stream().forEach((s)->System.out.println(s));
    }
}
