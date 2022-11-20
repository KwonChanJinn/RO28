package entity;

public class Waiter_Ex6  extends  User_Ex6{
    public Waiter_Ex6(String name, double salaryradio) {
        super(name, salaryradio);
    }

    @Override
    public double calculatePay() {
        return salaryradio * 220;
    }
}
