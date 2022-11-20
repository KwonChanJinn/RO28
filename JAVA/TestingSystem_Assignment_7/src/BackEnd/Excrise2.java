package BackEnd;

import Entity.MyMathex2;


import java.util.Scanner;

public  class Excrise2 {

    public void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính tổng số int với PI");
        System.out.println("Nhập vào a số int: ");
        int a = sc.nextInt();
        System.out.println("Tổng với PI là: " + MyMathex2.sum(a));

// System.out.println("Thực hiện thay đổi số PI = 3.15"); ==> Eclipsẽ báo lỗi
// MyMath.PI = 3.15;
    }

}
