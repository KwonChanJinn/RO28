package BackEnd;

import Entity.ITuyenSinh;
import Entity.KhoiThi;
import Entity.QuanLyThongTin;

import java.util.ArrayList;
import java.util.Scanner;

public class Excrise1_2 implements ITuyenSinh {

    private Scanner sc;


    private ArrayList<QuanLyThongTin> QuanLyList;

    public Excrise1_2() {
        sc = new Scanner(System.in);
        QuanLyList = new ArrayList<QuanLyThongTin>();
    }

    public void Question2b() {
        Menu();
    }

    public void Menu() {

        while (true) {
            System.out.println("===========================Chương trình này hơi lởm========================");
            System.out.println("=================1=============Thêm mới thí sinh============================");
            System.out.println("=================2=============XÓA  thông tin của thí sinh và khối thi============================");
            System.out.println("=================3=============Tìm kiếm theo số báo danh==============================");
            System.out.println("=================4=============HIỂN THỊ ALL SV==============================");
            System.out.println("=================5==================Exit===================================");

            int choosemenu = sc.nextInt();
            switch (choosemenu) {
                case 1:
                    them();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    timid();
                    break;
                case 4:
                    timkiem();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập lại đầu vào");
                    break;
            }
        }
    }

    @Override
    public void them() {

        System.out.println("Nhập số báo danh của học sinh");
        int sbd1 = sc.nextInt();
        System.out.println("Nhập đầy đủ họ tên không dấu cách khoảng trắng");
        String fullname = sc.next();
        System.out.println("Nhập thông tin địa chỉ nơi ở ");
        String address = sc.next();
        System.out.println("Nhập thông vùng ưu tiên ");
        String level = sc.next();
        System.out.println("Nhập vào khối thí sinh chọn các khối A, B, C: ");
        String khoithiQL = sc.next();

        QuanLyThongTin q1 = new QuanLyThongTin(sbd1, fullname, address, level, new KhoiThi(khoithiQL));
        QuanLyList.add(q1);
    }

    @Override
    public void xoa() {

        System.out.println("Nhập thông ten tin sinh viên cần xóa ");
        String index = sc.next();

        for (QuanLyThongTin ql1 : QuanLyList) {

            QuanLyList.removeIf(QuanLyThongTin -> QuanLyThongTin.getFullname().equals(index));
            System.out.println("Đã Xóa Học sinh này ra khỏi nhóm ");
            System.out.println(ql1);
            return;
        }
    }

    @Override
    public void timid() {

        System.out.println("Nhập số báo danh của học sinh");
        int id = sc.nextInt();
        for (QuanLyThongTin q1 : QuanLyList) {
            // nếu cái tên mình nhập vào mà băng cái ID thì xuất ra chạy foreach
            if (q1.getSbd() == id) {
                System.out.println(q1);
            }

        }
    }

    @Override
    public void timkiem() {
        // chaåy foreach
        for (QuanLyThongTin khoithi : QuanLyList) {
            System.out.println(khoithi);
        }
    }

}



