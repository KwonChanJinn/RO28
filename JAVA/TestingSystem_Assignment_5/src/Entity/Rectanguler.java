package Entity;

public class Rectanguler {
    private  Float a;
    private  Float b;

    public Rectanguler() {
    }

    public Rectanguler(Float a, Float b) {
        this.a = a;
        this.b = b;
    }

    public Float Tinhchuvi(){
        System.out.println("Chu vi hình chữ nhật là ");
        return (a+b)*2;
    }
    public Float Tinhdientich() {
        System.out.println("Diện tích hình chữ nhật là");
        return a*b;
    }


}
