package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    // ---------------- Student
    public StudentDTO insertStudent(Scanner sc) {
        System.out.print("생성할 학번을 입력 >> ");
        String studentId = sc.nextLine();
        System.out.print("이름을 입력 >> ");
        String name = sc.nextLine();
        System.out.print("키를 입력 >> ");
        Double height = Double.parseDouble(sc.nextLine());
        System.out.print("학과코드를 입력 >> ");
        String deptId = sc.nextLine();

        return new StudentDTO(studentId, name, height, deptId);
    }

    public StudentDTO updateStudent(Scanner sc) {
        System.out.println("======== 학생 정보 수정 ========");
        System.out.print("수정할 학생의 학번 입력 >> ");
        String studentId = sc.nextLine();
        System.out.print(" 수정할 키를 입력 >>");
        Double height = Double.parseDouble(sc.nextLine());

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentId(studentId);
        studentDTO.setHeight(height);

        return studentDTO;
    }

    public String deleteStudent(Scanner sc) {
        System.out.println("======== 학생 정보 삭제 ========");
        System.out.print("삭제할 학생의 학번 입력 >> ");
        String studentId = sc.nextLine();

        return studentId;
    }

    public String getDeptStudent(Scanner sc) {
        System.out.println("======== 학과별 학생 정보 조회 ========");
        System.out.print("조회할 학과를 입력 >> ");
        String deptId = sc.nextLine();

        return deptId;
    }

    public void printAllStudent(List<StudentDTO> list) {
        for (StudentDTO dto : list) {
            System.out.printf("%s \t %s \t %.2f \t %s", dto.getStudentId(), dto.getName(), dto.getHeight(),
                    dto.getDeptId());
            System.out.println();
        }
    }

    public String getStudentId(Scanner sc) {
        System.out.println("========학생 정보 조회 ========");
        System.out.print("조회할 학생의 학번 입력 >> ");
        String studentId = sc.nextLine();

        return studentId;
    }

    public void printStudent(StudentDTO dto) {
        System.out.printf("%s \t %s \t %.2f \t %s", dto.getStudentId(), dto.getName(), dto.getHeight(),
                dto.getDeptId());
    }

    // ---------------- Professor
    public ProfessorDTO insertProfessor(Scanner sc) {

        System.out.print("생성할 아이디를 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름을 입력 >> ");
        String name = sc.nextLine();
        System.out.print("학과코드를 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, name, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
        // 교수의 아이디를 입력받아 해당 교수의 학과를 수정
        System.out.println("======== 교수 정보 수정 ========");
        System.out.print("수정할 교수의 아이디를 입력 >> ");
        String profId = sc.nextLine();
        System.out.print(" 수정할 학과코드를 입력 >>");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);

        return professorDTO;
    }

    public String deleteProfessor(Scanner sc) {
        System.out.println("======== 교수 정보 삭제 ========");
        System.out.print("삭제할 교수의 아이디를 입력 >> ");
        String profId = sc.nextLine();

        return profId;
    }

    public String selectProfessor(Scanner sc) {
        // Prof_ID로 조회
        System.out.println("======== 교수 정보 조회 ========");
        System.out.print("조회할 교수의 아이디를 입력 >> ");
        String profId = sc.nextLine();

        return profId;
    }

    public void printProfessor(ProfessorDTO dto) {
        System.out.println("교수번호 : " + dto.getProfId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("학과코드 : " + dto.getDeptId());
    }

    // ---------------- DEPT
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
