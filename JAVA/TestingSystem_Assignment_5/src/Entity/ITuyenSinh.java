package Entity;

public interface ITuyenSinh {
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

    public void them();
    public void xoa();
    public void timid();

    public  void timkiem();


}
