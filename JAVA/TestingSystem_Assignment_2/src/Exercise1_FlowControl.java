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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

//        Question 1:
//        Ki???m tra account th??? 2
//        N???u kh??ng c?? ph??ng ban (t???c l?? department == null) th?? s??? in ra text
//        "Nh??n vi??n n??y ch??a c?? ph??ng ban"
//        N???u kh??ng th?? s??? in ra text "Ph??ng ban c???a nh??n vi??n n??y l?? ..."
        System.out.println("");
        System.out.println("------------------------Question 1-----------------------");
        System.out.println("");


        if (ac2.Department == null) {
            System.out.println("Nh??n vi??n n??y ch??a c?? ph??ng ban.");
        } else {
            System.out.println("Ph??ng ban c???a nv n??y l??: " + ac2.Department.departmentName);
        }

    }
    private static void Question_2(){
        //        Question 2:
//        Ki???m tra account th??? 2
//        N???u kh??ng c?? group th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? group"
//        N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra text "Group c???a nh??n vi??n
//        n??y l?? Java Fresher, C# Fresher"
//        N???u c?? m???t trong 3 Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i
//        quan tr???ng, tham gia nhi???u group"
//        N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l??
//        ng?????i h??ng chuy???n, tham gia t???t c??? c??c group"
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


        System.out.println("------------------------Question 2-----------------------");
        System.out.println("");

        if (ac2.groups == null) {
            System.out.println("Nh??n vi??n n??y ch??a c?? group");
        } else {
            int countGroup = ac2.groups.length;

            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
            }
            if (countGroup == 3) {
                System.out.println("Nh??n vi??n n??y l?? ng?????i quan , tham gia nhi???u group");

            }
            if (countGroup >= 4) {
                System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
            }
        }


    }
    private static void Question_3(){
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //        Question 3:
//        S??? d???ng to??n t??? ternary ????? l??m Question 1
        System.out.println("");
        System.out.println("----------------------Question 3-------------------------");
        System.out.println("");

        if (ac2.Department == null) {
            System.out.println("Nh??n vi??n n??y ch??a c?? ph??ng ban.");
        } else {
            System.out.println("Ph??ng ban c???a nv n??y l??: " + ac2.Department.departmentName);
        }


        System.out.println(ac2.Department == null ? "Nh??n vi??n n??y ch??a c?? ph??ng ban " : "Ph??ng c???a nh??n vi??n n??y l??: " + ac2.Department.departmentName);


    }
    private static void Question_4(){
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        S??? d???ng to??n t??? ternary ????? l??m y??u c???u sau:
//        Ki???m tra Position c???a account th??? 1
//        N???u Position = Dev th?? in ra text "????y l?? Developer"
//        N???u kh??ng ph???i th?? in ra text "Ng?????i n??y kh??ng ph???i l?? Developer"
        System.out.println("");
        System.out.println("----------------------Question 4------------------------");
        System.out.println("");

        System.out.println(pos1.PositionName == EnumPosition.DEV ? "????y l?? Developer" : "Ng?????i n??y kh??ng ph???i l?? Developer " + " Ng?????i n??y l?? " + pos1.PositionName);

    }
    private static void Question_5(){

        //    SWITCH CASE
//    Question 5:
//    L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau:
//    N???u s??? l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n"
//    N???u s??? l?????ng account = 2 th?? in ra "Nh??m c?? hai th??nh vi??n"
//    N???u s??? l?????ng account = 3 th?? in ra "Nh??m c?? ba th??nh vi??n"
//    C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n"
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
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
                System.out.println("Nh??m c?? m???t th??nh vi??n");
                break;
            case 2:
                System.out.println("Nh??m c?? hai th??nh vi??n");
                break;
            case 3:
                System.out.println("Nh??m c?? ba th??nh vi??n");
                break;
        }

    }
    private static void Question_6(){

//    Question 6:
//    S??? d???ng switch case ????? l??m l???i Question 2
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        int countGroup = ac2.groups.length    ;
//
//        if (countGroup == 1 || countGroup == 2) {
//            System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
//        }
//        if (countGroup == 3) {
//            System.out.println("Nh??n vi??n n??y l?? ng?????i quan , tham gia nhi???u group");
//
//        }
//        if (countGroup >= 4) {
//            System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
//        }
//    } System.out.println("");
        System.out.println("");
        System.out.println("-----------------------Question 6------------------------");
        System.out.println("");

        int countGroup = ac2.groups.length;

        switch (countGroup) {
            case 1:
                System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("Nh??n vi??n n??y l?? ng?????i quan , tham gia nhi???u group");
                break;
            case 3:
                System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
                break;
        }

    }

    private static void Question_7() {

        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//    Question 7:
//    S??? d???ng switch case ????? l??m l???i Question 4


//        System.out.println(pos1.PositionName == EnumPosition.DEV ? "????y l?? Developer" :
//                "Ng?????i n??y kh??ng ph???i l?? Developer "+" Ng?????i n??y l?? "+pos1.PositionName );
        System.out.println("");
        System.out.println("-----------------------Question 7------------------------");
        System.out.println("");


        Account account1 = new Account();
        account1.accountId = 1;
        account1.PositionName = EnumPosition.DEV;
        switch (account1.PositionName) {
            case DEV:
                System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
                break;

        }

//        String positionName = ac1.PositionName.toString();
//        switch (positionName) {
//            case "Dev":
//                System.out.println("????y l?? Developer");
//                break;
//            default:
//                System.out.println("Ng?????i n??y kh??ng ph???i l?? Developer");
//        }



    }

    private static void Question_8() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


