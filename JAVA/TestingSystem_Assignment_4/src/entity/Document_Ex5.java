package entity;

public class Document_Ex5 {
    //Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi
    //tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất),
    //Tên nhà xuất bản, số bản phát hành.


    //Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
    //Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
    //Các báo cần quản lý thêm: Ngày phát hành.
    //Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
    //cách hiệu quả.
    //Xây dựng lớp QuanLySach có các chức năng sau
    // tap chí cái này để set mẫu chung nè
    private String tensach;
    private int maTL; // mã tài liệu
    private String nhaxuatban;
    private int soPH;// số phát hành

    public Document_Ex5() {
    }

    public Document_Ex5(String tensach, int maTL, String nhaxuatban, int soPH) {
        this.tensach = tensach;
        this.maTL = maTL;
        this.nhaxuatban = nhaxuatban;
        this.soPH = soPH;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    @Override
    public String toString() {
        return "Document_Ex5{" +
                "tensach='" + tensach + '\'' +
                ", maTL=" + maTL +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", soPH=" + soPH +
                '}';
    }
}
