package Assigment3;

import java.util.Random;
import java.util.Scanner;

public class Exercise_3_BoxingUnboxing {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-------------------------------------Bài 1-----------------------------------");
        System.out.println("");

        Question_1();

        System.out.println("-------------------------------------Bài 2-----------------------------------");
        System.out.println("");

        Question_2();

        System.out.println("-------------------------------------Bài 3-----------------------------------");
        System.out.println("");

        Question_3();
    }

    //Question 1:
    //Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
    //Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
    //float có 2 số sau dấu thập phân)

    static void Question_1() {
        int i = 5000;
        float f = (int) i;
        System.out.printf("%.2f", f);
    }
    //Question 2:
    //Khai báo 1 String có value = "1234567"
    //Hãy convert String đó ra số int

    static void Question_2() {
            String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    //Question 3:
    //Khởi tạo 1 số Integer có value là chữ "1234567"
    //Sau đó convert số trên thành datatype int
    static void Question_3() {
        Integer i = 123456789;
        int i1 = i.intValue();
        Long ax = 10L;
        long l1 = ax.longValue();
        System.out.println(i1);
        System.out.println(l1);
    }
}

