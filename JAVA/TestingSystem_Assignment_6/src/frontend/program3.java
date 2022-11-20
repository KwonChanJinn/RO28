package frontend;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào phần tử muốn tìm : ");
        int check = scanner.nextInt();
        try {
            System.out.println("số thứ :" + numbers[check]);
        }
        catch (Exception ex)  {
            System.out.println("Không có phần tử nào hết ??");
        }
        finally {
            System.out.println("Đã làm xong câu 3 ");
        }
    }
}
