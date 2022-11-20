package vn.com.vti.repository;

import vn.com.vti.entity.Account;
import vn.com.vti.entity.Department;
import vn.com.vti.utils.DatabaseUtils;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountRepository {

    // thì gọi đến liên kết đến database
    private final Connection con = DatabaseUtils.getInstance().getDatabaseConnection();

    // rồi khai báo 1 final chính tên file cụa nó
    private final DepartmentRepository departmentRepository = new DepartmentRepository();

    public List<Account> getListAccounts() throws SQLException {
        List<Account> accounts = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        // Khai báo câu lệnh SQL muốn thực thi
        String sql = "SELECT *  FROM  `Account` ";
        // B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL

        Statement st = con.createStatement();
        // B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
        // Và trả về danh sách đối tượng trong
        ResultSet rs = st.executeQuery(sql);
        // B4: Xử lý kết quả trả về

        while (rs.next()) {
            Account account = new Account();
            //trả về 1 cái ID có kiểu dữ liệu datatype là Int
            account.setId(rs.getInt(1));
            account.setEmail(rs.getString(2));
            account.setUserName(rs.getString(3));
            account.setFullName(rs.getString(4));
            account.setDepartment(departmentRepository.getDepartmentByID(rs.getInt("DepartmentID")));

//            account.setCreateDate(LocalDate.parse(rs.getString("CreateDate")));

            String a = rs.getString("CreateDate");
//            String b = a.replace(" ", "T");
//            account.setCreateDate(LocalDate.parse(b));

            String[] a1 = a.split(" ");//2003-01-09     00:00:00
//            account.setCreateDate(Date.parse(a1[0]));
            accounts.add(account);
        }
        return accounts;
    }

    public int creteAccount(Account request) throws SQLException {
        String sql = "INSERT INTO `Account`(Email,Username,FullName,DepartmentID,PositionID) VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, request.getEmail());
        ps.setString(2, request.getUserName());
        ps.setString(3, request.getFullName());
        ps.setInt(4, request.getDepartment().getDepartmentId());
        ps.setInt(5, request.getPosition().getId());
//        ps.setString(6, request.getCreateDate().toString());


        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int updateAccount(Account request) throws SQLException {
        String sql = "UPDATE `Account` SET `Username` = ? WHERE `AccountID` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getUserName());
        ps.setInt(2, request.getId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

    public int deleteAccount(Account request) throws SQLException {
        String sql = "DELETE FROM `Account` WHERE `AccountID` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, request.getId());
        int result = ps.executeUpdate();
        con.commit();
        return result;
    }

}
