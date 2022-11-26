package frontend;

import backend.controller.UserController;
import backend.repository.impl.UserRepositoryImpl;
import backend.service.impl.UserServiceImpl;
import backend.utils.ScannerUtils;
import entity.Admin;
import entity.Employee;
import entity.Manage;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class Demo {
    public void login() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println("Mời bạn nhập gmail để đăng nhập");
        String email1 = ScannerUtils.inputEmail();
        System.out.println("Mời bạn nhập mk để đăng nhập");
        String password1 = ScannerUtils.inputPassword();
        controller.loginUser(email1, password1);

        if (controller.loginUser(email1, password1) != null) {
            Demo demo = new Demo();
            demo.main();
        } else {
            System.err.println("Đăng nhập thất bại");
        }
    }

    public void loginAdmin() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);

        System.out.println("Xin mời bạn nhập lại Email và Password của Admin để truy cập vào database");

        System.out.println("Xin mời nhập email");
        String email = ScannerUtils.inputEmail();
        System.out.println("Xin mời nhập password");
        String password = ScannerUtils.inputPassword();
        controller.findUserAdmin(email, password);
        if (controller.findUserAdmin(email, password) != null) {
            Demo demo = new Demo();
            demo.mainAdmin();
        } else {
            System.out.println("không thể đăng nhập vào quản trị viên  vui lòng chọn lại ");
            Demo demo = new Demo();
            demo.main();

        }
    }

    public static void main(String[] args) throws SQLException {

        System.out.println("************Chào mừng bạn đến với chương trình tí hon************ ");
        while (true) {
            System.out.println("**************** Nhập Đúng thông tin đầu vào ******************** ");
            System.out.println("**************** 1 Đăng nhập để tiếp tục ************************ ");
            System.out.println("**************** 2 Thoát chương Trình  ************************** ");
            Demo demo = new Demo();
            int choose = ScannerUtils.inputInt();
            switch (choose) {
                case 1:
                    demo.login();
                    break;
                case 2:
                    return;
                case 3:
                    System.out.println("Nhập lại đúng thông tin đầu vào ");
                    break;
            }
        }
    }

    public void main() {
        while (true) {
            Demo demo = new Demo();
            System.out.println("************************* Chọn thông tin nhập vào ************************* ");
            System.out.println("******************** 1 Chức năng dành cho Admin ******************************");
            System.out.println("******************* 2 Chức năng dành cho (Admin, Manage hoặc Employee ********* )");
            System.out.println("******************* 3 thoát chương trình ************************************");
            System.out.print("************************Mời bạn nhập chức năng********************************");

            switch (ScannerUtils.inputInt()) {
                case 1:
                    demo.loginAdmin();
                    break;
                case 2:
                    demo.mainEmployee();
                    break;
                case 3:
                    break;
                case 4:
                    return;
                case 5:
                    System.err.println("Nhập lại");
            }
        }
    }

    private void mainEmployee() {
        while (true) {
            System.out.println("************** Nhập Đúng thông tin đầu vào ******************************* ");
            System.out.println("**************** 1 Hiển thị toàn bộ thông tin User trong DB**************** ");
            System.out.println("**************** 2 Tìm kiếm thông tin User theo Dự án ********************* ");
            System.out.println("**************** 3 quay lại trang trước **********************************");
            System.out.println("**************** 4 kết thúc chương trình  ******************************* ");
            Demo demo = new Demo();
            int choose = ScannerUtils.inputInt();
            switch (choose) {
                case 1:
                    demo.selectAllUser();
                    break;
                case 2:
                    demo.findIdUser();
                    break;
                case 3:
                    demo.main();
                    break;
                case 4:
                    return;
                case 5:
                    System.out.println("Nhập lại đúng thông tin đầu vào ");
                    break;
            }
        }
    }

    private void mainAdmin() {
        while (true) {
            System.out.println("****************** Nhập Đúng thông tin đầu vào nhó....******************** ");
            System.out.println("****************** 1 Hiển thị toàn bộ thông tin User trong DB************* ");
            System.out.println("****************** 2 Tìm kiếm thông tin User theo ÍD********************** ");
            System.out.println("****************** 3 Tạo mới 1 user ************************************** ");
            System.out.println("****************** 4 Xóa thông tin User theo ÍD*************************** ");
            System.out.println("****************** 5 Quay lại trang trước ******************************** ");
            System.out.println("****************** 6 kết thúc chương trình  ****************************** ");
            Demo demo = new Demo();
            int choose = ScannerUtils.inputInt();
            switch (choose) {
                case 1:
                    demo.selectAllUser();
                    break;
                case 2:
                    demo.findIdUser();
                    break;
                case 3:
                    demo.mainCreate();
                    break;
                case 4:
                    demo.deleteUser();
                    break;
                case 5:
                    demo.main();
                    break;
                case 6:
                    return;
                case 7:
                    System.out.println("Nhập lại đúng thông tin ");
                    break;
            }
        }
    }

    private void selectAllUser() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println(" Danh sách các User  ");
        List<User> users = controller.getListUsers();

        String str = "|%-5s|%-25s|%-30s|%-10s|\n";


        System.out.format("+------+---------------------------+---------------------------------+-----------+%n");
