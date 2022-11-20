package Entity;
// class hình tròn nè
public class circle extends geometry  {
    public circle(Float a, Float b) throws Exception {
        super(a, b);

    }
    @Override
    public Float tinhChuVI(Float a, Float b) {
        return 2*a*(Configs.PI);
    }
    @Override
    public Float tinhDienTich(Float a, Float b) {
        return (float) (Configs.PI*(Math.pow(a, 2)));
    }
}
