package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;

public class DeptMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
        StudentService studentService = new StudentService();
        ConsoleInfo info = new ConsoleInfo();

        while (run) {
            System.out.println(
                    "=========================================================================================");
            System.out.print("1. 학과등록 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과조회 | ");
            System.out.println("5. 전체학과조회 | ");
            System.out.print("6. 교수정보등록 | ");
            System.out.print("7. 교수정보수정 | ");
            System.out.print("8. 교수정보삭제 | ");
            System.out.println("9. 교수정보조회 | ");
            System.out.print("10. 학생정보등록 | ");
            System.out.print("11. 학생정보수정 | ");
            System.out.print("12. 학생정보삭제 | ");
            System.out.print("13. 학생정보조회(학과별) | ");
            System.out.println("14. 학생정보조회(개인별) | ");
            System.out.println("15. 프로그램종료");
            System.out.println(
                    "=========================================================================================");
            System.out.print("선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 학과등록
                    DeptDTO dto = info.setDept(sc);
                    boolean result = deptService.addDept(dto);
                    System.out.println(result ? "학과등록 성공" : "학과등록 실패");

                    break;
                case 2:
                    // 학과수정
                    dto = info.setDept(sc);
                    result = deptService.updateDept(dto);
                    System.out.println(result ? "학과수정 성공" : "학과수정 실패");

                    break;
                case 3:
                    // 학과삭제
                    String deptId = info.getDeptId(sc);
                    result = deptService.removeDept(deptId);
                    System.out.println(result ? "학과삭제 성공" : "학과삭제 실패");

                    break;
                case 4:
                    // 학과조회
                    String deptName = info.getDeptName(sc);
                    dto = deptService.getDept(deptName);
                    info.print(dto);
                    break;
                case 5:
                    // 전체학과조회
                    List<DeptDTO> list = deptService.getDepts();
                    info.printAll(list);
                    break;
                case 6:
                    // 교수등록
                    ProfessorDTO professorDTO = info.insertProfessor(sc);
                    result = professorService.insertProfessor(professorDTO);
                    System.out.println(result ? "교수등록성공" : "교수등록실패");

                    break;
                case 7:
                    // 교수수정
                    professorDTO = info.updateProfessor(sc);
                    result = professorService.updateProfessor(professorDTO);
                    System.out.println(result ? "교수학과수정성공" : "교수학과수정실패");
                    break;
                case 8:
                    // 교수삭제
                    String profId = info.deleteProfessor(sc);
                    result = professorService.deleteProfessor(profId);
                    System.out.println(result ? "교수삭제성공" : "교수삭제실패");
                    break;
                case 9:
                    // 교수조회
                    profId = info.selectProfessor(sc);
                    professorDTO = professorService.getProfessor(profId);
                    info.printProfessor(professorDTO);
                    break;
                case 10:
                    // 학생등록
                    StudentDTO studentDTO = info.insertStudent(sc);
                    result = studentService.insertStudent(studentDTO);
                    System.out.println(result ? "학생등록성공" : "학생등록실패");
                    break;
                case 11:
                    // 학생수정
                    studentDTO = info.updateStudent(sc);
                    result = studentService.updateStudent(studentDTO);
                    System.out.println(result ? "키수정성공" : "키수정실패");
                    break;
                case 12:
                    // 학생삭제
                    String studentId = info.deleteStudent(sc);
                    result = studentService.deleteStudent(studentId);
                    System.out.println(result ? "학생삭제성공" : "학생삭제실패");
                    break;
                case 13:
                    // 학과별조회
                    deptId = info.getDeptStudent(sc);
                    List<StudentDTO> studentlist = studentService.getStudents(deptId);
                    info.printAllStudent(studentlist);
                    break;
                case 14:
                    // 개인별조회
                    studentId = info.getStudentId(sc);
                    studentDTO = studentService.getStudent(studentId);
                    info.printStudent(studentDTO);
                    break;
                case 15:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}
