package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Select2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // 조회할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            String sql = "select * from student where student_id =?";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String stid = rs.getString("Student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptid = rs.getString("dept_id");
                System.out.printf("%s \t %s \t %.2f \t %s\n", stid, name, height, deptid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
