package util;

public class Member {

    private String id;
    private String password;
    private String name;

    // 생성자
    public Member() {
    }

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // setters & getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
    }

    // 아이디가 같으면 같은 멤버로 인식하도록 하기
    // hashCode(), equals() 재정의
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member other = (Member) obj;
            return id.equals(other.id);
        }
        return false;
    }

}
