package backend.repository.ImplRepository;

import backend.repository.IDepartmentRepository;
import backend.utils.DatabaseUtils;
import entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepositoryImpl implements IDepartmentRepository {

    // tạo 1 cái conect
    private final Connection connection = DatabaseUtils.getInstance().getDatabaseConnection();

    @Override
    public List<Department> getListDepartmenrs() throws SQLException {
        List<Department> departms = new ArrayList<>();

        String sql = " SELECT * FROM `Department`";

        Statement st = connection.createStatement();

        ResultSet resultSet = st.executeQuery(sql);

        while (resultSet.next()) {
            Department department = new Department();
            department.setDepartmentId(resultSet.getInt("DepartmentID"));
            department.setDepartmentName(resultSet.getString("DepartmentName"));
            departms.add(department);
        }
        return departms;
    }

    @Override
    public Department geDepartmentID(int id) throws SQLException {
        List<Department> departments = new ArrayList<>();
        // Khai báo câu lệnh SQL muốn thực thi
        String sql = "SELECT * FROM `Department` where DepartmentID =  ?";
        // B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        // B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
        // Và trả về danh sách đối tượng trong
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            Department department = new Department();
            department.setDepartmentId(rs.getInt(1));
            department.setDepartmentName(rs.getString("DepartmentName"));
            return department;
        } else {
            return null;
        }
    }

    @Override
    public int deleteDepartment(Department request) throws SQLException {
        String sql = "DELETE FROM `Account` WHERE `AccountID` = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, request.getDepartmentId());
        int result = ps.executeUpdate();
        connection.commit();
        return result;
    }

}
