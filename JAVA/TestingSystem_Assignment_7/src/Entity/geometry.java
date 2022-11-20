package Entity;

import java.io.ObjectInputFilter;


// class hình học nè
public abstract class geometry {
    private Float a;
    private Float b;
    public static int COUNT = 0;

    public geometry() {

    }

    public abstract Float tinhChuVI(Float a, Float b);
    public abstract Float tinhDienTich(Float a, Float b);
    public geometry(Float a, Float b) throws Exception {
        super();
        COUNT++;
        if (COUNT <= Configs.SO_LUONG_HINH_TOI_DA) {
            this.a = a;
            this.b = b;
        } else {
            throw new geometryException();
        }

    }
}
