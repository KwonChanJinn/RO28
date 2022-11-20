package BackEnd;

import Entity.Phone;
import Entity.Smartphone;
import Entity.Vintagephone;

import java.util.Scanner;

public class Excrise2_5 {
    private Phone phone = new Phone();
    private Smartphone smartphone = new Smartphone();
    private Vintagephone vintagephone = new Vintagephone();

    public void question(){
        menu();
    }
    public void menu() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            Excrise2_5 excrise2_5 = new Excrise2_5();
            System.out.println("************** Hiển thị thông tin điện thoại ***************");
            System.out.println("============================================================");
            System.out.println("============== 1  Thông tin chung điện thoại================");
            System.out.println("============== 2  Thông tin điện thoại thông minh ==========");
            System.out.println("============== 3  Thông tin điện thoại cổ điển =============");
            System.out.println("============== 4  Thoát chương trình  ======================");
            System.out.println("============================================================");

            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    excrise2_5.phone();
                    break;
                case 2:
                    excrise2_5.Smartphone();
                    break;
                case 3:
                    excrise2_5.Vintagephone();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập đúng thông tin cần hiển thị nhé ");
                    break;
            }
        }

    }


    public void phone() {
        phone.goi();
        phone.guitinnhan();
        phone.nhantinnhan();
        phone.tanCongkexau();
    }

    public void Smartphone() {
        smartphone.goi();
        smartphone.nghe();
        smartphone.guitinnhan();
        smartphone.nhantinnhan();
        smartphone.sudung3G();
        smartphone.tanCongkexau();
        smartphone.chuphinh();
    }

    public void Vintagephone() {
        vintagephone.goi();
        vintagephone.guitinnhan();
        vintagephone.nhantinnhan();
        vintagephone.tanCongkexau();
        vintagephone.ngheradion();
    }

}
