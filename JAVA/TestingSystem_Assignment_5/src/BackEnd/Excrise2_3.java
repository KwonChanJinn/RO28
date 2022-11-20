package BackEnd;

import Entity.Square;

import java.util.Scanner;

public class Excrise2_3 {
    private Square sq;
    private Scanner sc;

    public Excrise2_3() {
        sc = new Scanner(System.in);
    }

    public void question1() {
        while (true) {
            System.out.println("=======================================================================");

            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
            System.out.println("=== 1. Nhập chiều dài chiều rộng . ===");
            System.out.println("=== 2. Tính chu vi hình vuông. ===");
            System.out.println("=== 3. Tính diện tích hình vuông. ===");
            System.out.println("=== 4. Exit. ===");
            System.out.println("=======================================================================");

            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    System.out.println("Nhập vào cạnh của hình vuông: ");
                    Float a = sc.nextFloat();
                    sq = new Square(a);
                    System.out.println(" tạo thành công hình vuông có cạnh " + a);
                    break;
                case 2:
                    System.out.println("Chu vi  hình vuông là: " + sq.Tinhchuvi() );
                    break;
                case 3:
                    System.out.println("Diện tích  hình vuông là: " + sq.Tinhdientich());
                    break;
                case 4:
                    return;
                default:
                    System.out.println(" chọn đúng số trên menu");
                    break;
            }
        }
    }
}
