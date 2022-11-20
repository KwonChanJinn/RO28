package Entity;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private int gradeAvg;
    private String email;

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("ID: ");
        this.id = sc.nextInt();
        System.out.println("GradeAvg: ");
        this.gradeAvg = sc.nextInt();
        System.out.println("email: ");
        this.email = sc.next();

    }


    public int hocbong() {

        while (true) {
            if (this.gradeAvg < 8) {
                System.out.println("không Đạt học bổng ");
                break;
            } else {
                System.out.println("Đạt học bổng nè ");
                break;
            }
        }
        return (0);
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " id= " + id + ", gradeAvg=" + gradeAvg

                + ", email=" + email + "]";

    }
}
