package backend.service;

import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    //tạo 1 thằng cha hứng từ repossitory đổ về
    User loginUser(String email, String password) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    List<User> getAccountById(int id) throws SQLException;

    void  deleteUser(User request) throws SQLException;

    User loginAccountAdmin(String email , String password ) throws SQLException;

    void createNewAdmin(Admin request) throws SQLException;

    void createNewEmployee(Employee request) throws SQLException;

    void createNewManage(Manage request) throws SQLException;
}
