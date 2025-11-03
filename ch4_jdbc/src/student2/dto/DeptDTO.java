package student2.dto;

// DTO(Data Transfer Object)=VO(Value Object)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // @Getter, @Setter, @ToString, @RequiredArgsConstructor, @EqualsAndHashCode
public class DeptDTO {
    private String deptId;
    private String deptName;
}
