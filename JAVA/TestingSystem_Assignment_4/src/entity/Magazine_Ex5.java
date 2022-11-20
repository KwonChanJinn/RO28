package entity;

public class Magazine_Ex5 extends Document_Ex5{

    //Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.

    private int thangPH;

    public Magazine_Ex5(String tensach, int maTL, String nhaxuatban, int soPH, int thangPH) {
        super(tensach, maTL, nhaxuatban, soPH);
        this.thangPH = thangPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return super.toString() +"Magazine_Ex5{" +
                "thangPH=" + thangPH +
                '}';
    }
}
