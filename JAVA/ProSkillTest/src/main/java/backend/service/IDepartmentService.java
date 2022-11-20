package backend.service;

import entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentService {

    List<Department> getDepartmentList() throws SQLException;

    Department geDepartmentID(int id ) throws SQLException;

    void deleteDepartment(Department request ) throws SQLException;
}
