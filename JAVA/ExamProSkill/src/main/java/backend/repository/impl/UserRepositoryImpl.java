package backend.repository.impl;

import backend.repository.IUserRepository;
import backend.utils.DatabaseUtils;
import backend.utils.ScannerUtils;
import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {
    private final Connection connection = DatabaseUtils.getInstance().getDatabaseConnection();
    @Override
    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM `ManageUser`";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            User user = new User();
            user.setFullName(resultSet.getString("fullName"));
            user.setEmail(resultSet.getString("email"));
            user.setTypeUser(getTypeUserName(resultSet.getString("Role")));
            userList.add(user);
        }
        return userList;
    }
    @Override
    public List< User> getAccountById(int id) throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM `ManageUser` WHERE ProjectId = (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFullName(resultSet.getString("fullName"));
            user.setEmail(resultSet.getString("email"));
            user.setTypeUser(getTypeUserName(resultSet.getString("Role")));
            userList.add(user);
        }
        return userList;
    }


    // chỉ có thằng admin mới đc thêm vào
    @Override
    public User loginAccountAdmin(String email, String password) throws SQLException {
        String sql = "SELECT * FROM `ManageUser` WHERE Email= ? AND `Password`= ? AND `role` = \"Admin\"";
        //SELECT * FROM `ManageUser` WHERE Email="a@gmail.com"  AND `Password`= "21082000" AND `User` = "Admin";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            User user = new User();
            user.setFullName(resultSet.getString("fullName"));
            user.setEmail(resultSet.getString("email"));
            return user;
        } else {
            return null;
        }
    }

    // đăng nhâập cho mọi account
    @Override
    public User loginUser(String email, String password) throws SQLException {

        String sql = "SELECT * FROM `ManageUser` WHERE Email = (?) AND Password = (?)";
//SELECT * FROM `ManageUser` WHERE Email = "thanhsong@gmail.com" AND `Password`= 21082000
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            User user = new User();
            user.setFullName(resultSet.getString("fullName"));
            user.setEmail(resultSet.getString("email"));
            return user;
        } else {
            return null;
        }
    }

    // tạo mới Admin
    @Override
    public int  createNewAdmin(Admin request) throws SQLException {

        String sql = "INSERT INTO `ManageUser`( fullName, Email,`Password`,Role)"
                + "VALUES  (?      ,?  ,?     ,?  )";
        // chạy câu lệnh
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, request.getFullName());
        ps.setString(2, request.getEmail());
        ps.setString(3, request.getPassword());
        if (request.getTypeUser() == User.typeUser.Admin) {

            ps.setString(4, "Admin");
        }
        int result = ps.executeUpdate();
        return result;


    }
/// thêm mới employee
    @Override
    public int createNewEmployee(Employee request) throws SQLException {
        String sql = "INSERT INTO `ManageUser`( fullName  , Email   ,`Password` ,  `role` ,ProjectId  , ProSkill)"
                + "VALUES  (?      ,?  ,?       ,?    , ?,? )";
        // chạy câu lệnh
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, request.getFullName());
        ps.setString(2, request.getEmail());
        ps.setString(3, request.getPassword());
        ps.setString(4, "Employee");
        ps.setInt(5, request.getProjectId());
        ps.setString(6,request.getProSkill());
        int result = ps.executeUpdate();
        connection.commit();
        return result;
    }
// thêm mới manage
    @Override
    public int createNewManage(Manage request) throws SQLException {
        String sql = "INSERT INTO `ManageUser`( fullName  , Email   ,`Password` ,  `role` ,ProjectId  , ExpInYear )"
                + "VALUES  (?      ,?  ,?       ,?    , ?,? )";
        // chạy câu lệnh
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, request.getFullName());
        ps.setString(2, request.getEmail());
        ps.setString(3, request.getPassword());
        ps.setString(4, "Manager");
        ps.setInt(5,request.getProjectId());
        ps.setInt(6,request.getExpInYear());
        int result = ps.executeUpdate();
        connection.commit();
        return result;
    }





    @Override
    public int deleteUser(User request) throws SQLException {
        String sql = "DELETE FROM `ManageUser` WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, request.getId());
        int result = ps.executeUpdate();
        connection.commit();
        return result;
    }


    public User.typeUser getTypeUserName(String name) {

        switch (name) {
            case "Admin":
                return User.typeUser.Admin;
            case "Employee":
                return User.typeUser.Employee;
            case "Manager":
                return User.typeUser.Manager;
            default:
                System.err.println("Nhập lại");
                break;
        }
        return null;
    }


}
