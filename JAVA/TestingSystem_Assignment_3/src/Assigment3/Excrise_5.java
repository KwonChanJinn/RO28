package Assigment3;

import entity.Department;
import entity.EnumTypeQuestion;
import entity.Position;

public class Excrise_5 {

    public Department[] departments = new Department[5];

    {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;
    }


    public static void main(String[] args) {

        Excrise_5 excrise5 = new Excrise_5();
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        System.out.println("=============Excrise5 - Question 1=============");
        excrise5.Question_1();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 2=============");
        excrise5.Question_2();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 3=============");
        excrise5.Question_3();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 3=============");
        System.out.println("=============b??i n??y d??ng 2 c??ch 1 l?? if else 2 l?? to??n t??? tenarr=============");
        excrise5.Question_4();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 3=============");
        excrise5.Question_5();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 4 v?? 5 truy???n v??o tham s??? cho n?? =============");
        excrise5.Question_4_1(department1);
        excrise5.Question_5_1(department1, department2);

        System.out.println("=============Excrise5 - Question 6=============");
        excrise5.Question_6();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 6 c??ch 2 ============");
        excrise5.Question_6_1(departments);
        System.out.println("");
        System.out.println("=============Excrise5 - Question 7=============");
        excrise5.Question_7();
        System.out.println("C??u n??y gi??ng c??u 6 n??n ko l??m l???i ");
    }


    public void Question_1() {
        //Exercise 5: Object???s Method
        //Question 1:
        //In ra th??ng tin c???a ph??ng ban th??? 1 (s??? d???ng toString())
        Position p = new Position((byte) 1, EnumTypeQuestion.EnumPosition.PM);
        System.out.println(p);


    }

    public void Question_2() {
        //Question 2:
        //In ra th??ng tin c???a t???t c??? ph??ng ban (s??? d???ng toString())
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        for (int i = 0; i < departments.length - 1; i++) {
            System.out.println(departments[i]);
        }

    }

    public void Question_3() {
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        //Question 3:
        //In ra ?????a ch??? c???a ph??ng ban th??? 1
        System.out.println(department1.hashCode());
    }

    public void Question_4() {
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Accounting";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        if (department1.departmentName == " Ph??ng A") {
            System.out.println("????y l?? ph??ng ban A");
        } else {
            System.out.println("????y kh??ng ph???i l?? ph??ng ban A");
        }


        // s??? d???ng to??n t??? 3 ng??i tenary l??m b??i nh??
        String checkname = department1.departmentName;
        System.out.println((checkname == " Ph??ng A") ? "????y l?? ph??ng ban A" : "????y kh??ng ph???i ph??ng ban AA");

    }

    public void Question_5() {
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Boss of director";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waiting room";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "Sale";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        if (departments[0].departmentName == departments[4].departmentName) {
            System.out.println("????y 2 ph??ng ban b???ng nhau ");
        } else {
            System.out.println("Hai ph??ng ban n??y ch??? gi???ng nhau c??i g?? h???t ?? ");
        }

        // t????ng t??? ta c?? th??? s??? d???ng to??n t??? 3 ng??i so s??nh th??i

        System.out.println((departments[0].departmentName == departments[4].departmentName) ?
                "\"????y 2 ph??ng ban b???ng nhau \"" : "\"Hai ph??ng ban n??y ch??? gi???ng nhau c??i g?? h???t ??aaaaaaaaaaaaaaaaaaaaaaaaaa \"");

    }

    public void Question_4_1(Department department) {

        if (department.departmentName.equals("Ph??ng A")) {
            System.out.println("C?? t??n l?? ph??ng A");
        } else {
            System.out.println("Kh??ng t??n l?? ph??ng A");
        }
    }

    public void Question_5_1(Department department1, Department department2) {


        if (department1.departmentName.equals(department2.departmentName)) {
            System.out.println("C?? b???ng nhau !");
        } else {
            System.out.println("Kh??ng b???ng nhau !");
        }
    }
    //Question 5: So s??nh 2 ph??ng ban th??? 1 v?? ph??ng ban th??? 2 xem c?? b???ng nhau
    //kh??ng (b???ng nhau khi t??n c???a 2 ph??ng ban ???? b???ng nhau)

    public static void Question_6_1(Department[] departments) {

        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) > 1) {
                    //compareToIgnoreCase h??m s???p x???p theo m???c ?????nh
                    // ho??n ?????i s???p x???p
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        //in ra
        for (Department de : departments) {
            System.out.println(de.departmentName);
        }
    }

    public void Question_6() {

        //Question 6: Kh???i t???o 1 array ph??ng ban g???m 5 ph??ng ban, sau ???? in ra danh
        //s??ch ph??ng ban theo th??? t??? t??ng d???n theo t??n (s???p x???p theo v???n ABCD)
        //VD:
        //Accounting
        //Boss of director
        //Marketing
        //Sale
        //Waiting room
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Bossofdirector";
        Department department4 = new Department();
        department4.departmentId = 4;
        department4.departmentName = "Waitingroom";
        Department department5 = new Department();
        department5.departmentId = 5;
        department5.departmentName = "T??i Ch??nh";

        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;
        // sap xep
        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {

                // ho???c s??? d???ng n??y
                //if (departments[i].departmentName.compareTo(departments[j].departmentName) > 1) {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) > 1) {
                    //compareToIgnoreCase h??m s???p x???p theo m???c ?????nh
                    // ho??n ?????i s???p x???p
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        //in ra
        for (Department de : departments) {
            System.out.println(de.departmentName);
        }
    }

    public void Question_7() {
        //Question 7: Kh???i t???o 1 array h???c sinh g???m 5 Ph??ng ban, sau ???? in ra danh
        //s??ch ph??ng ban ???????c s???p x???p theo t??n
        //VD:
        //Accounting
        //Boss of director
        //Marketing
        //waiting room
        Position position = new Position();
        position.positionId = 1;
        position.PositionName = EnumTypeQuestion.EnumPosition.PM;
        Position position1 = new Position();
        position1.positionId = 2;
        position1.PositionName = EnumTypeQuestion.EnumPosition.SCRUM_MASTER;
        Position position2 = new Position();
        position2.positionId = 3;
        position2.PositionName = EnumTypeQuestion.EnumPosition.DEV;
        Position position3 = new Position();
        position3.positionId = 4;
        position3.PositionName = EnumTypeQuestion.EnumPosition.TEST;
        Position position4 = new Position();
        position4.positionId = 5;
        position4.PositionName = EnumTypeQuestion.EnumPosition.SCRUM_MASTER;


        Position[] positions = new Position[10];
        positions[0] = position;
        positions[1] = position1;
        positions[2] = position2;
        positions[3] = position3;
        positions[4] = position4;


// c??u n??y
    }
}
