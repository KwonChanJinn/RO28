package backend;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Excrise5_2 {
    private ArrayList<CanBo> CanBolist;
    private Scanner sc;

    public Excrise5_2(){
        CanBolist = new ArrayList<CanBo>();
        CanBolist.size();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Excrise5_2 excrise5  =new Excrise5_2();
        System.out.println("-------------- Câu 1 nhập thông tin cán bộ--------------------");
        System.out.println("");
        excrise5.Question_1();
        System.out.println("");
        System.out.println("-------------- câu 2 nhập thông tin Công nhân--------------------");
        System.out.println("");
        Question_2();
        System.out.println("");
        System.out.println("-------------- câu3 nhập thông tin kỹ sư--------------------");
        System.out.println("");
        Question_3();
        System.out.println("");
        System.out.println("-------------- câu 4 nhập thông tin nhân vien--------------------");
        System.out.println("");
        Question_4();

        System.out.println("");
        System.out.println("-------------- câu 4 nhập thông tin nhân vien--------------------");
        System.out.println("");

        excrise5.Question_7();


    }

    public  void Question_1() {
        CanBo canBo = new CanBo("Trần thanh song ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo1 = new CanBo("Trần song1 ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo2 = new CanBo("Trần thanh song1 ", 24, Gender.MALE, "Hà Tĩnh");
        CanBo canBo3 = new CanBo("thanh song1 ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo4 = new CanBo("Trần thanh song21 ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo5 = new CanBo("Trần thanh song08 ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo6 = new CanBo("Trần thanh song2000 ", 24, Gender.FEMALE, "Hà Tĩnh");
        CanBo canBo7 = new CanBo("Trần thanh song21082000 ", 24, Gender.FEMALE, "Hà Tĩnh");

        System.out.println(canBo);
        System.out.println(canBo1);
        System.out.println(canBo2);
        System.out.println(canBo3);
        System.out.println(canBo4);
        System.out.println(canBo5);
        System.out.println(canBo6);
        System.out.println(canBo7);

    }

    public static void Question_2() {
        CongNhan congNhan = new CongNhan("Trần thanh song2222 ", 24, Gender.FEMALE, "Hà Tĩnh", 5);
        System.out.println(congNhan);
    }

    public static void Question_3() {

        KySu KySu = new KySu("Trần thanh song2222 ", 24, Gender.FEMALE, "Hà Tĩnh", "Công nghệ thông it IT");
        System.out.println(KySu);
    }

    public static void Question_4() {

        NhanVien NhanVien = new NhanVien("Trần thanh song2222 ", 24, Gender.FEMALE, "Hà Tĩnh", "Code dạo");
        System.out.println(NhanVien);
    }

    public static void Question_5() {

    }

// 0 -> n-1
    public void Question_6() {

    }

    public void Question_7() {
        menu();
    }

    public void menu() {

        while (true) {
            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
            System.out.println("=== 1. Thêm mới cán bộ. ===");
            System.out.println("=== 2. Tìm kiếm theo họ tên. ===");
            System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===");
            System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===");
            System.out.println("=== 5. Thoát khỏi chương trình. ===");

            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    themcanbo();
                    break;
                case 2:
                    timkiemten();
                    break;
                case 3:
                    printtoDessk();
                    break;
                case 4:
                    xoaten();
                    break;
                case 5:
                    return; // quay lai cai dau tuen
                default:
                    System.out.println("Lựa chọn đúng menu");
                    break;
            }
        }
    }

    private void xoaten() {
        System.out.println("Nhập tên cần xóa thông tin: ");
        String delName = sc.next();
        CanBolist.removeIf(canBo -> canBo.getFullname().equals(delName));
        printtoDessk();
    }

    private void timkiemten() {
        System.out.println("Nhập vào tên muốn tìm kiếm: ");
        String findName = sc.next();
        for (CanBo canBo : CanBolist) {
            if (canBo.getFullname().equals(findName)) {
                System.out.println(canBo);
            }
        }
    }

    private void printtoDessk() {
        for (CanBo CanBo : CanBolist) {
            System.out.println(CanBo);
        }
    }

    private void themcanbo() {
        System.out.println("----Lựa chọn chức năng bạn muốn sử dụng------");
        System.out.println("--- 1. Thêm Kỹ Sư -- - ");
        System.out.println("--- 2. Thêm Công Nhân -- - ");
        System.out.println("--- 3. Thêm Nhân Viên-- - ");


        int choose1 = sc.nextInt();
        switch (choose1) {
            case 1:
                System.out.println("Nhập vào tên Kỹ Sư: ");
                String name = sc.next();
                System.out.println("Nhập vào tuổi Kỹ Sư: ");
                int age = sc.nextInt();
                System.out.println("Nhập vào giới tính Kỹ Sư 1.Male,2.F emale, 3. Unknown:");

                int flagEngineer = sc.nextInt();
                Gender genderName1 = null;
                switch (flagEngineer) {
                    case 1:
                        genderName1 = Gender.MALE;
                        break;
                    case 2:
                        genderName1 = Gender.FEMALE;
                        break;
                    case 3:
                        genderName1 = Gender.UNKNOWN;
                        break;
                }
                System.out.println("Nhập vào địa chỉ Kỹ Sư : ");
                String address = sc.next();
                System.out.println("Nhập vào chuyên ngành Kỹ Sư: ");
                String chuyennganh = sc.next();
                CanBo KySu = new entity.KySu(name, age, genderName1, address, chuyennganh);
                CanBolist.add(KySu);
                break;
            case 2:
                System.out.println("Nhập vào tên Công nhân: ");
                String name1 = sc.next();
                System.out.println("Nhập vào tuổi Công nhân: ");
                int age1 = sc.nextInt();
                System.out.println("Nhập vào giới tính Công nhân 1.Male, 2.F emale, 3. Unknown:");

                int flagGender = sc.nextInt();
                Gender genderName = null;
                switch (flagGender) {
                    case 1:
                        genderName = Gender.MALE;
                        break;
                    case 2:
                        genderName = Gender.FEMALE;
                        break;
                    case 3:
                        genderName = Gender.UNKNOWN;
                        break;
                }
                System.out.println("Nhập vào địa chỉ Cong Nhan: ");
                String address1 = sc.next();
                System.out.println("Nhập vào bậc Cong Nhan: ");

                int level = sc.nextInt();
                CanBo Congnhan = new entity.CongNhan(name1, age1, genderName, address1, level);
                CanBolist.add(Congnhan);
                break;
            case 3:
                System.out.println("Nhập vào tên Nhân Viên: ");
                String name2 = sc.next();
                System.out.println("Nhập vào tuổi Nhân Viên: ");
                int age2 = sc.nextInt();
                System.out.println("Nhập vào giới tính Nhân Viên 1.Male, 2.F emale, 3. Unknown:");

                int flagEmployee = sc.nextInt();
                Gender genderEmployee = null;
                switch (flagEmployee) {
                    case 1:
                        genderEmployee = Gender.MALE;
                        break;
                    case 2:
                        genderEmployee = Gender.FEMALE;
                        break;
                    case 3:
                        genderEmployee = Gender.UNKNOWN;
                        break;
                }
                System.out.println("Nhập vào địa chỉ Nhân Viên: ");
                String address2 = sc.next();
                System.out.println("Nhập vào nhiệm vụ Nhân Viên: ");
                String nhiemvu = sc.next();
                CanBo NhanVien = new entity.NhanVien(name2, age2, genderEmployee, address2, nhiemvu);
                CanBolist.add(NhanVien);
                break;
            default:
                break;
        }
    }
}