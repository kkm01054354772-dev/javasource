package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.service.DeptService;

public class DeptMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        DeptService deptService = new DeptService();
        ConsoleInfo info = new ConsoleInfo();

        while (run) {
            System.out.println(
                    "=========================================================================================");
            System.out.print("1. 학과등록 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과조회 | ");
            System.out.println("5. 전체학과조회 | ");
            System.out.print("6. 교수정보입력 | ");
            System.out.print("7. 교수정보수정 | ");
            System.out.print("8. 교수정보삭제 | ");
            System.out.print("9. 교수정보조회 | ");
            System.out.println("10. 프로그램종료");
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
                case 10:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}
