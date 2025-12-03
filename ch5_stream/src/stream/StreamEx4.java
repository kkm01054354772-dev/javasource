package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
    
        List<File> list = List.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"), new File("file4.txt"));
        // 파일명만 추출해서 하나의 리스토로 반환
        List<String> nameList = new ArrayList<>();
        for (File f: list) {
            nameList.add(f.getName());
        }
        System.out.println("nameList = " + nameList);

        Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"), new File("file4.txt"));
    
        // map() : 스트림 요소에 저장된 값 중에서 원하는 필드만 추출하거나 특정 형태로 변환할 때 사용
        // Stream<String> names = stream.map((f)->f.getName());
        Stream<String> names = stream.map(File::getName);
        names.forEach(System.out::println);

        
        // 대문자로 변경 후 출력
        List<String> list2 = List.of("abc","def","apple","melon","text");
        for (String string : list2) {
            System.out.println(string.toUpperCase());
        }

        Stream<String> stream2 = Stream.of("abc","def","apple","melon","text");
        // stream2.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        stream2.map(String::toUpperCase).forEach(System.out::println);
        
        System.out.println();



        // filter() : 조건에 안 맞는 요소 제외
        List<String> list3 = List.of("바둑","바나나","포도","딸기","바질","강아지");
        // '바'로 시작하는 요소 출력
        for (String string : list3) {
            if (string.startsWith("바")) {
                System.out.println(string);
            }
        }
        Stream<String> stream3 = list3.stream();
        stream3.filter((s)->s.startsWith("바")).forEach(System.out::println);

        // 이름이 '이'로 시작하는 학생 추출 
        List<Student> list4= new ArrayList<>();
        list4.add(new Student("홍길동", 98));
        list4.add(new Student("김길동", 65));
        list4.add(new Student("이길동", 78));
        list4.add(new Student("박길동", 80));

        for (Student student : list4) {
            if (student.getName().startsWith("이")) {
                System.out.println(student);
            }
        }

        Stream<Student> stream4 =Stream.of(new Student("홍길동", 98),new Student("김길동", 65),new Student("이길동", 78),new Student("박길동", 80));
        stream4.filter(s->s.getName().startsWith("이")).forEach(System.out::println); // 학생정보 추출
        // stream4.map(Student::getName).filter(s->s.startsWith("이")).forEach(System.out::println); // 이름만 추출
        
        IntStream.rangeClosed(1,20).filter(i->i % 2== 0).forEach(System.out::println);
    


        // distinct() : 중복 제거

        Stream<String> stream5 = Stream.of("바둑","바나나","바둑","딸기","바질","강아지");
        stream5.distinct().forEach(System.out::println);

        // 확장자 추출 및 중복 제거 (txt, bak, java)
        File file = new File("Arr.java");
        System.out.println(file.getName());
        // 확장자 추출
        String fileName= file.getName();
        System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));

        Stream<File> stream6 = Stream.of(new File("file1.txt"), 
        new File("file2.txt"),
        new File("Ex1"), 
        new File("Ex2.bak"),
        new File("Test.java"));

        System.out.println();

        stream6.map(File::getName) // 이름
        .peek(f->System.out.printf("이름 %s\n",f)) // 중간확인
        .filter(f -> f.lastIndexOf(".") > -1) // 확장자 있는 것만
        .peek(f->System.out.printf("확장자가 있는 이름 %s\n",f)) // 중간확인
        .map(f-> f.substring(f.lastIndexOf(".")+1)) // 확장자 부분만
        .peek(f->System.out.printf("확장자 %s\n",f)) // 중간확인
        .distinct() // 중복 제거
        .forEach(System.out::println);

        System.out.println();
    

        // peek() : 중간연산확인
        // skip(), limit() 
        Stream<String> stream7 = Stream.of("바둑","바나나","바둑","딸기","바질","강아지");
        stream7.skip(2).limit(3).forEach(System.out::println); // 2개 넘어가서 3개만 추출
   
        
        // -----최종연산-----
        
        // collect()
        Stream<Student> stream8 =Stream.of(new Student("홍길동", 98),new Student("김길동", 65),new Student("이길동", 78),new Student("박길동", 80));
        
        // 점수만 모아서 새로운 리스트로 반환
        List<Integer> list6 = stream8.map(Student::getScore).collect(Collectors.toList());
        System.out.println(list6);

        // count()
        long count = IntStream.rangeClosed(1, 10).filter(i -> i %2 == 0).count();
        System.out.println("2의 배수 개수 : " + count);
        OptionalDouble avg = IntStream.rangeClosed(1, 10).filter(i -> i %2 == 0).average();
        System.out.println("2의 배수 평균 : " + avg);
        int sum = IntStream.rangeClosed(1, 10).filter(i -> i %2 == 0).sum();
        System.out.println("2의 배수 합: " + sum);
        OptionalInt max= IntStream.rangeClosed(1, 10).filter(i -> i %2 == 0).max();
        System.out.println("2의 배수 최대값: " + max);
        OptionalInt min= IntStream.rangeClosed(1, 10).filter(i -> i %2 == 0).min();
        System.out.println("2의 배수 최소값: " + min);




    }

}
