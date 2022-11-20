package Entity;

public class geometryException extends Exception {

    // tạo 1 exception bắt lỗi
    public geometryException() {
        super("Số lượng hình đã tạo vượt quá số lượng cho phép là: " + Configs.SO_LUONG_HINH_TOI_DA + " nhập lại.");

    }
}
