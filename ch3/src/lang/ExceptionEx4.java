package lang;

// 다중 catch
public class ExceptionEx4 {
    public static void main(String[] args) {

        try {
            // exception 발생 가능성 있는 코드
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
            String data2 = args[0];
        } catch (NumberFormatException e) {
            System.out.println("data1 입력값확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("data2 인자확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램을 재실행");
        }

    }

}
