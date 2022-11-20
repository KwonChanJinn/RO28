package BackEnd;

import Entity.Mymath;

public class Excrise2_4 extends Mymath {
// bài này sử dung jtisnh đa hình override overloading

    @Override
    public int sum(int a, int b) {
        return super.sum(a, b);
    }

    public int sum(int a, int b, long c) {
        return (int) (a + b + c);
        //ép kiểu
    }

    public float sum(byte a, long c, float b) {
        return (float) (a + b + c);
    }
}