//        System.out.format("|  ID  |          Họ Tên               |                Email               |      Role    |%n");
        System.out.printf("|%-5s | %-25s | %-30s | %-10s|\n", "ID", "Họ tên", "Email", "Role");
        System.out.format("+------+---------------------------+---------------------------------+-----------+%n");
//        System.out.format("+------+-------------------------------+------------------------------------+--------------+%n");
        for (User user : users) {
            System.out.printf(str, user.getId(), user.getFullName(), user.getEmail(), user.getTypeUser());
        }
        System.out.format("+------+-------------------------------+------------------------------------+--------------+%n");
    }

    private void findIdUser() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println("Nhập thông tin id Project cần tìm kiếm  ");
        int id = ScannerUtils.inputInt();
        controller.getUserById(id);

        List<User> users = controller.getUserById(id);
        for (User user : users) {
            System.out.println(user);
        }
//        System.out.println("tk là :" + controller.getUserById(id));
    }

    private void deleteUser() {
        //auto goọi 3 thằng này
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);

        System.out.println("Xin mời bạn nhâp thông tin ID cần xóa ");
        int idDelete = ScannerUtils.inputInt();
        User user = new User();
        user.setId(idDelete);
        controller.deleteUser(user);
    }


    public void mainCreate() {
        while (true) {
            System.out.println("************** Nhập Đúng thông tin đầu vào nhó....******** ");
            System.out.println("************** 1 Tạo tài khoản Admin********************** ");
            System.out.println("************** 2 Tạo tài khoản EmPloyee ****************** ");
            System.out.println("************** 3 Tạo tài khoản Manage ******************** ");
            System.out.println("************** 4 Quay lại trang trước ******************** ");
            System.out.println("************** 5 kết thúc chương trình  ****************** ");
            Demo demo = new Demo();
            int choose = ScannerUtils.inputInt();
            switch (choose) {
                case 1:
                    demo.createNewAdmin();
                    break;
                case 2:
                    demo.createNewEmployee();
                    break;
                case 3:
                    demo.createNewAManage();
                    break;
                case 4:
                    demo.mainAdmin();
                    break;
                case 5:
                    return;
                case 6:
                    System.out.println("Nhập lại đúng thông tin ");
                    break;
            }
        }
    }

    private void createNewAdmin() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println("*****************************************");
        System.out.println("Mời bạn nhập fullName ");
        String ful = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập Email ");
        String email = ScannerUtils.inputEmail();
        System.out.println("Mời bạn nhập Password ");
        String password = ScannerUtils.inputPassword();
        Admin admin = new Admin(email, ful, password, User.typeUser.Admin);
        controller.createNewAdmin(admin);
    }

    private void createNewEmployee() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println("***********************************");
        System.out.println("Mời bạn nhập fullName ");
        String ful = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập Email ");
        String email = ScannerUtils.inputEmail();
        String password = "123456";
        int proj = 0;
        String proskill = "";
        Employee employee = new Employee(email, ful, password, User.typeUser.Employee, proj, proskill);
        controller.createNewEmplpoyee(employee);
    }

    private void createNewAManage() {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        UserServiceImpl service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);
        System.out.println("************************************");
        System.out.println("Mời bạn nhập fullName ");
        String ful = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập Email ");
        String email = ScannerUtils.inputEmail();
        System.out.println("Mời bạn nhập Password ");
        String password = ScannerUtils.inputPassword();
        System.out.println("Mời bạn nhập ProjectID ");
        int proj = ScannerUtils.inputInt();
        System.out.println("Mời bạn nhập Kinh nghiệm ");
        int kn = ScannerUtils.inputInt();
        Manage manage = new Manage(email, ful, password, User.typeUser.Manager, proj, kn);
        controller.createNewManage(manage);
    }
}
