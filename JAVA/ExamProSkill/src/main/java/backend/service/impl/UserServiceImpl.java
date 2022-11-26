package backend.service.impl;

import backend.repository.IUserRepository;
import backend.service.IUserService;
import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    public final IUserRepository iUserRepository;

    public UserServiceImpl(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public User loginUser(String email, String password) throws SQLException {
        return iUserRepository.loginUser(email, password);
    }

    @Override
    public User loginAccountAdmin(String email, String password) throws SQLException {
        return iUserRepository.loginAccountAdmin(email, password);
    }

    @Override
    public void createNewAdmin(Admin request) throws SQLException {
        int result = iUserRepository.createNewAdmin(request);
        if (result > 0) {
            System.out.println("Thêm thành công Admin");
        } else {
            System.out.println("Thêm không thành công Admin ");
        }
    }

    @Override
    public void createNewEmployee(Employee request) throws SQLException {
        int result = iUserRepository.createNewEmployee(request);
        if (result > 0) {
            System.out.println("Thêm thành công Emp");
        } else {
            System.out.println("Thêm không thành công Emp ");
        }
    }

    @Override
    public void createNewManage(Manage request) throws SQLException {
        int result = iUserRepository.createNewManage(request);
        if (result > 0) {
            System.out.println("Thêm thành công Manage");
        } else {
            System.out.println("Thêm không thành công Manage ");
        }
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        return iUserRepository.getAllUsers();
    }

    @Override
    public List<User> getAccountById(int id) throws SQLException {
        return iUserRepository.getAccountById(id);
    }

    @Override
    public void deleteUser(User request) throws SQLException {
        int result = iUserRepository.deleteUser(request);
        if (result > 0) {
            System.out.println("Xóa thành công User");
        } else {
            System.out.println("Xóa không thành công ");
        }
    }
}
