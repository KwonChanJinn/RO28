package Entity;

public class MyMathex2 {

    public static final Double PI = 3.14;
    public static double sum(int a) {
        return a + PI;
    }
    public static int max(int a, int b) {
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }
    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }
    public static int sum(int a, int b) {
        return a + b;
    }
}
