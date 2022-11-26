package backend.repository;

import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    // tạo 1 caisl list hứng tứ db đổ ver từ hằng db
    User loginUser(String email, String password) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    List<User> getAccountById(int id) throws SQLException;
    // tối hỏi lại cái request cho chắc ăn nè :
    int deleteUser(User request) throws SQLException;
    User loginAccountAdmin(String email, String password) throws SQLException;
    int createNewAdmin(Admin request) throws SQLException;
    int createNewEmployee(Employee request) throws SQLException;
    int createNewManage(Manage request) throws SQLException;
}
