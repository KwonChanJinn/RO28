package Entity;

public class QuanLyThongTin {
    //Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa
    //        //chỉ, mức ưu tiên.

    private int sbd;
    private String fullname;
    private String address;
    private String levelpriority;

    private KhoiThi khoithiarr;

    public QuanLyThongTin() {
    }

    public QuanLyThongTin(int sbd, String fullname, String address, String levelpriority, KhoiThi khoithiarr) {
        this.sbd = sbd;
        this.fullname = fullname;
        this.address = address;
        this.levelpriority = levelpriority;
        this.khoithiarr = khoithiarr;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevelpriority() {
        return levelpriority;
    }

    public void setLevelpriority(String levelpriority) {
        this.levelpriority = levelpriority;
    }

    public KhoiThi getKhoithiarr() {
        return khoithiarr;
    }

    public void setKhoithiarr(KhoiThi khoithiarr) {
        this.khoithiarr = khoithiarr;
    }

    @Override
    public String toString() {
        return "QuanLyThongTin{" +
                "sbd=" + sbd +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", levelpriority='" + levelpriority + '\'' +
                ", khoithiarr=" + khoithiarr.getTenkhoi()
                + "+ Subject =" +
                khoithiarr.getKhoithi() + "]";
    }
}
