package lang;

// 멀티 catch
public class ExceptionEx5 {
    public static void main(String[] args) {

        try {
            // exception 발생 가능성 있는 코드
            String data1 = "a100";
            String data2 = args[0];
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // exception 발생 시 해야 하는 작업
            System.out.println("data1 입력값 또는 data2 인자값 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
