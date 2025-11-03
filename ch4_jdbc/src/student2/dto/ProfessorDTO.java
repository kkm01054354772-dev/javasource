package student2.dto;

// DTO(Data Transfer Object)=VO(Value Object)

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ProfessorDTO {
    private String profId;
    private String name;
    private String deptId;

}
