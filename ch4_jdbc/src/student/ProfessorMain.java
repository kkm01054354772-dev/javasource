package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProfessorMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            boolean run = true;
            while (run) {

                System.out.println("================================");
                System.out.println("1. 교수정보입력");
                System.out.println("2. 교수정보수정");
                System.out.println("3. 교수정보삭제");
                System.out.println("4. 교수정보조회");
                System.out.println("5. 프로그램종료");
                System.out.println("================================");
                System.out.print("선택 >> ");

                int menu = Integer.parseInt(sc.nextLine());
                switch (menu) {
                    case 1:
                        ProfessorDTO professorDTO = insert();
                        String sql = "insert into professor values(?,?,?)";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getProfId());
                        pstmt.setString(2, professorDTO.getName());
                        pstmt.setString(3, professorDTO.getDeptId());

                        int rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "입력 성공" : "입력 실패");
                        break;
                    case 2:
                        professorDTO = update();
                        sql = "update professor set dept_id = ? where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getDeptId());
                        pstmt.setString(2, professorDTO.getProfId());

                        rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "수정 성공" : "수정 실패");
                        break;
                    case 3:
                        String profId = delete();
                        sql = "delete from professor where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);

                        rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");

                        break;

                    case 4:
                        profId = select();
                        sql = "select * from professor where prof_id = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);
                        rs = pstmt.executeQuery();
                        while (rs.next()) {
                            System.out.println("교수번호 : " + rs.getString("prof_id"));
                            System.out.println("이름 : " + rs.getString("prof_name"));
                            System.out.println("학과코드 : " + rs.getString("dept_id"));
                        }
                        break;

                    case 5:
                        run = false;
                        break;

                    default:
                        break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                rs.close();
                pstmt.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static ProfessorDTO insert() {

        System.out.print("생성할 아이디를 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름을 입력 >> ");
        String name = sc.nextLine();
        System.out.print("학과코드를 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, name, deptId);
    }

    public static ProfessorDTO update() {
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

    public static String delete() {
        System.out.println("======== 교수 정보 삭제 ========");
        System.out.print("삭제할 교수의 아이디를 입력 >> ");
        String profId = sc.nextLine();

        return profId;
    }

    public static String select() {
        // Prof_ID로 조회
        System.out.println("======== 교수 정보 조회 ========");
        System.out.print("조회할 교수의 아이디를 입력 >> ");
        String profId = sc.nextLine();

        return profId;
    }
}
