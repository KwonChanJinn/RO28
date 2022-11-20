package entity;

public class NhanVien extends CanBo {
    private String congviec;

    public NhanVien(String fullname, int age, Gender gender, String address, String congviec) {
        super(fullname, age, gender, address);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }


    @Override
    public String toString() {
        return ("Họ và tên :"+
                super.getFullname()+" Quê Quán: "+
                super.getAddress()+"  Tuổi: "+
                super.getAge() +"  Giới Tính "+
                super.getGender()+ " "+
                "NhanVien{" + "congviec='" + congviec + '\'' +
                '}');
    }
}
