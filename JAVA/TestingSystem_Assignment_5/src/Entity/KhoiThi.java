package Entity;

public class KhoiThi {
    //Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối
    //C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa
    //chỉ, mức ưu tiên.
    //Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
    //Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
    //Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
    //a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
    //b) Xây dựng interface ITuyenSinh và class TuyenSinh có các
    //chức năng:
    //a. Thêm mới thí sinh.
    //b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
    //c. Tìm kiếm theo số báo danh.
    //d. Thoát khỏi chương trình.

    private String khoithi;
    private String tenkhoi;



    public KhoiThi(String tenkhoi) {
        this.tenkhoi = tenkhoi;
    }

// khối tên khối thôi
    // bài toán kinh điển

    public String getTenkhoi() {
        return tenkhoi;
    }


//    public String getTenkhoi() {
//        return tenkhoi;
//    }
// khối thi lag khối A khối B khối C các thứ  gồm môn gì


    public String getKhoithi() {
        switch (this.tenkhoi) {
            case "A":
                this.khoithi="Tổ hợp Toán Lý Hóa ";
                break;
            case "B":
                this.khoithi="Tổ hợp Toán Hóa Sinh ";
                break;
            case "C":
                this.khoithi="Tổ hợp Văn Sử Địa ";
                break;

        }
        return this.khoithi;
    }

}

