package entity;

public class Nhanvien_Ex6 extends User_Ex6 {


    public Nhanvien_Ex6(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return salaryradio * 420;
    }

}