//        FOREACH
//        Question 8:
//        In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h???
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //        Question 9:
//        In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 10:
        //In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
        //h??? theo ?????nh d???ng nh?? sau:
        //Th??ng tin account th??? 1 l??:
        //Email: NguyenVanA@gmail.com
        //Full name: Nguy???n V??n A
        //Ph??ng ban: Sale
        //Th??ng tin account th??? 2 l??:
        //Email: NguyenVanB@gmail.com
        //Full name: Nguy???n V??n B
        //Ph??ng ban: Marketting
        System.out.println("");
        System.out.println("---------------------- Question 10 -------------------------");
        System.out.println("");

        Account[] accArray1 = {ac1, ac2};
        for (int i = 0; i < accArray1.length; i++) {
            System.out.println("Th??ng tin account th??? " + (i + 1) + " l??:");

            System.out.println("Email: " + accArray1[i].email);
            System.out.println("Full name: " + accArray1[i].fullName);
            System.out.println("Ph??ng ban: " + accArray1[i].Department.departmentName);

        }

    }

    private static void Question_11() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        // Question 11:
        //In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau:
        //Th??ng tin department th??? 1 l??:
        //Id: 1
        //Name: Sale
        //Th??ng tin department th??? 2 l??:
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 12:
        //Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10
        System.out.println("");
        System.out.println("---------------------- Question 12-------------------------");
        System.out.println("");


        Account[] accArray2 = {ac1, ac2};
        for (int i = 0; i < 2; i++) {
            System.out.println("Th??ng tin account th??? " + (i + 1) + " l??:");

            System.out.println("Email: " + accArray2[i].email);
            System.out.println("Full name: " + accArray2[i].fullName);
            System.out.println("Ph??ng ban: " + accArray2[i].Department.departmentName);

        }

    }

    private static void Question_13() {
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 13:
        //In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 14:
        //In ra th??ng tin t???t c??? c??c account c?? id < 4
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //Question 15:
        //In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //WHILE
        //Question 16:
        //L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng WHILE k???t h???p v???i
        //l???nh break, continue
        System.out.println("");
        System.out.println("---------------------Question 16-1 ---------------------------");
        System.out.println("");

        Account[] accArray1 = {ac1, ac2, ac3};
        int y = 0;
        while (y < accArray1.length) {
            System.out.println("Th??ng tin account th??? " + (y + 1) + " l??:");

            System.out.println("Email: " + accArray1[y].email);
            System.out.println("Full name: " + accArray1[y].fullName);
            System.out.println("Ph??ng ban: " + accArray1[y].Department.departmentName);
            y++;
        }
        System.out.println("");
        System.out.println("---------------------Question 16-2 ---------------------------");
        System.out.println("");

        Department[] depArray1 = {dep1, dep2, dep3};
        int j = 0;
        while (j < depArray1.length) {
            System.out.println("Th??ng tin department th??? " + (j + 1) + " l??:");
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
            System.out.println("Th??ng tin department th??? " + (l + 1) + " l??:");

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
                System.out.println("Th??ng tin account th??? " + (k + 1) + " l??:");

                System.out.println("Email: " + accArray2[k].email);
                System.out.println("Full name: " + accArray2[k].fullName);

                System.out.println("Ph??ng ban: " + accArray2[k].Department.departmentName);
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
                System.out.println("Th??ng tin account th??? " + (j1 + 1) + " l??:");
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
        dep1.departmentName = "K??? To??n";

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Nh??n S???";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "H??nh Ch??nh";

        Department dep4 = new Department();
        dep4.departmentId = 4;
        dep4.departmentName = "Ch??m S??c KH";

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

        // khai b??o group

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

        // khai b??o Account

        Account ac1 = new Account();
        ac1.accountId = 1;
        ac1.email = "email1@gmail.com";
        ac1.username = " username1 ";
        ac1.fullName = "Tr???n Thanh Song 111111";
        ac1.position = pos1;
        ac1.Department = dep1;
        ac1.PositionId = pos1;
        ac1.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Tr???n Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Tr???n Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new java.sql.Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};

        //DO-WHILE
        //Question 17:
        //L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng DO-WHILE k???t h???p v???i
        //l???nh break, continue
        System.out.println("");
        System.out.println("---------------------Question 17-1 ---------------------------");
        System.out.println("");

        Account[] accArray171 = {ac1, ac2, ac3};
        int i171 = 0;
        do {
            System.out.println("Th??ng tin account th??? " + (i171 + 1) + " l??:");

            System.out.println("Email: " + accArray171[i171].email);
            System.out.println("Full name: " + accArray171[i171].fullName);
            System.out.println("Ph??ng ban: " + accArray171[i171].Department.departmentName);
            i171++;
        }
        while (i171 < accArray171.length);

        System.out.println("");
        System.out.println("---------------------Question 17-2 ---------------------------");
        System.out.println("");

        Department[] depArray172 = {dep1, dep2, dep3};
        int i172 = 0;
        do {
            System.out.println("Th??ng tin department th??? " + (i172 + 1) + " l??:");

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
            System.out.println("Th??ng tin department th??? " + (i173 + 1) +

                    " l??:");
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
                System.out.println("Th??ng tin account th??? " + (i174 + 1) + " l??:");
                System.out.println("Email: " + depArray174[i174].email);
                System.out.println("Full name: " + depArray174[i174].fullName);
                System.out.println("Ph??ng ban: " + depArray174[i174].Department.departmentName);
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
                System.out.println("Th??ng tin account th??? " + (i175 + 1) + " l??:");
                System.out.println("Email: " + depArray175[i175].email);
                System.out.println("Full name: " + depArray175[i175].fullName);
                System.out.println("Ph??ng ban: " + depArray175[i175].Department.departmentName);
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
        System.out.println("---------------------H???t EX 1 nh??? --------------------------");
        System.out.println("");


    }


}
