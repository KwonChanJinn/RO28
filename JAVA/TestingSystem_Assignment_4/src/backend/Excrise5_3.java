package backend;

import entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Excrise5_3 {
    private ArrayList<Document_Ex5> DocumentList;
    private Scanner sc;
    // tạo 1 mảng là cái tài liệu list cho nó

    public Excrise5_3() {
        DocumentList = new ArrayList<Document_Ex5>(); // tạo 1 cái mảng mới cho nó
        DocumentList.size();// độ rộng của mảng
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {

        System.out.println("Phần Mềm Quản Lý Thư Viện");
        Excrise5_3 excrise5Question3 = new Excrise5_3();
        excrise5Question3.Question_3();

    }

    public void Question_3() {
        HighSchooStudent highScho = new HighSchooStudent("Trần thanh song", 1, "Lớp RO28", "Đại Học Bách Khoa Hà Nội");
        System.out.println(highScho);

        Boock_Ex5 boockEx5 = new Boock_Ex5("Conan", 1, "Kim Đồng", 20, "Naruto", 300);
        System.out.println(boockEx5);

        Magazine_Ex5 magazineEx5 = new Magazine_Ex5("conan", 1, "kimdong,1", 1, 2);
        System.out.println(magazineEx5);

        Newspaper_Ex5 newspaperEx5 = new Newspaper_Ex5("shin", 2, "nhahat", 1, LocalDate.of(2001, 2, 8));
        System.out.println(newspaperEx5);
    }

    public void Question_4() {
        menu();
    }

    public void menu() {
        while (true) {// nếu đúng thì làm cái sau
            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
            System.out.println("=== 1. Thêm mới sách ===");
            System.out.println("=== 2. Tìm kiếm sách theo loại ===");
            System.out.println("=== 3. Hiện thị thông tin sách ===");
            System.out.println("=== 4. Xóa sách theo các loại ===");
            System.out.println("=== 5. Thoát khỏi chương trình. ===");

            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    themmoisach();
                    break;
                case 2:
                    timkiemsach();
                    break;
                case 3:
                    hienthithongtinsach();
                    break;
                case 4:
                    xoasach();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập đúng thông tin đầu vào ");
                    break;

            }

        }
    }

    private void themmoisach() {
        System.out.println("----Lựa chọn chức năng bạn muốn sử dụng------");
        System.out.println("--- 1. Thêm Sách -- - ");
        System.out.println("--- 2. Thêm Báo -- - ");
        System.out.println("--- 3. Thêm Tạp chí- - ");

        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhập vào tên sách: ");
                String tensach = sc.next();
                System.out.println("Nhập vào ID sách ");
                int idsach = sc.nextInt();
                System.out.println("Nhập vào nhà xuất bản sách: ");
                String nhaxb = sc.next();
                System.out.println("Nhập vào số phát hành sách: ");
                int soPh = sc.nextInt();
                System.out.println("Nhập vào tên tác giả sách: ");
                String tentg = sc.next();
                System.out.println("Nhập vào số trang sách: ");
                int sotrang = sc.nextInt();
                // in vào mảng sách vào cái list cho nó
                Document_Ex5 arrsach = new entity.Boock_Ex5(tensach, idsach, nhaxb, soPh, tentg, sotrang);
                DocumentList.add(arrsach);// thêm sữ liệu add array sách vào cái mảng document list
                break;
            case 2:
                System.out.println("Nhập vào tên báo: ");
                String tenbao = sc.next();
                System.out.println("Nhập vào ID sácbáoh ");
                int idbao = sc.nextInt();
                System.out.println("Nhập vào nhà xuất bản báo: ");
                String nhaxb1 = sc.next();
                System.out.println("Nhập vào số phát hành báo: ");
                int soPh1 = sc.nextInt();
                System.out.println("Nhập vào tên tác giả báo: ");
                int numReleaseArticle = sc.nextInt();
                System.out.println("Nhập vào ngày phát hành: ");
                int day = sc.nextInt();
                System.out.println("Nhập vào tháng phát hành: ");
                int month = sc.nextInt();
                System.out.println("Nhập vào năm phát hành: ");
                int year = sc.nextInt();
                LocalDate ngayph = LocalDate.of(year, month, day);
                // in vào mảng sách vào cái list cho nó
                Document_Ex5 arrbao = new entity.Newspaper_Ex5(tenbao, idbao, nhaxb1, soPh1, ngayph);
                DocumentList.add(arrbao);// thêm sữ liệu add array sách vào cái mảng document list
                break;
            case 3:
                System.out.println("Nhập vào tên sách: ");
                String tentapchi = sc.next();
                System.out.println("Nhập vào ID sách ");
                int idtapchi = sc.nextInt();
                System.out.println("Nhập vào nhà xuất bản sách: ");
                String nhaxb2 = sc.next();
                System.out.println("Nhập vào số phát hành sách: ");
                int soPh2 = sc.nextInt();
                System.out.println("Nhập vào số tháng phát hành báo : ");
                int thangph = sc.nextInt();
                // in vào mảng sách vào cái list cho nó
                Document_Ex5 arrtapchi = new entity.Magazine_Ex5(tentapchi, idtapchi, nhaxb2, soPh2, thangph);
                DocumentList.add(arrtapchi);// thêm sữ liệu add array sách vào cái mảng document list
                break;
        }

    }

    private void timkiemsach() {
        System.out.println("Nhập vào loại cần tìm kiếm ");
        System.out.println("----Lựa chọn chức năng bạn muốn sử dụng------");
        System.out.println("--- 1. Thêm Sách --- ");
        System.out.println("--- 2. Thêm Báo --- ");
        System.out.println("--- 3. Thêm Tạp chí-- ");

        int check = sc.nextInt();
        switch (check) {
            case 1:
                System.out.println("Nhập tên sách vào:");
                String tensach = sc.next();// hơi thừa vì ko dùng
                // dùng foreach
                for (Document_Ex5 document_ex5 : DocumentList) {
                    if (document_ex5 instanceof Boock_Ex5) {
                        if (document_ex5.getTensach().equals(tensach)) {
                            System.out.println(document_ex5);
                        } else {
                            System.out.println("không có sách nào là sách này ");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Nhập tên báo vào:");
                String benbao = sc.next();// hơi thừa vì ko dùng
                // dùng foreach
                for (Document_Ex5 document_ex5 : DocumentList) {
                    if (document_ex5 instanceof Newspaper_Ex5) {
                        if (document_ex5.getTensach().equals(benbao)) {
                            System.out.println(document_ex5);
                        } else {
                            System.out.println("không có báo nào là sách này ");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Nhập tên tạp chí vào:");
                String tentapchi = sc.next();// hơi thừa vì ko dùng
                // dùng foreach
                for (Document_Ex5 document_ex5 : DocumentList) {
                    if (document_ex5 instanceof Magazine_Ex5) {
                        if (document_ex5.getTensach().equals(tentapchi)) {
                            System.out.println(document_ex5);
                        } else {
                            System.out.println("không có tạp chí nào là sách này ");
                        }
                    }
                }
                break;
        }

    }

    private void hienthithongtinsach() {
        for (Document_Ex5 documentEx5 : DocumentList) {
            System.out.println(documentEx5);
        }

    }

    private void xoasach() {

        System.out.println("Nhập vào mã tài liệu muốn xóa: ");
        int idDel = sc.nextInt();
        System.out.println("Nhập tên sách vào:");
        String tensach = sc.next();

        int checkDel = sc.nextInt();
        switch (checkDel) {
            case 1: {
                Boolean Check = false;
                for (Document_Ex5 document : DocumentList) {
                    if (document instanceof Boock_Ex5 && document.getMaTL() == idDel) {
                        Check = true;
                    }
                }
                if (Check) {
                    DocumentList.removeIf(doc -> doc.getMaTL() == idDel);
                    for (Document_Ex5 document : DocumentList) {
                        if (document instanceof Boock_Ex5)
                            System.out.println("Xóa tài liệu thành công, danh sách tài liệu còn lại:");
                        System.out.println(document);
                    }
                } else {
                    System.out.println("Mã tài liệu bạn nhập không có trên hệ thống.");
                }
            }
            case 2: {
                Boolean Check = false;
                for (Document_Ex5 document : DocumentList) {
                    if (document instanceof Newspaper_Ex5 && document.getMaTL() == idDel) {
                        Check = true;
                    }
                }
                if (Check) {
                    DocumentList.removeIf(doc -> doc.getMaTL() == idDel);
                    for (Document_Ex5 document : DocumentList) {
                        if (document instanceof Newspaper_Ex5)
                            System.out.println("Xóa tài liệu thành công, danh sách tài liệu còn lại:");
                        System.out.println(document);
                    }
                } else {
                    System.out.println("Mã tài liệu bạn nhập không có trên hệ thống.");
                }
            }
            case 3: {
                Boolean Check = false;
                for (Document_Ex5 document : DocumentList) {
                    if (document instanceof Magazine_Ex5 && document.getMaTL() == idDel) {
                        Check = true;
                    }
                }
                if (Check) {
                    DocumentList.removeIf(doc -> doc.getMaTL() == idDel);
                    for (Document_Ex5 document : DocumentList) {
                        if (document instanceof Magazine_Ex5)
                            System.out.println("Xóa tài liệu thành công, danh sách tài liệu còn lại:");
                        System.out.println(document);
                    }
                } else {
                    System.out.println("Mã tài liệu bạn nhập không có trên hệ thống.");
                }
            }
        }
    }
}
