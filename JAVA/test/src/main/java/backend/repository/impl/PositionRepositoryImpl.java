package backend.repository.impl;

import backend.repository.IPositionRepository;
import backend.utils.DatabaseUtils;
import entity.Position;
import entity.PositionName;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PositionRepositoryImpl implements IPositionRepository {

    private Connection conection = DatabaseUtils.getInstance().getDatabaseConnection();


    @Override
    public List<Position> getListPositions() throws SQLException {
        List<Position> positions = new ArrayList<>();

        String sql = "Select * from position where email = ? end pasw = ?  ";

       // PreparedStatement
        Statement statement = conection.createStatement();

        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            Position position = new Position();
            position.setId(rs.getInt("PositionID"));
            position.setName(getPositionName(rs.getString("PositionName")));
            positions.add(position);
        }
        return positions;
    }


    /// hao hao giống publuic int sum (float Sum )
//    // cái position name gần giống int kiểu dũ liệu nó trả về
//    // còn đây là

    public PositionName getPositionName(String name) {
        switch (name) {
            //'Dev', 'Test', 'Scrum Master', 'PM'
            case "Dev":
                return PositionName.DEV;
            case "Test":
                return PositionName.TEST;
            case "Scrum Master":
                return PositionName.SCRUM_MASTER;
            case "PM":
                return PositionName.PM;
            default:
                System.err.println("Nhập lại");
                break;
        }
        return null;
    }

    @Override
    public Position getDepartmentByID(int id) throws SQLException {
//        List<Position> departments = new ArrayList<>();
        // Khai báo câu lệnh SQL muốn thực thi
        String sql = "SELECT * FROM ? where PositionID =  ? ";
        // B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
        PreparedStatement st = conection.prepareStatement(sql);
        st.setInt(1, id);
        // B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
        // Và trả về danh sách đối tượng trong
        ResultSet rs = st.executeQuery();
//        while (rs.next()) {
//            Department department = new Department();
//            department.setDepartmentId(rs.getInt(1));
//            departments.add(department);
//        }
//        return departments;
//        con.commit();
        // B4: Xử lý kết quả trả về
        if (rs.next()) {
            Position department = new Position();
            department.setId(rs.getInt("PositionID"));
            department.setName(getPositionName(rs.getString("PositionName")));
            return department;
        } else {
            return null;
        }
    }


//    public getDepartmentByID(int id) throws SQLException {
//        List<Department> departments = new ArrayList<>();
//        // Khai báo câu lệnh SQL muốn thực thi
//        String sql = "SELECT * FROM `position` where PositionName =  ?";
//        // B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
//        PreparedStatement st = con.prepareStatement(sql);
//        st.setInt(1, id);
//        // B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
//        // Và trả về danh sách đối tượng trong
//        ResultSet rs = st.executeQuery();
////        while (rs.next()) {
////            Department department = new Department();
////            department.setDepartmentId(rs.getInt(1));
////            departments.add(department);
////        }
////        return departments;
////        con.commit();
//        // B4: Xử lý kết quả trả về
//        if (rs.next()) {
//            Department department = new Department();
//            department.setDepartmentId(rs.getInt(1));
//            department.setDepartmentName(rs.getString("DepartmentName"));
//
//            return department;
//        } else {
//            return  null;
//        }

}
