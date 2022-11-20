package entity;

public class Boock_Ex5 extends Document_Ex5 {
    //Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
    //Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
    //Các báo cần quản lý thêm: Ngày phát hành.
    //Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
    //cách hiệu quả.
    //Xây dựng lớp QuanLySach có các chức năng sau
    // tap chí cái này để set mẫu chung nè

    private String tenTG;
    private int Sotrang;

    public Boock_Ex5(String tensach ,int maTL, String nhaxuatban, int soPH, String tenTG, int sotrang) {
        super(tensach,maTL, nhaxuatban, soPH);
        this.tenTG = tenTG;
        Sotrang = sotrang;
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int sotrang) {
        Sotrang = sotrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    @Override
    public String toString() {
        return ("Tên sách"+super.getTensach()+"Mã Tài Liệu :"+super.getMaTL()+"Nhà Xuất Bản"+super.getNhaxuatban()+
                "Số Phát Hành: "+super.getSoPH()+"Boock_Ex5{" +
                "tenTG='" + tenTG + '\'' +
                ", Sotrang=" + Sotrang +
                '}');
    }
}
