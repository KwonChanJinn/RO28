package backend;

import entity.Account_Ex4;
import entity.Cricle_Ex4;
import entity.Date_Ex4;
import entity.Student;

import java.util.Locale;

public class Excrise4_2 {
    public static void main(String[] args) {

        System.out.println("Bài này thử test đầu vào của Date");
        System.out.println("");
        Question_1();
        System.out.println("Bài tập hình tròn");
        System.out.println("");
        Question_2();
        System.out.println("Nhập dữ liệu Account");
        System.out.println("");
        Question_3();
        System.out.println("Nhập dữ liệu và check năm nhuận hay không nhuận:");
        System.out.println("");
        Question_4();
        System.out.println("Nhập dữ liệu về Account Tiền vào ra ");
        System.out.println("");
        Question_5();


    }

    public static void Question_1() {
        Date_Ex4 date = new Date_Ex4(21, 9, 2024);
        System.out.println(date);
    }

    public static void Question_2() {
        Cricle_Ex4 circle = new Cricle_Ex4(2.0, "red");
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
    }

    public static void Question_3() {
        Student st1 = new Student(1, "Song", "Bài 1");
        st1.SumDiemHL(1);
        Student st2 = new Student(1, "Song2", "Bài 1");
        st2.SumDiemHL(8);
        Student st3 = new Student(1, "Song3", "Bài 1");
        st3.SumDiemHL(9);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }


    public static void Question_4() {

        Date_Ex4 date = new Date_Ex4(21, 9, 2024);

        System.out.println("Bạn vừa tạo ngày: " + date);
        System.out.println("Check năm nhuận: ");
        if (date.isLeapYear()) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }

    public static void Question_5() {

        Account_Ex4 acc1 = new Account_Ex4("1", "acc1", 1000000000);
        Account_Ex4 acc2 = new Account_Ex4("2", "acc2", 2000000000);
        System.out.print("Thông tin dữ liệu account1 : ");
        System.out.printf(Locale.US, "%,d%n", acc1.getBalance());
        System.out.print("Thông tin dữ liệu account2 :");
        System.out.printf(Locale.US, "%,d%n", acc2.getBalance());

        acc1.credit(500000);
        System.out.print("Số tiền sau khi chuyển vào (Credit) ");
        System.out.printf(Locale.US, "%,d%n", acc1.getBalance());

        acc1.debit(250000);
        System.out.print("Số tiền Acc1 sau khi trừ tiền (debit) :");
        System.out.printf(Locale.US, "%,d%n", acc1.getBalance());

        System.out.print("Acc1 chuyển  tiền cho acc2 :");
        long c=acc1.getBalance()- acc1.debit(2000000);

        // tuy hơi lằng nhằng nhưng làm thế cho nó phức tạp hóa vấn đề lên á

        System.out.print("Sau khi chuyển số tiền của Acc1 " );
        System.out.printf(Locale.US, "%,d%n", acc1.getBalance());
        long Chuyentien = c+ acc2.getBalance();
        System.out.print("Số tiền sau khi chuyển vào (Credit) Acc2 ");
        System.out.printf(Locale.US, "%,d%n", Chuyentien);
        // acc1.getBalance() + " accQues2: " + acc2.getBalance());

    }

}

