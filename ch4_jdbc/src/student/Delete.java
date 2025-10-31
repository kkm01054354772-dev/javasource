package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // 삭제할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            // 부모 삭제
            String sql = "delete from enrollment where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            int rows = pstmt.executeUpdate();
            // 자식삭제
            sql = "delete from student where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
