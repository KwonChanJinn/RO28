package frontend;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        program4 p = new program4();
        System.out.println("Nhập phần tử muốn lấy ra màn hình nè : ");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        p.getIndex(check);
    }

    public void getIndex(int index) {
        String[] departments = {"A", "B", "C,", "D"};

        try {
            System.out.println("Thông tin phần tử thứ " + departments[index]);
        } catch (Exception e) {
            System.out.println("Cannot find department.");
        } finally {
            System.out.println("Đã làm xong bài tập 4");
        }
    }

}
