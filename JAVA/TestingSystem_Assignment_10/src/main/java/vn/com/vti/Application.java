package vn.com.vti;

import vn.com.vti.controller.AcccountController;
import vn.com.vti.controller.DepartmentController;
import vn.com.vti.controller.PositionController;
import vn.com.vti.entity.Account;
import vn.com.vti.entity.Department;
import vn.com.vti.entity.Position;
import vn.com.vti.entity.PositionName;
import vn.com.vti.repository.AccountRepository;
import vn.com.vti.repository.DepartmentRepository;
import vn.com.vti.repository.impl.PositionRepositoryImpl;
import vn.com.vti.service.imp.AccountServiceImpl;
import vn.com.vti.service.imp.DepartmentServiceImpl;
import vn.com.vti.utils.ScannerUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Application {


    public static void main(String[] args) {
        while (true) {
            System.out.println("Phần mềm chương trình Quản Lý thông tin nhân viên");

            System.out.println("1 quản lý thông tin Department");
            System.out.println("2 Quản lý thông tin Account");
            System.out.println("3 Thoát chương trình ");
            System.out.println("Xin mời bạn nhập thông tin đầu vào ");
            int choose = ScannerUtils.inputInt();
            Application app = new Application();

            switch (choose) {
                case 1:
                    app.Department();
                    break;
                case 2:
                    app.Account();
                case 3:
                    return;
                default:
                    System.out.println("Xin mời bạn nhập lại thông tin đầu vào");
                    break;
            }
        }


    }

    public static void showMenu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1.Hiển thị danh sách phòng ban");
        System.out.println("2.Thêm mới phòng ban");
        System.out.println("3.Chỉnh sửa thông tin phòng ban");
        System.out.println("4.Xoá phòng ban");
        System.out.println("5.Thoát chương trình");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
    }

    public static void showMenu1() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1.Hiển thị danh sách acc");
        System.out.println("2.Thêm mới acc");
        System.out.println("3.Chỉnh sửa thông tin acc");
        System.out.println("4.Xoá acc");
        System.out.println("5.Thoát chương trình");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
    }

    public void Department() {
        DepartmentRepository repository = new DepartmentRepository();
        DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
        DepartmentController controller = new DepartmentController(service);
        PositionController positionController = new PositionController();
        boolean exit = false;
        do {
            showMenu();
            // Lưu chữ sự lựa chọn
            int choice = ScannerUtils.inputInt();
            switch (choice) {
                case 1:
                    System.out.println("========== Danh sách phòng ban ==========");
                    List<Department> departments = controller.getListDepartment();
                    for (Department department : departments) {
                        System.out.println(department);
                    }
                    break;

                case 2:
                    System.out.print("Mời bạn nhập vào tên phòng bạn: ");
                    Department requestCreate = new Department();
                    String departmentName = ScannerUtils.inputString();
                    requestCreate.setDepartmentName(departmentName);
                    controller.creteDepartment(requestCreate);
                    break;

                case 3:
                    System.out.print("Mời bạn nhập vào ID phòng ban muốn chỉnh sửa: ");
                    int idUpdate = ScannerUtils.inputInt();
                    System.out.print("Mời bạn nhập vào tên mới của phòng ban: ");
                    String newDepartmentName = ScannerUtils.inputString();
                    Department requestUpdate = new Department();
                    requestUpdate.setDepartmentId(idUpdate);
                    requestUpdate.setDepartmentName(newDepartmentName);
                    controller.updateDepartment(requestUpdate);
                    break;

                case 4:
                    System.out.print("Mời bạn nhập vào ID phòng ban muốn xóa: ");
                    int idDelete = ScannerUtils.inputInt();
                    Department requestDelete = new Department();
                    requestDelete.setDepartmentId(idDelete);
                    controller.deleteDepartment(requestDelete);
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
                    break;
            }
        } while (!exit);
    }

    public void Account() {
        AccountRepository repository = new AccountRepository();
        AccountServiceImpl service = new AccountServiceImpl(repository);
        AcccountController controller = new AcccountController(service);
        PositionController poController = new PositionController();
        boolean exit = false;
        do {
            showMenu1();
            // Lưu chữ sự lựa chọn
            int choice = ScannerUtils.inputInt();
            switch (choice) {
                case 1:
                    System.out.println("========== Danh sách account ==========");
                    List<Account> accounts = controller.getListAccounts();
                    for (Account account : accounts) {
                        System.out.println(account);
                    }
                    break;

                case 2:

                    // lấy pos ra
                    Position position = poController.getPositionByID(1);
                    Account account = new Account();
                    System.out.println("Nhạp email");
                    String email = ScannerUtils.inputString();
                    account.setEmail(email);
                    System.out.println("Nhạp user name");
                    String userName = ScannerUtils.inputString();
                    account.setUserName(userName);
                    System.out.println("FUll name");
                    String full = ScannerUtils.inputString();
                    account.setFullName(full);

                    account.setDepartment(new Department(1,"Kế toán vip"));
                    account.setPosition(position);
                //    account.setCreateDate(new Date());

                    controller.creteAccounts(account);
//                    controller.getListAccounts();
                    break;

                case 3:
                    System.out.print("Mời bạn nhập vào ID acc ban muốn chỉnh sửa: ");
                    int idUpdate = ScannerUtils.inputInt();
                    System.out.print("Mời bạn nhập vào tên mới của aaaccc: ");
                    String newAccount = ScannerUtils.inputString();
                    Account requestUpdate = new Account();
                    requestUpdate.setId(idUpdate);
                    requestUpdate.setUserName(newAccount);
                    controller.updateAccounts(requestUpdate);
                    break;

                case 4:
                    System.out.print("Mời bạn nhập vào ID phòng ban muốn xóa: ");
                    int idDelete = ScannerUtils.inputInt();
                    Account requestDelete = new Account();
                    requestDelete.setId(idDelete);
                    controller.deleteAccounts(requestDelete);
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Mời bạn chọn lại chức năng của chương trình ");
                    break;
            }
        } while (!exit);
    }
}