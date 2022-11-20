package backend;

import entity.*;

import java.time.LocalDate;

public class Excrise1 {

    public static void main(String[] args) {

        System.out.println(" Câu 1 ");

        Question_1();

        System.out.println(" Câu 2 ");

        Question_2();

        System.out.println(" Câu 3 ");

        Question_3();
    }

    /// câu 1
    public static void Question_1() {
        Department department = new Department();
        Department dep1 = new Department(1, "dep1");
        System.out.println(dep1);
        System.out.println(department);
    }

    /// câu 2
    public static void Question_2() {
        Department dep1 = new Department(1, "dep1");
        Account account = new Account();
        account.setDepartment(dep1);

        Account account1 = new Account(1, "thanhsong21082000", "username1", "trần thanh song nè ");

        account1.setDepartment(dep1);
        Account account2 = new Account(2, "kwonchanjin@gmail.com", "usernnam1", "Trần Kwon Jin", new Position(1, PositionName.TEST), LocalDate.now());
        account2.setDepartment(dep1);

        Position position = new Position();
        Department dep2 = new Department(1, "Kế Toán cho Sếppppp");

        Account account3 = new Account(3, "kwonchanjin@gmail.com", "usernnam1",
                "Trần Kwon Jin", dep1, position,
                LocalDate.of(2021, 03, 17));

        System.out.println(account);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);


    }

    // câu  3

    public static void Question_3() {
        Department dep1 = new Department();
        dep1.setDepartmentId(1);
        dep1.setDepartmentName("Kế Toán");
        Department dep2 = new Department();
        dep2.setDepartmentId(2);
        dep2.setDepartmentName("Nhân Sự");
        Department dep3 = new Department();
        dep3.setDepartmentId(3);
        dep3.setDepartmentName("Hành Chính");
        Department dep4 = new Department();
        dep4.setDepartmentId(4);
        dep4.setDepartmentName("Chăm Sóc KH");

        //Position
        Position pos1 = new Position();
        pos1.setId(1);
        pos1.setName(PositionName.PM);
        Position pos2 = new Position();
        pos2.setId(2);
        pos2.setName(PositionName.DEV);
        Position pos3 = new Position();
        pos3.setId(3);
        pos3.setName(PositionName.TEST);
        Position pos4 = new Position();
        pos4.setId(4);
        pos4.setName(PositionName.SCRUM_MASTER);


        Account ac1 = new Account();
        ac1.setId(1);
        ac1.setEmail("email1@gmail.com");
        ac1.setUserName(" username1 ");
        ac1.setFullName("Trần Thanh Song 111111");
        ac1.setDepartment(dep1);
        ac1.setPosition(pos1);
        ac1.setCreateDate(LocalDate.ofEpochDay(2020 - 2 - 1));

        Account ac2 = new Account();
        ac2.setId(2);
        ac2.setEmail("email2@gmail.com");
        ac2.setUserName(" username2 ");
        ac2.setFullName("Trần Thanh Song 111111");
        ac2.setDepartment(dep1);
        ac2.setPosition(pos1);
        ac2.setCreateDate(LocalDate.ofEpochDay(2020 - 2 - 1));

        Account[] accounts = {ac2, ac1, ac2};// danh sáchcác account

        Group group1 = new Group("Group1", ac1, LocalDate.of(2020, 12, 23), accounts);
        System.out.println(group1);
//
//        String song = "DDDDD";
//        String ngu = "VLLL";
//        String [] str1 = {song,ngu};
//
//        Group group2 = new Group(1,null,null,null,null,str1);
//        System.out.println(group2);
    }

}
