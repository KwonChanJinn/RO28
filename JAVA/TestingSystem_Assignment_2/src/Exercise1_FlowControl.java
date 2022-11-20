public class Exercise1_FlowControl {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("---------------------Question 1  ---------------------------");
        System.out.println("");
        Question_1();
        System.out.println("");
        System.out.println("---------------------Question 2  ---------------------------");
        System.out.println("");
        Question_2();
        System.out.println("");
        System.out.println("---------------------Question 3  ---------------------------");
        System.out.println("");
        Question_3();
        System.out.println("");
        System.out.println("---------------------Question 4  ---------------------------");
        System.out.println("");
        Question_4();
        System.out.println("");
        System.out.println("---------------------Question 5  ---------------------------");
        System.out.println("");
        Question_5();
        System.out.println("");
        System.out.println("---------------------Question 6  ---------------------------");
        System.out.println("");
        Question_6();
        System.out.println("");
        System.out.println("---------------------Question 7  ---------------------------");
        System.out.println("");
        Question_7();
        System.out.println("");
        System.out.println("---------------------Question 8  ---------------------------");
        System.out.println("");
        Question_8();
        System.out.println("");
        System.out.println("---------------------Question 9  ---------------------------");
        System.out.println("");
        Question_9();
        System.out.println("");
        System.out.println("---------------------Question 10  ---------------------------");
        System.out.println("");
        Question_10();
        System.out.println("");
        System.out.println("---------------------Question 11  ---------------------------");
        System.out.println("");
        Question_11();
        System.out.println("");
        System.out.println("---------------------Question 12  ---------------------------");
        System.out.println("");
        Question_12();
        System.out.println("");
        System.out.println("---------------------Question 13  ---------------------------");
        System.out.println("");
        Question_13();
        System.out.println("");
        System.out.println("---------------------Question 14  ---------------------------");
        System.out.println("");
        Question_14();
        System.out.println("");
        System.out.println("---------------------Question 15 ---------------------------");
        System.out.println("");
        Question_15();
        System.out.println("");
        System.out.println("---------------------Question 16 ---------------------------");
        System.out.println("");
        Question_16();
        System.out.println("");
        System.out.println("---------------------Question 17  ---------------------------");
        System.out.println("");
        Question_17();
    }


    private static void Question_1(){

        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

//        Question 1:
//        Kiểm tra account thứ 2
//        Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//        "Nhân viên này chưa có phòng ban"
//        Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
        System.out.println("");
        System.out.println("------------------------Question 1-----------------------");
        System.out.println("");


        if (ac2.Department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + ac2.Department.departmentName);
        }

    }
    private static void Question_2(){
        //        Question 2:
//        Kiểm tra account thứ 2
//        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//        này là Java Fresher, C# Fresher"
//        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//        quan trọng, tham gia nhiều group"
//        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//        người hóng chuyện, tham gia tất cả các group"
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


        System.out.println("------------------------Question 2-----------------------");
        System.out.println("");

        if (ac2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = ac2.groups.length;

            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (countGroup == 3) {
                System.out.println("Nhân viên này là người quan , tham gia nhiều group");

            }
            if (countGroup >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }


    }
    private static void Question_3(){
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //        Question 3:
//        Sử dụng toán tử ternary để làm Question 1
        System.out.println("");
        System.out.println("----------------------Question 3-------------------------");
        System.out.println("");

        if (ac2.Department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + ac2.Department.departmentName);
        }


        System.out.println(ac2.Department == null ? "Nhân viên này chưa có phòng ban " : "Phòng của nhân viên này là: " + ac2.Department.departmentName);


    }
    private static void Question_4(){
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        Sử dụng toán tử ternary để làm yêu cầu sau:
//        Kiểm tra Position của account thứ 1
//        Nếu Position = Dev thì in ra text "Đây là Developer"
//        Nếu không phải thì in ra text "Người này không phải là Developer"
        System.out.println("");
        System.out.println("----------------------Question 4------------------------");
        System.out.println("");

        System.out.println(pos1.PositionName == EnumPosition.DEV ? "Đây là Developer" : "Người này không phải là Developer " + " Người này là " + pos1.PositionName);

    }
    private static void Question_5(){

        //    SWITCH CASE
//    Question 5:
//    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//    Còn lại in ra "Nhóm có nhiều thành viên"
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


        System.out.println("");
        System.out.println("----------------------Question 5-------------------------");
        System.out.println("");

        int countaccount = ac1.groups.length;

        switch (countaccount) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
        }

    }
    private static void Question_6(){

//    Question 6:
//    Sử dụng switch case để làm lại Question 2
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        int countGroup = ac2.groups.length    ;
//
//        if (countGroup == 1 || countGroup == 2) {
//            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//        }
//        if (countGroup == 3) {
//            System.out.println("Nhân viên này là người quan , tham gia nhiều group");
//
//        }
//        if (countGroup >= 4) {
//            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//        }
//    } System.out.println("");
        System.out.println("");
        System.out.println("-----------------------Question 6------------------------");
        System.out.println("");

        int countGroup = ac2.groups.length;

        switch (countGroup) {
            case 1:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("Nhân viên này là người quan , tham gia nhiều group");
                break;
            case 3:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }

    }

    private static void Question_7() {

        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//    Question 7:
//    Sử dụng switch case để làm lại Question 4


//        System.out.println(pos1.PositionName == EnumPosition.DEV ? "Đây là Developer" :
//                "Người này không phải là Developer "+" Người này là "+pos1.PositionName );
        System.out.println("");
        System.out.println("-----------------------Question 7------------------------");
        System.out.println("");


        Account account1 = new Account();
        account1.accountId = 1;
        account1.PositionName = EnumPosition.DEV;
        switch (account1.PositionName) {
            case DEV:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;

        }

//        String positionName = ac1.PositionName.toString();
//        switch (positionName) {
//            case "Dev":
//                System.out.println("Đây là Developer");
//                break;
//            default:
//                System.out.println("Người này không phải là Developer");
//        }



    }

    private static void Question_8() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        FOREACH
