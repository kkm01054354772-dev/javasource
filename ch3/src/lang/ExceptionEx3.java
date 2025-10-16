package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 예외처리 방법!

        // 1. NullPointerException : Null값에 접근할 때 나는 Exception (직접 호출 제외)
        String str = null; // 참조타입에만 null을 넣을 수 있음

        System.out.println(str);
        if (str != null) {
            System.out.println(str.length()); // NullPointerException
        }

        // 2. ArrayIndexOutOfBoundsException : 인덱스가 없을 때 불러오면 나는 Exception
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);
        }

        // 3. NumberFormatException : Number로 바꿀 수 없을 때
        try {
            // exception 발생 가능성 있는 코드
            String data1 = "a100";
            String data2 = args[0];
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            // exception 발생 시 해야 하는 작업
            System.out.println("data1 입력값확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("data2 인자확인");
        }

        // 4. ClassCastException : 형변환이 안되는 경우에 강제 형변환 시도할 때
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }

    }
}
