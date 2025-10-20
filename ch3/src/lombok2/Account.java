package lombok2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode // equals(), hashCode()
@AllArgsConstructor // 전체 멤버변수 생성자
@NoArgsConstructor // 기본 생성자
@Setter
@Getter
@ToString
@Builder
// @로 시작하는 것 : 어노테이션
public class Account {
    private String name;
    private String accNo;
    private int balance;

    // 생성자 , getter, setter, toString() 등을 어노테이션 처리
    // equals, hashCode
    // Builder

}