//        Question 8:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
        System.out.println("");
        System.out.println("----------------------Question 8-------------------------");
        System.out.println("");

        Account[] accArray = {ac1, ac2, ac3};
        for (Account account : accArray) {
            System.out.println("AccountID: " + account.accountId +
                    " Email: " + account.email +
                    " Name: " + account.fullName);

        }

    }

    private static void Question_9() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //        Question 9:
//        In ra thông tin các phòng ban bao gồm: id và name
        System.out.println("");
        System.out.println("--------------------Question 9--------------------------");
        System.out.println("");
        Department[] depArray = {dep1, dep2, dep3,dep4};
        for (Department department : depArray) {
            System.out.println("DepID: " + department.departmentId + " Name: " + department.departmentName);

        }


    }

    private static void Question_10() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 10:
        //In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
        //họ theo định dạng như sau:
        //Thông tin account thứ 1 là:
        //Email: NguyenVanA@gmail.com
        //Full name: Nguyễn Văn A
        //Phòng ban: Sale
        //Thông tin account thứ 2 là:
        //Email: NguyenVanB@gmail.com
        //Full name: Nguyễn Văn B
        //Phòng ban: Marketting
        System.out.println("");
        System.out.println("---------------------- Question 10 -------------------------");
        System.out.println("");

        Account[] accArray1 = {ac1, ac2};
        for (int i = 0; i < accArray1.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");

            System.out.println("Email: " + accArray1[i].email);
            System.out.println("Full name: " + accArray1[i].fullName);
            System.out.println("Phòng ban: " + accArray1[i].Department.departmentName);

        }

    }

    private static void Question_11() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        // Question 11:
        //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
        //Thông tin department thứ 1 là:
        //Id: 1
        //Name: Sale
        //Thông tin department thứ 2 là:
        //Id: 2
        //Name: Marketing
        System.out.println("");
        System.out.println("---------------------- Question 11-------------------------");
        System.out.println("");

        Department[] PositionArray = {dep1, dep2, dep3, dep4};
        for (int i = 0; i < PositionArray.length; i++) {
            System.out.println("ID   :" + PositionArray[i].departmentId);
            System.out.println("Name : " + PositionArray[i].departmentName);
        }


    }

    private static void Question_12() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 12:
        //Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        System.out.println("");
        System.out.println("---------------------- Question 12-------------------------");
        System.out.println("");


        Account[] accArray2 = {ac1, ac2};
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");

            System.out.println("Email: " + accArray2[i].email);
            System.out.println("Full name: " + accArray2[i].fullName);
            System.out.println("Phòng ban: " + accArray2[i].Department.departmentName);

        }

    }

    private static void Question_13() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 13:
        //In ra thông tin tất cả các account ngoại trừ account thứ 2
        System.out.println("");
        System.out.println("---------------------Question 13--------------------------");
        System.out.println("");

        Account[] accountarray1 = {ac1, ac2, ac3};
        for (int i = 0; i < accountarray1.length; i++) {
            if (accountarray1[i].accountId != 2) {
                System.out.println("Acc" + accountarray1[i].accountId);
                System.out.println("Email" + accountarray1[i].email);
                System.out.println("Fullname" + accountarray1[i].fullName);
                System.out.println("Department" + accountarray1[i].Department.departmentName);
            }

        }

    }

    private static void Question_14() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 14:
        //In ra thông tin tất cả các account có id < 4
        System.out.println("");
        System.out.println("---------------------Question 14--------------------------");
        System.out.println("");

        Account[] accountarray = {ac1, ac2, ac3};
        for (int i = 0; i < accountarray.length; i++) {
            if (accountarray[i].accountId < 4) {
                System.out.println("Acc" + accountarray[i].accountId);
                System.out.println("Email" + accountarray[i].email);
                System.out.println("Fullname" + accountarray[i].fullName);
                System.out.println("Department" + accountarray[i].Department.departmentName);
            }

        }

    }

    private static void Question_15() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 15:
        //In ra các số chẵn nhỏ hơn hoặc bằng 20
        System.out.println("");
        System.out.println("---------------------Question 15--------------------------");
        System.out.println("-------------IF - ELSE -----------------------");
        System.out.println("");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print("  " + i);
            }
        }
        System.out.println("");
    }

    private static void Question_16() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //WHILE
        //Question 16:
        //Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
        //lệnh break, continue
        System.out.println("");
        System.out.println("---------------------Question 16-1 ---------------------------");
        System.out.println("");

        Account[] accArray1 = {ac1, ac2, ac3};
        int y = 0;
        while (y < accArray1.length) {
            System.out.println("Thông tin account thứ " + (y + 1) + " là:");

            System.out.println("Email: " + accArray1[y].email);
            System.out.println("Full name: " + accArray1[y].fullName);
            System.out.println("Phòng ban: " + accArray1[y].Department.departmentName);
            y++;
        }
        System.out.println("");
        System.out.println("---------------------Question 16-2 ---------------------------");
        System.out.println("");

        Department[] depArray1 = {dep1, dep2, dep3};
        int j = 0;
        while (j < depArray1.length) {
            System.out.println("Thông tin department thứ " + (j + 1) + " là:");
            System.out.println("Id: " + depArray1[j].departmentId);
            System.out.println("Name: " + depArray1[j].departmentName);
            j++;
        }
        System.out.println("");
        System.out.println("---------------------Question 16-3 ---------------------------");
        System.out.println("");

        Department[] depArray2 = {dep1, dep2, dep3};
        int l = 0;
        while (l < 2) {
            System.out.println("Thông tin department thứ " + (l + 1) + " là:");

            System.out.println("Id: " + depArray2[l].departmentId);
            System.out.println("Name: " + depArray2[l].departmentName);
            l++;
        }

        System.out.println("");
        System.out.println("---------------------Question 16-4 ---------------------------");
        System.out.println("");

        Account[] accArray2 = {ac1, ac2, ac3};
        int k = 0;
        while (k < accArray2.length) {
            if (k != 1) {
                System.out.println("Thông tin account thứ " + (k + 1) + " là:");

                System.out.println("Email: " + accArray2[k].email);
                System.out.println("Full name: " + accArray2[k].fullName);

                System.out.println("Phòng ban: " + accArray2[k].Department.departmentName);
            }
            k++;
        }
        System.out.println("");
        System.out.println("---------------------Question 16-5 ---------------------------");
        System.out.println("");

        //System.out.println("---------------------Question 14--------------------------");
        //        Account[] accountarray = {ac1, ac2, ac3};
        //        for (int i = 0; i < accountarray.length; i++) {
        //            if (accountarray[i].accountId < 4) {
        //                System.out.println("Acc" + accountarray[i].accountId);
        //                System.out.println("Email" + accountarray[i].email);
        //                System.out.println("Fullname" + accountarray[i].fullName);
        //                System.out.println("Department" + accountarray[i].Department.departmentName);
        //            }
        //
        //        }

        Account[] accArray44 = {ac1, ac2, ac3};
        int j1 = 0;
        while (j1 < accArray44.length) {
            if (accArray44[j1].accountId < 4) {
                System.out.println("Thông tin account thứ " + (j1 + 1) + " là:");
                System.out.println("Acc" + accArray44[j1].accountId);
                System.out.println("Email" + accArray44[j1].email);
                System.out.println("Fullname" + accArray44[j1].fullName);
                System.out.println("Department" + accArray44[j1].Department.departmentName);
            }
            j1++;
        }
        System.out.println("");
        System.out.println("---------------------Question 16-6 ---------------------------");
        System.out.println("");

        int i9 = 1;
        while (i9 <= 20) {
            if (i9 % 2 == 0) {
                System.out.print(i9 + " ");
            }
            i9++;
        }


    }

    private static void Question_17() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "Kế Toán";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nhân Sự";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "Hành Chính";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Chăm Sóc KH";

        //Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.PositionName = EnumPosition.PM;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.PositionName = EnumPosition.DEV;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.PositionName = EnumPosition.TEST;

        Position pos4 = new Position();
        pos4.positionId = 4;
        pos4.PositionName = EnumPosition.SCRUM_MASTER;

        // khai báo group

        Group gr1 = new Group();
        gr1.groupId = 1;
        gr1.groupName = "Gr1";
        gr1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new java.sql.Date(2020 - 02 - 01);

        // GroupAccount group

        // khai báo Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Trần Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //DO-WHILE
        //Question 17:
        //Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
        //lệnh break, continue
        System.out.println("");
        System.out.println("---------------------Question 17-1 ---------------------------");
        System.out.println("");

        Account[] accArray171 = {ac1, ac2, ac3};
        int i171 = 0;
        do {
            System.out.println("Thông tin account thứ " + (i171 + 1) + " là:");

            System.out.println("Email: " + accArray171[i171].email);
            System.out.println("Full name: " + accArray171[i171].fullName);
            System.out.println("Phòng ban: " + accArray171[i171].Department.departmentName);
            i171++;
        }
        while (i171 < accArray171.length);

        System.out.println("");
        System.out.println("---------------------Question 17-2 ---------------------------");
        System.out.println("");

        Department[] depArray172 = {dep1, dep2, dep3};
        int i172 = 0;
        do {
            System.out.println("Thông tin department thứ " + (i172 + 1) + " là:");

            System.out.println("Id: " + depArray172[i172].departmentId);
            System.out.println("Name: " + depArray172[i172].departmentName);
            i172++;
        } while (i172 < depArray172.length);

        System.out.println("");
        System.out.println("---------------------Question 17-3 ---------------------------");
        System.out.println("");

        Department[] depArray173 = {dep1, dep2, dep3};
        int i173 = 0;
        do {
            System.out.println("Thông tin department thứ " + (i173 + 1) +

                    " là:");
            System.out.println("Id: " + depArray173[i173].departmentId);
            System.out.println("Name: " + depArray173[i173].departmentName);
            i173++;
        }
        while (i173 < 2);

        System.out.println("");
        System.out.println("---------------------Question 17-4 ---------------------------");
        System.out.println("");

        Account[] depArray174 = {ac1, ac2, ac3};
        int i174 = 0;
        do {
            if (i174 != 2) {
                System.out.println("Thông tin account thứ " + (i174 + 1) + " là:");
                System.out.println("Email: " + depArray174[i174].email);
                System.out.println("Full name: " + depArray174[i174].fullName);
                System.out.println("Phòng ban: " + depArray174[i174].Department.departmentName);
            }
            i174++;
        } while (i174 < depArray174.length);

        System.out.println("");
        System.out.println("---------------------Question 17-5 ---------------------------");
        System.out.println("");

        Account[] depArray175 = {ac1, ac2, ac3};
        int i175 = 0;
        do {
            if (depArray175[i175].accountId < 4) {
                System.out.println("Thông tin account thứ " + (i175 + 1) + " là:");
                System.out.println("Email: " + depArray175[i175].email);
                System.out.println("Full name: " + depArray175[i175].fullName);
                System.out.println("Phòng ban: " + depArray175[i175].Department.departmentName);
            }

            i175++;
        } while (i175 < depArray175.length);

        System.out.println("");
        System.out.println("---------------------Question 17-6 ---------------------------");
        System.out.println("");

        int i176 = 1;
        do {
            if (i176 % 2 == 0) {
                System.out.print(i176 + " ");
            }
            i176++;
        } while (i176 <= 20);


        System.out.println("");
        System.out.println("---------------------Hết EX 1 nhớ --------------------------");
        System.out.println("");


    }


}
