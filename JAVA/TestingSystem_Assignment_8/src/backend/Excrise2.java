package backend;

import entity.ScanerInput;
import entity.Student;
import entity.StudentEx2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excrise2 {
    private Scanner scanner = new Scanner(System.in);

    public void question1() {
        List<StudentEx2> listStudentEx2 = new ArrayList<StudentEx2>();
        while (true) {
            loadMenuEx2();
            System.err.println("Nhập thông tin đầu vào :");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập vào số sinh viên: ");
                    int num = scanner.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Nhập sinh viên " + (i + 1) + ": ");
                        System.out.println("Nhập vào tên: ");
                        String nameStudent = scanner.next();
                        System.out.println("Nhập vào năm sinh");
                        LocalDate birthStudent = ScanerInput.inputLocalDate();
                        System.out.println("Nhập vào điểm: ");
                        int scoreStudent = scanner.nextInt();

                        StudentEx2 stex2 = new StudentEx2(nameStudent, birthStudent, scoreStudent);
                        listStudentEx2.add(stex2);
                    }
                    System.out.println("Danh sách sinh viên vừa nhập: ");
                    for (StudentEx2 studentEx2 : listStudentEx2) {
                        System.out.println(studentEx2);
                    }
                    break;

                case 2:
                    Collections.sort(listStudentEx2);
                    System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên: ");
                    for (StudentEx2 studentEx2 : listStudentEx2) {
                        System.out.println(studentEx2);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập lại dúng số import ra : ");
                    break;
            }
        }
    }

    private void loadMenuEx2() {
        System.out.println("--- Question 6 7: ");
        System.out.println("--- 1. Tạo danh sách sinh viên ");
        System.out.println("--- 2. Sắp xếp danh sách theo name ");
        System.out.println("--- 3.Exit ");
    }
}
