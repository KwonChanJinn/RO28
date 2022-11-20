package entity;

public class Manager_Ex6 extends User_Ex6 {


    public Manager_Ex6(String name, double salaryradio) {
        super(name, salaryradio);
    }

    // bấm chuột -hai cái này đang thừa kế abs nè

     // khia sử dung trong ha m
    @Override
    public double calculatePay() {
        return salaryradio * 520;
    }
}
