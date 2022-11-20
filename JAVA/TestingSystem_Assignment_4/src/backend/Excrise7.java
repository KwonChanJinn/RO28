package backend;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Excrise7 {


    private Scanner sc;


    public Excrise7() {
        ArrayList<User_Ex6> userList;
        sc = new Scanner(System.in);

    }

    public void question23() {
        while (true) {

            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");

            System.out.println("=== 1. Thêm Employee. ===");

            System.out.println("=== 2. Thêm Manager. ===");

            System.out.println("=== 3. Thêm Waiter . ===");


            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    Excrise7 excrise7 = new Excrise7();

                    System.out.println("Nhập vào tên Employee: ");
                    String Name = sc.next();
                    System.out.println("Nhập vào SalaryRatio: ");
                    Double SalaryRatio = sc.nextDouble();
                    Nhanvien_Ex6 nv = new Nhanvien_Ex6(Name, SalaryRatio);
                    nv.displayInfor(); // do đây nó thừ kế nên nó lấy trong userEX6 rồi li thông tin ra màn hình
                    //    public void displayInfor() {// là xuất ra thông tin
                    //
                    //        System.out.println("Name: " + name);
                    //        System.out.println("Ration Salary: " + salaryradio);
                    //        System.out.println("Lương chi trả: " + calculatePay());
                    //    }
                    break;

                case 2:
                    System.out.println("Nhập vào tên Manager: ");
                    String managerName = sc.next();
                    System.out.println("Nhập vào SalaryRatio: ");
                    Double managerSalaryRatio = sc.nextDouble();
                    Manager_Ex6 manager = new Manager_Ex6(managerName, managerSalaryRatio);

                    manager.displayInfor();
                    break;
                case 3:
                    System.out.println("Nhập vào tên Waiter: ");
                    String waiterName = sc.next();
                    System.out.println("Nhập vào SalaryRatio: ");
                    Double waiterSalaryRatio = sc.nextDouble();
                    Waiter_Ex6 waiter = new Waiter_Ex6(waiterName, waiterSalaryRatio);

                    waiter.displayInfor();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Alarm: Lựa chọn đúng số trên menu");
                    break;

            }
        }
    }
}
