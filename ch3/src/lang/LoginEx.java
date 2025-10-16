package lang;

// NotExistException, WrongPasswordException
public class LoginEx {
    public static void main(String[] args) {

        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (NotExistException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }

    public static void login(String id, String password) throws NotExistException, WrongPasswordException {
        // id가 블루가 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {
            throw new NotExistException("등록되지 않은 ID입니다.");
        }
        // password가 "12345"가 아니면 WrongPasswordException 발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("잘못된 Password입니다. 다시 입력해주세요.");
        }
    }

}
