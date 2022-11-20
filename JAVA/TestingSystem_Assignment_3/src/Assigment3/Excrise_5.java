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
        System.out.println("=============bài này dùng 2 cách 1 là if else 2 là toán tử tenarr=============");
        excrise5.Question_4();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 3=============");
        excrise5.Question_5();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 4 và 5 truyền vào tham số cho nó =============");
        excrise5.Question_4_1(department1);
        excrise5.Question_5_1(department1, department2);

        System.out.println("=============Excrise5 - Question 6=============");
        excrise5.Question_6();
        System.out.println("");

        System.out.println("=============Excrise5 - Question 6 cách 2 ============");
        excrise5.Question_6_1(departments);
        System.out.println("");
        System.out.println("=============Excrise5 - Question 7=============");
        excrise5.Question_7();
        System.out.println("Câu này giông câu 6 nên ko làm lại ");
    }


    public void Question_1() {
        //Exercise 5: Object’s Method
        //Question 1:
        //In ra thông tin của phòng ban thứ 1 (sử dụng toString())
        Position p = new Position((byte) 1, EnumTypeQuestion.EnumPosition.PM);
        System.out.println(p);


    }

    public void Question_2() {
        //Question 2:
        //In ra thông tin của tất cả phòng ban (sử dụng toString())
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
        //In ra địa chỉ của phòng ban thứ 1
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

        if (department1.departmentName == " Phòng A") {
            System.out.println("Đây là phòng ban A");
        } else {
            System.out.println("Đây không phải là phòng ban A");
        }


        // sử dụng toán tử 3 ngôi tenary làm bài nhá
        String checkname = department1.departmentName;
        System.out.println((checkname == " Phòng A") ? "Đây là phòng ban A" : "Đây không phải phòng ban AA");

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
            System.out.println("Đây 2 phòng ban bằng nhau ");
        } else {
            System.out.println("Hai phòng ban này chả giống nhau cái gì hết á ");
        }

        // tương tự ta có thể sủ dụng toán tử 3 ngôi so sánh thôi

        System.out.println((departments[0].departmentName == departments[4].departmentName) ?
                "\"Đây 2 phòng ban bằng nhau \"" : "\"Hai phòng ban này chả giống nhau cái gì hết áaaaaaaaaaaaaaaaaaaaaaaaaaa \"");

    }

    public void Question_4_1(Department department) {

        if (department.departmentName.equals("Phòng A")) {
            System.out.println("Có tên là phòng A");
        } else {
            System.out.println("Không tên là phòng A");
        }
    }

    public void Question_5_1(Department department1, Department department2) {


        if (department1.departmentName.equals(department2.departmentName)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }
    }
    //Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
    //không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)

    public static void Question_6_1(Department[] departments) {

        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) > 1) {
                    //compareToIgnoreCase hàm sắp xếp theo mặc định
                    // hoán đổi sắp xếp
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

        //Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
        //sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
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
        department5.departmentName = "Tài Chính";

        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;
        // sap xep
        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = i + 1; j < departments.length; j++) {

                // hoặc sử dụng này
                //if (departments[i].departmentName.compareTo(departments[j].departmentName) > 1) {
                if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) > 1) {
                    //compareToIgnoreCase hàm sắp xếp theo mặc định
                    // hoán đổi sắp xếp
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
        //Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
        //sách phòng ban được sắp xếp theo tên
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


// câu này
    }
}
