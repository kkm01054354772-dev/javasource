package object;

public class SubscriberInfo {
    // 가입자 정보:
    // 이름, 아이디, 비밀번호, 전화번호
    private String name;
    private String id;
    private String password;
    private String phone;

    // 비밀번호 변경, 전화번호 변경
    void changePassword(String password) {
        this.password = password;
    }

    void changePhone(String phone) {
        this.phone = phone;
    }

    // setter (password/phone : change와 기능이 동일해서 안넣음)
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 멤버변수(필드)가 가지고 있는 값을 출력
    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

    // getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

}
