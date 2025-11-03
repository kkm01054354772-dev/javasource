package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;

public class ConsoleInfo {

    // 삭제
    public String getDeptId(Scanner sc) {
        System.out.println("삭제할 학과코드를 입력");
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();

        return deptId;
    }

    // 생성, 업데이트
    public DeptDTO setDept(Scanner sc) {
        System.out.println("학과 정보 입력");
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();

        return new DeptDTO(deptId, deptName);
    }

    // 일부출력
    public void print(DeptDTO deptDTO) {
        System.out.println("\n학과 정보");
        System.out.println("학과번호 / 학과명");
        System.out.print(deptDTO.getDeptId() + "\t");
        System.out.println(deptDTO.getDeptName());
    }

    public String getDeptName(Scanner sc) {
        System.out.print("조회할 학과명을 입력 >> ");
        String deptName = sc.nextLine();
        return deptName;
    }

    // 전체출력
    public void printAll(List<DeptDTO> list) {
        System.out.println("\n전체 학과 정보");
        System.out.println("학과번호 / 학과명");
        for (DeptDTO deptDTO : list) {
            System.out.print(deptDTO.getDeptId() + "\t");
            System.out.print(deptDTO.getDeptName() + "\n");
        }
    }

}
