package FontEnd;

import BackEnd.Excrise2_4;

import java.util.Scanner;

public class Program2_4 {
    private Scanner sc;
    private Excrise2_4 ex4 = new Excrise2_4();

    public Program2_4() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program2_4 program2_4 = new Program2_4();
        while (true) {
            System.out.println("=========================================");

            System.out.println("-========= Nhập chức năng sử dụng ===========");
            System.out.println("-========= 1 Sum (int , int )===========");
            System.out.println("-========= 2 Sum (int , int ,long)===========");
            System.out.println("-========= 3 Sum (byte , int ,float)===========");
            System.out.println("-========= 4 kết thúc chương trình ===========");
            System.out.println("=========================================");

            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    program2_4.sum1();
                    break;
                case 2:
                    program2_4.sum2();
                    break;
                case 3:
                    program2_4.sum3();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập lại thông tin đầu vào");
                    break;
            }
        }

    }

    public void sum1() {
        System.out.println("-=========Nhập  a ===========");
        int a = sc.nextInt();
        System.out.println("-=========Nhập  b ===========");
        int b = sc.nextInt();
        ex4.sum(a, b);
        System.out.println("Tổng của dãy số trên là : " + ex4.sum(a, b));
    }

    public void sum2() {
        System.out.println("-=========Nhập  a ===========");
        int a = sc.nextInt();
        System.out.println("-=========Nhập  b ===========");
        int b = sc.nextInt();
        System.out.println("-=========Nhập  b ===========");
        long c = sc.nextLong();
        ex4.sum(a, b, c);
        System.out.println("Tổng của dãy số trên là : " + ex4.sum(a, b, c));
    }

    public void sum3() {
        System.out.println("-=========Nhập  a ===========");
        byte a = sc.nextByte();
        System.out.println("-=========Nhập  b ===========");
        int b = sc.nextInt();
        System.out.println("-=========Nhập  b ===========");
        float c = sc.nextFloat();
        ex4.sum(a, b, c);
        System.out.println("Tổng của dãy số trên là : " + ex4.sum(a, b, c));
    }
}
