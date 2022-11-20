package frontend;

import java.lang.*;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        int  a = sc.nextInt();
        System.out.println("Nhập vào số b");
        int  b = sc.nextInt();

        try {
            float result = divide(a, b);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("Đã làm xong bài tập 2 " + "DIVIDE COMPLETE");
        }

    }

    public static float divide(int a, int b) {
        return a / b;
    }
}
