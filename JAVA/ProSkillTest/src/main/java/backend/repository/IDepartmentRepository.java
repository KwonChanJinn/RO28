package backend.repository;

import entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentRepository {
    List<Department> getListDepartmenrs() throws SQLException;

    Department geDepartmentID(int id ) throws SQLException;


    int deleteDepartment(Department request ) throws SQLException;
}
