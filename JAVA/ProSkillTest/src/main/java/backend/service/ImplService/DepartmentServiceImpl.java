package backend.service.ImplService;

import backend.repository.IDepartmentRepository;
import backend.service.IDepartmentService;
import entity.Department;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServiceImpl implements IDepartmentService {
    private  final IDepartmentRepository departmentRepository;

    public DepartmentServiceImpl(IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getDepartmentList() throws SQLException {
        // tí retun lại
        return departmentRepository.getListDepartmenrs();
    }

    @Override
    public Department geDepartmentID(int id) throws SQLException {
        return departmentRepository.geDepartmentID(id);
    }

    @Override
    public void deleteDepartment(Department request) throws SQLException {
        int result = departmentRepository.deleteDepartment(request);
        if (result > 0) {
            System.out.println("Xoá dữ liệu thành công");
        } else {
            throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
        }
    }

}
