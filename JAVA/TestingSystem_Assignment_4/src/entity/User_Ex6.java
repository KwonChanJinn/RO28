package entity;

public abstract class User_Ex6 {
    //Hãy xây dựng 1 class User với các thuộc tính name kiểu String và
    //salary ratio kiểu double.
    //a) Viết các hàm cho phép nhập và trả về name, salary ratio.
    //b) Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân
    //viên, kiểu double.
    //c) Viết hàm displayInfor()
    private  String name ;
    protected void name(){};

    public  double salaryradio;

    public abstract double calculatePay();

    public User_Ex6() {
    }

    public User_Ex6(String name, double salaryradio) {
        this.name = name;
        this.salaryradio = salaryradio;
    }
    public void displayInfor() {// là xuất ra thông tin

        System.out.println("Name: " + name);
        System.out.println("Ration Salary: " + salaryradio);
        System.out.println("Lương chi trả: " + calculatePay());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryradio() {
        return salaryradio;
    }

    public void setSalaryradio(double salaryradio) {
        this.salaryradio = salaryradio;
    }

    @Override
    public String toString() {
        return "User_Ex6{" +
                "name='" + name + '\'' +
                ", salaryradio=" + salaryradio +
                '}';
    }
}
