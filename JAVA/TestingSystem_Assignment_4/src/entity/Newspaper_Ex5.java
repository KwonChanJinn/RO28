package entity;

import java.sql.Date;
import java.time.LocalDate;


public class Newspaper_Ex5 extends Document_Ex5 {

    //Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
    //Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
    //Các báo cần quản lý thêm: Ngày phát hành.
    //Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
    //cách hiệu quả.
    //Xây dựng lớp QuanLySach có các chức năng sau
    // tap chí cái này để set mẫu chung nè

    private LocalDate date ; // ngày phất hành

    public Newspaper_Ex5(String tensach, int maTL, String nhaxuatban, int soPH, LocalDate date) {
        super(tensach, maTL, nhaxuatban, soPH);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return ("Tên báo : "+super.getTensach()+"Mã Tài Liệu :"+super.getMaTL()+"Nhà Xuất Bản"+super.getNhaxuatban()+
                "Số Phát Hành: "+super.getSoPH()+"Newspaper_Ex5{" +
                "date=" + date +
                '}');
    }
}
