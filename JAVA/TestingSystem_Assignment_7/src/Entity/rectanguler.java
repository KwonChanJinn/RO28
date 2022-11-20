package Entity;
// class hình chữ nhật nè
public class rectanguler extends geometry {

    public rectanguler(Float a ,Float b ) throws Exception{
        super(a, b);
    }

    @Override
    public Float tinhChuVI(Float a, Float b) {

        return 2 * (a + b);
    }

    @Override
    public Float tinhDienTich(Float a, Float b) {
        return (a * b);
    }
}
