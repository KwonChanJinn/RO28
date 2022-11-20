package Entity;

public class Square extends Rectanguler {
    public Square(Float a) {
        super(a,a);
    }

    @Override
    public Float Tinhchuvi() {
        System.out.println("Tính chu vi hìh vuông");
        return super.Tinhchuvi();
    }


    @Override
    public Float Tinhdientich() {
        System.out.println("Tính diện tích hìh vuông");
        return super.Tinhdientich();
    }

    public static void main(String[] args) {
        Square s = new Square(5.5f);
        System.out.println(s.Tinhchuvi());
        System.out.println(s.Tinhdientich());
    }


}
