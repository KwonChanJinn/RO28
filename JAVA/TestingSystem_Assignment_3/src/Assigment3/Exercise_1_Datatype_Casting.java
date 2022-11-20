package Assigment3;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1_Datatype_Casting {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("-------------------------------------Bài 1-----------------------------------");
        System.out.println("");

        Question_1();

        System.out.println("");
        System.out.println("-------------------------------------Bài 2-----------------------------------");
        System.out.println("");

        Question_2();

        System.out.println("");
        System.out.println("-------------------------------------Bài 3-----------------------------------");
        System.out.println("");

        Question_3();

        System.out.println("");
        System.out.println("-------------------------------------Bài 4-----------------------------------");
        System.out.println("");

        Question_4();

    }

    //Question 1:
    //Khai báo 2 số lương có kiểu dữ liệu là float.
    //Khởi tạo Lương của Account 1 là 5240.5 $
    //Khởi tạo Lương của Account 2 là 10970.055$
    //Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

    static void Question_1() {

        float f = 5240.5f;
        float f1 = 10970.055f;

        System.out.println("Lương nhân viên 1 " + f);
        System.out.println("Lương nhân viên 2 " + f1);

        int i = (int) f;
        System.out.println("Lương nhân viên 1 " + i);
        int i1 = (int) f1;
        System.out.println("Lương nhân viên 1 " + i1);
    }

    //Question 2:
    //Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
    //có số 0 ở đầu cho đủ 5 chữ số)

    static void Question_2() {
        int[] b = new int[10000];
        Random rand = new Random();
        for (int u = 0; u <= 99999; u++) {
            b[u] = rand.nextInt(10000);
            if (b[u] <= 99999 && b[u] >= 0) {
                if (b[u] <= 10) {
                    System.out.println("0000" + b[u]);
                } else if (b[u] > 10 && b[u] <= 100) {
                    System.out.println("000" + b[u]);
                } else if (b[u] > 100 && b[u] <= 1000) {
                    System.out.println("00" + b[u]);
                } else if (b[u] > 1000 && b[u] <= 10000) {
                    System.out.println("0" + b[u]);
                } else {
                    System.out.println(b[u]);
                }
                break;
            }

        }
    }

    //Question 3:
    //Lấy 2 số cuối của số ở Question 2 và in ra.
    //Gợi ý:
    //Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
    //Cách 2: chia lấy dư số đó cho 100

    static void Question_3() {
        int min = 0;
        int max = 99999;
        int a = (int) (Math.random() * max) + min;
        while (a < 10000) {
            a = a * 10;
        }

        System.out.println("Số ngẫu nhiên: " + a);
        String b = String.valueOf(a);
        System.out.println("Hai số cuối: " + b.substring(3));
    }

    //Question 4:
    //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    static void Question_4() {

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = scanner.nextInt();
        System.out.println("Nhập b = ");
        b = scanner.nextInt();
        if (b != 0) {
            System.out.println("Thương: " + (float) a / (float) b);
        } else {
            System.out.println("không chia đc đâu ");
        }
        return;
    }
}
