package BackEnd;

import Entity.Person;
import Entity.Student;

import java.util.Scanner;

public class Excrise2_2 {
    private Scanner sc;

    public Excrise2_2() {
        super();
        sc = new Scanner(System.in);
    }

    public void question2() {
        while (true) {
            System.out.println("=======================================================================");

            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");

            System.out.println("=== 1. Demo Person. ===");

            System.out.println("=== 2. Demo Stusent. ===");

            System.out.println("=== 3. Exit. ===");
            System.out.println("=======================================================================");

            int menuChoose = sc.nextInt();
            switch (menuChoose) {
                case 1:
                    demoPerson();
                    break;
                case 2:
                    demoStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println(" Lựa chọn đúng số trên menu");
                    break;
            }
        }
    }

    private void demoStudent() {

        Student st = new Student();
        st.inputInfo();
        System.out.println("Thông tin Student vừa nhập vào: ");
        System.out.println(st.showInfo());
        System.out.println(st.hocbong());
    }

    private void demoPerson() {
        Person person = new Person();
        person.inputInfo();
        System.out.println("Thông tin person vừa nhập vào: ");
        System.out.println(person.showInfo());
    }
}
