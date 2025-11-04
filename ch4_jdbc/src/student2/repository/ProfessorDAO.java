package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;

public class ProfessorDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public ProfessorDAO(Connection con) {
        this.con = con;
    }

    // static 블록
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 데이터베이스 연결 메소드
    public Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "javadb";
        String password = "12345";

        con = DriverManager.getConnection(url, user, password);
        return con;
    }

    public int insert(ProfessorDTO professorDTO) {
        int result = 0;
        try {
            String sql = "insert into professor values(?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, professorDTO.getProfId());
            pstmt.setString(2, professorDTO.getName());
            pstmt.setString(3, professorDTO.getDeptId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int delete(String profId) {
        int result = 0;
        try {
            String sql = "delete from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int update(ProfessorDTO professorDTO) {
        int result = 0;
        try {
            String sql = "update professor set dept_id = ? where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, professorDTO.getDeptId());
            pstmt.setString(2, professorDTO.getProfId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public ProfessorDTO getRow(String profId) {
        ProfessorDTO dto = null;
        try {
            String sql = "select * from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                dto = new ProfessorDTO();
                dto.setProfId(rs.getString("prof_id"));
                dto.setName(rs.getString("prof_name"));
                dto.setDeptId(rs.getString("dept_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }
}