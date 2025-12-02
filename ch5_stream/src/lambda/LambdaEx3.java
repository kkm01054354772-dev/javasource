package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx3 {
    public static void main(String[] args) {
        
        Supplier<Integer> supplier = () -> (int)(Math.random()*100)+1;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(10);
        
        Predicate<Integer> predicate = (y) -> y % 2 == 0 ;
        System.out.println(predicate.test(15)? "짝수" : "홀수" );

        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println(function.apply(10));


        Function<String, Integer> function2 = (x) -> Integer.parseInt(x);
        System.out.println(function2.apply("15"));

        // 문자열의 길이가 0이라면 '빈 문자열 입니다.' 출력
        // String str = "";
        // System.out.println(str.length() == 0 ? "빈 문자열 입니다." : "");

        Predicate<String> predicate2 = (s) -> s.length() == 0;
        System.out.println(predicate2.test("") ? "빈 문자열 입니다." : "");


        BiConsumer<Integer,Integer> biconsumer = (x, y) -> System.out.println(x+y);
        biconsumer.accept(5,6);

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y; // return x+y;
        System.out.println(biFunction.apply(5,2));

        BiFunction<String, String, Boolean> biFunction2 =  (s1, s2) -> s1.equals(s2);
        System.out.println(biFunction2.apply("test","test1")); 
        
        biFunction2 = String::equals;
        System.out.println(biFunction2.apply("test","test1")); 

    }
}
