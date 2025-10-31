package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
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
            String sql = "select * from student";

            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                String stid = rs.getString("Student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptid = rs.getString("dept_id");
                System.out.printf("%s \t %s \t %.2f \t %s\n", stid, name, height, deptid);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
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
