package frontend;

import backend.controller.DepartmentController;
import backend.repository.ImplRepository.DepartmentRepositoryImpl;
import backend.service.ImplService.DepartmentServiceImpl;
import backend.utils.ScannerUtils;
import entity.Department;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemoPro {

    public static void main(String[] args) throws SQLException {

        DemoPro demoPro = new DemoPro();
        demoPro.getListDepartments();
        demoPro.getDepartmentById();
        demoPro.deleteDepartmentById();
    }

    public void getListDepartments() throws SQLException {

        DepartmentRepositoryImpl repository = new DepartmentRepositoryImpl();
        DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
        DepartmentController controller = new DepartmentController(service);
        List<Department> departments = controller.getAllDepartment();
        System.out.println(" Danh sách Department ");
        for (Department dep : departments) {
            System.out.println( dep);
        }
    }
    public void getDepartmentById(){
        DepartmentRepositoryImpl repository = new DepartmentRepositoryImpl();
        DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
        DepartmentController controller = new DepartmentController(service);
        System.out.println("Mời bạn nhập id cần tìm kếm ");
        // tất cả những thuwss gì muốn lấy đều lấy qua thằng con troller
        int id = ScannerUtils.inputInt();
        controller.getDepartmentById(id);
        System.out.println("tk là :" + controller.getDepartmentById(id));
    }

    public void deleteDepartmentById(){
        DepartmentRepositoryImpl repository = new DepartmentRepositoryImpl();
        DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
        DepartmentController controller = new DepartmentController(service);
        System.out.print("Mời bạn nhập vào ID phòng ban muốn xóa: ");
        int idDelete = ScannerUtils.inputInt();
        Department requestDelete = new Department();
        requestDelete.setDepartmentId(idDelete);
        controller.deleteDepartmentById(requestDelete);
    }
}
