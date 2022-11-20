package tt;

public class Student extends  Persion {

    @Override
    public int cong(int a, int b) {
        return  a+b;
    }

    @Override
    public Student dem() {
        return new Student();
    }

    public int cong(int a, int b, int c) {
        return c+a+b;
    }

    public int cong(int a, int b, String c) {
        return a+b;
    }

    public int cong(int a, int b, float c) {
        return (int) c+a+b;
    }

    public int cong(int a, int b, double c) {
        return (int) c+a+b;
    }
    protected void cong(int a, int b, long c) {
        System.out.println(a+b+c);
    }
}
