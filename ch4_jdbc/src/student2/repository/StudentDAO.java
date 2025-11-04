package student2.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;
import static student2.repository.JDBCUtil.*;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "insert into student values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getStudentId());
            pstmt.setString(2, dto.getName());
            pstmt.setDouble(3, dto.getHeight());
            pstmt.setString(4, dto.getDeptId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete : studentId
    public int delete(String studentId) {
        int result = 0;
        try {
            String sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // update : height 수정
    public int update(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "update student set height = ? where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, dto.getHeight());
            pstmt.setString(2, dto.getStudentId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // 학생전체조회 (dept_id 이용)
    public List<StudentDTO> getRows(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO dto = new StudentDTO();
                dto.setStudentId(rs.getString("student_id"));
                dto.setName(rs.getString("name"));
                dto.setHeight(rs.getInt("height"));
                dto.setDeptId(rs.getString("dept_id"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 학생조회(1명 = studentId로)
    public StudentDTO getRow(String studentId) {
        StudentDTO dto = null;
        try {

            String sql = "select * from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                dto = new StudentDTO();
                dto.setStudentId(rs.getString("student_id"));
                dto.setName(rs.getString("name"));
                dto.setHeight(rs.getInt("height"));
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
