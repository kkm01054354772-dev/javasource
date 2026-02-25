package basic;

// 불변객체
public record User(String name, int age) {

    public boolean isAdult() {
        return age >= 20;
    }

}

/*
 * public final class User{
 * 
 * private String name;
 * private int age;
 * 
 * // 생성자
 * public User(String name, int age){
 * this.name = name;
 * this.age = age;
 * }
 * 
 * public String name() {return name;}
 * public int age() {return age;}
 * 
 * toString(){}
 * 
 * }
 * 
 */