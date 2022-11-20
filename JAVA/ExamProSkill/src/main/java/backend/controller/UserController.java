package backend.controller;

import backend.service.IUserService;
import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    public final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }
    // tí thì nhớ trả về danh sachs cho nó

    public User loginUser(String email, String password) {
        User user = new User();
        try {
            user = iUserService.loginUser(email, password);
        } catch (Exception e) {
            System.out.println("Đăng nhập không thành công ! " + e.getMessage());
        }
        return user;
    }

    public User findUserAdmin(String email, String password) {

        User user1 = new User();
        try {
            user1 = iUserService.loginAccountAdmin(email, password);
        } catch (Exception e) {
            System.out.println(" Đăng nhập không thành công  " + e.getMessage());
        }
        return user1;
    }

    public List<User> getUserById(int id) {
        List<User> users = new ArrayList<>();
        try {
            users = iUserService.getAccountById(id);
        } catch (Exception e) {
            System.out.println("Lây tài khoản không thành công ! " + e.getMessage());
        }
        return users;
    }

    public List<User> getListUsers() {
        List<User> users = new ArrayList<>();
        try {
            users = iUserService.getAllUsers();
        } catch (Exception e) {
            System.out.println("Lấy danh sách account không thành công " + e.getMessage());
        }
        return users;
    }


    public void deleteUser(User request) {
        try {
            iUserService.deleteUser(request);
        } catch (SQLException e) {
            System.out.println("Xóa User không thành công " + e.getMessage());
        }
    }

    public void createNewAdmin(Admin request) {
        try {
            iUserService.createNewAdmin(request);
        } catch (Exception e) {
            System.out.println("Thêm Ádmin không thành công" + e.getMessage());
        }
    }
    public void createNewEmplpoyee(Employee request) {
        try {
            iUserService.createNewEmployee(request);
        } catch (Exception e) {
            System.out.println("Thêm Ádmin không thành công" + e.getMessage());
        }
    }
    public void createNewManage(Manage request) {
        try {
            iUserService.createNewManage(request);
        } catch (Exception e) {
            System.out.println("Thêm Ádmin không thành công" + e.getMessage());
        }
    }
}
