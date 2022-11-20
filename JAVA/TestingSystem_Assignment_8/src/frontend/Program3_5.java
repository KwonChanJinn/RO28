package frontend;

import backend.Excrise3_5;

import java.util.Scanner;

public class Program3_5 {
    private Scanner scanner = new Scanner(System.in);
    private   Excrise3_5 e = new Excrise3_5();
    public static void main(String[] args) {
        Program3_5 program3_5 = new Program3_5();
        program3_5.question();
    }

    public void question(){
        main();
    }
    public void main() {
        while (true) {
            System.out.println("*****************************Phần mềm quản lý Employee********************************");
            System.out.println("************************1 intEmployee ************************************************");
            System.out.println("************************2 doubleEmploye **********************************************");
            System.out.println("************************3 intEmployee ************************************************");
            System.out.println("************************4 Thoát chương trình *****************************************");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    e.intEmployee();
                    break;
                case 2:
                    e.doubleEmploye();
                    break;
                case 3:
                    e.intEmployee();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Chọn lại đúng chức năng của chương trình");
                    break;
            }
        }
    }
}
