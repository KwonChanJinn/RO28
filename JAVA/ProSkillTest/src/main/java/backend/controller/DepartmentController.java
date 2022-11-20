package backend.controller;

import backend.service.IDepartmentService;
import entity.Department;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentController {
    private final IDepartmentService departmentService;

    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<Department> getAllDepartment() throws SQLException {

        List<Department> departments = new ArrayList<>();
        try {
            departments = departmentService.getDepartmentList();
        } catch (Exception e) {
            System.out.println("Lấy danh sách không thành công  " + e.getMessage());
        }
        return departments;
    }

    public Department getDepartmentById( int id ) {

        Department departments = new Department();
        try {
            departments = departmentService.geDepartmentID(id);
        } catch (Exception e) {
            System.out.println("Lấy danh sách không thành công  " + e.getMessage());
        }
        return departments;
    }

    public void deleteDepartmentById(Department request){
        try {
            departmentService.deleteDepartment(request);
        } catch (Exception e) {
            System.out.println("Xoá phòng không thành công! " + e.getMessage());
        }
    }
}
