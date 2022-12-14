import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Exercise5_Inputfromconsole {
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

    }
    private static void Question_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("M???i b???n nh???p v??o 3 s??? nguy??n");
        System.out.println("Nh???p v??o s??? th??? 1: ");
        int a = sc.nextInt();
        System.out.println("Nh???p v??o s??? th??? 2: ");
        int b = sc.nextInt();
        System.out.println("Nh???p v??o s??? th??? 3: ");
        int c = sc.nextInt();
        System.out.println("B???n v???a nh???p v??o c??c s???: " + a + " " + b + " " + c);
    }
    private static void Question_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("M???i b???n nh???p v??o 2 s??? th???c");
        System.out.println("Nh???p v??o s??? th??? 1: ");
        float f1 = sc.nextFloat();
        System.out.println("Nh???p v??o s??? th??? 2: ");
        float f2 = sc.nextFloat();
        System.out.println("IN ra MH: " + f1 + " " + f2);
    }
    private static void Question_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nh???p v??o H???: ");
        String str1 = sc.next();
        System.out.println("nh???p v??o T??n: ");
        String str2 = sc.next();
        System.out.println("Fullname :" + str1 + " " + str2);
    }
    private static void Question_4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nh???p v??o n??m sinh: ");
        int year = sc.nextInt();
        System.out.println("nh???p v??o th??ng sinh: ");
        int month = sc.nextInt();
        System.out.println("nh???p v??o ng??y sinh: ");
        int day = sc.nextInt();
        LocalDate dateBirth = LocalDate.of(year, month, day);
        System.out.println("Ng??y sinh c???a b???n : " + dateBirth);
    }

    private static void Question_5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("M???i b???n nh???p v??o th??ng tin account c??n t???o: ");

        Account acc = new Account();
        System.out.println("Nh???p ID: ");
        acc.accountId = sc.nextInt();
        System.out.println("Nh???p email: ");
        acc.email = sc.nextLine();
        System.out.println("Nh???p userName: ");
        acc.username = sc.nextLine();
        System.out.println("Nh???p fullName: ");
        acc.fullName = sc.nextLine();


        System.out.println("Nh???p c??c s??? t??? 1 ?????n 4 t????ng ???ng v???i:1.Dev, 2. Test, 3. Scrum_Master, 4. PM");
        int posNum ;
        posNum= sc.nextInt();
        switch (posNum) {
            case 1:
                Position pos1 = new Position();
                pos1.PositionName = EnumPosition.DEV;
                acc.position = pos1;
                break;
            case 2:
                Position pos2 = new Position();
                pos2.PositionName = EnumPosition.TEST;
                acc.position = pos2;
                break;
            case 3:
                Position pos3 = new Position();
                pos3.PositionName = EnumPosition.SCRUM_MASTER;
                acc.position = pos3;
                break;
            case 4:
                Position pos4 = new Position();
                pos4.PositionName = EnumPosition.PM;
                acc.position = pos4;
                break;
        }
        System.out.println("Th??ng tin Acc , ID: " + acc.accountId +
                " Email:" + acc.email +
                " UserName:" + acc.username +
                " FullName: " + acc.fullName +
                " Position:" + acc.position.PositionName);
    }

    private static void Question_6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("M???i b???n nh???p v??o th??ng tin Department c??n t???o: ");

        Department dep123 = new Department();
        System.out.println("Nh???p ID: ");
        dep123.departmentId = (byte) sc.nextInt();
        System.out.println("Nh???p Name: ");
        dep123.departmentName = sc.next();
        System.out.println("Th??ng tin Department v???a nh???p, ID: " + dep123.departmentId + " Name: " + dep123.departmentName);

    }
    private static void Question_7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("M???i b???n nh???p s??? v??o : ");
        int nhapso;
        nhapso = sc.nextInt();
        if (nhapso %2 == 0) {
            System.out.println("??ay l?? s??? ch???n");
        }
        else {
            System.out.println("????y l?? s??? l??? ");
        }

    }
    private static void Question_8(){
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("ch???n ch???c n??ng: 1. T???o Account, 2. T???o Department");

            choose = sc.nextInt();
            if (choose == 1 || choose == 2) {
                switch (choose) {
                    case 1:
                        Question_5();
                        break;
                    case 2:
                        Question_6();
                        break;
                }
                return;
            } else {
                System.out.println("Nh???p l???i: ");
            }
        }

    }
    private static void Question_9(){
        Scanner sc = new Scanner(System.in);
// T???o Group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Testing_System";
        group1.CreateDate = java.sql.Date.valueOf(LocalDate.of(2021, 1, 1));
        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "Development";
        group2.CreateDate = java.sql.Date.valueOf(LocalDate.of(2020, 2, 1));
        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Sale";
        group3.CreateDate = java.sql.Date.valueOf(LocalDate.of(2019, 9, 23));

// T???o Account

        Account acc1 = new Account();
        acc1.accountId = 1;
        acc1.email = "email1@gamil.com";
        acc1.username = "kwonchanjin";
        acc1.fullName = "fullnamkwon";
        acc1.createDate = LocalDate.now();
        Account acc2 = new Account();
        acc2.accountId = 2;
        acc2.email = "email1@gamil.com";
        acc2.username = "chanjinkwon";
        acc2.fullName = "fullname2333";
        acc2.createDate = LocalDate.of(2022, 5, 12);
        Account acc3 = new Account();
        acc3.accountId = 3;
        acc3.email = "email1@gamil.com";
        acc3.username = "kwonchanjinnnn2233";
        acc3.fullName = "xinduabe";
        acc3.createDate = LocalDate.now();

        Account[] accArray = { acc1, acc2, acc3 };

        System.out.println("Danh s??ch User : ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(accArray[i].username);
        }

        Group[] groupArray = { group1, group2, group3 };
        System.out.println("Nh???p UserName c???a account: ");
        String userName = sc.next();
        System.out.println("Danh s??ch Group : ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].groupName);
        }

        System.out.println("Nh???p th??m t??n Group : ");
        String groupName = sc.next();
        int indexGroup = -1;
        for (int i = 0; i < groupArray.length; i++) {
            if (groupArray[i].groupName.equals(groupName)) {
                indexGroup = i;
            }
        }

        int indexAccount = -1;
        for (int j = 0; j < accArray.length; j++) {
            if (accArray[j].username.equals(userName)) {
                indexAccount = j;
            }
        }

        if (indexAccount < 0 || indexGroup < 0) {
            System.out.println("Ki???m tra l???i th??ng tin ");

        }
        else {
            for (int j = 0; j < accArray.length; j++) {
                if (accArray[j].username.equals(userName)) {
                    Group[] gpAdd = { groupArray[indexGroup] };
                    accArray[j].groups = gpAdd;
                    System.out.println(" Add group: " + accArray[indexAccount].groups[0].groupName +
                            " cho Account: " + accArray[indexAccount].username);
                }
            }
        }
    }

    private static void Question_10(){
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("M???i b???n ch???n ch???c n??ng: 1. T???o Account, 2. T???o Department, 3.Add Group v??o Account");
            choose = sc.nextInt();
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        Question_5();
                        break;
                    case 2:
                        Question_6();
                        break;
                    case 3:
                        Question_9();
                        break;
                }
                System.out.println(" ch???n Menu ti???p t???c ,  0 ????? tho??t ch????ng tr??nh!");
                int sc1 = sc.nextInt();
                if (sc1 == 0) {
                    System.out.println("Xin ch??o h???n g???p l???i");
                    return;
                }
            } else {
                System.out.println("Nh???p l???i: ");
            }
        }

    }
    private static void Question_11(){
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println(" 1. T???o Account, 2. T???o Department, 3.Add Group v??o Account, 4. Th??m Account v??o 1 nh??m ng???u nhi??n");

            choose = sc.nextInt();
            if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {

                switch (choose) {
                    case 1:
                        Question_5();// nh??? l?? ph???i  c?? Privater ko th?? k d??ng ??c nh?? n??y ph???i t???o h??m ngay trong ph???n n??y vi???t ctrinh m???i
                        break;
                    case 2:
                        Question_6();
                        break;
                    case 3:
                        Question_9();
                        break;
                    case 4:
                        addAccountToRandomGroup();
                        break;
                }
                System.out.println(" ch???n menu ????? ti???p t???c s??? dung, Ch???n 0 ????? tho??t ch????ng tr??nh!");
                int sc1 = sc.nextInt();
                if (sc1 == 0) {
                    System.out.println(" C???m ??n b???n ???? d??ng ch????ng tr??nh abc!!!");
                    return;
                }
            } else {
                System.out.println("Nh???p l???i: ");

            }
        }
    }
    private static void addAccountToRandomGroup() {
        Scanner sc = new Scanner(System.in);
        // T???o Group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Testing_System";
        group1.CreateDate = java.sql.Date.valueOf(LocalDate.of(2021, 1, 1));
        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "Development";
        group2.CreateDate = java.sql.Date.valueOf(LocalDate.of(2020, 2, 1));
        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Sale";
        group3.CreateDate = java.sql.Date.valueOf(LocalDate.of(2019, 9, 23));

        // T???o Account

        Account acc1 = new Account();
        acc1.accountId = 1;
        acc1.email = "email1@gamil.com";
        acc1.username = "kwonchanjin";
        acc1.fullName = "fullnamkwon";
        acc1.createDate = LocalDate.now();

        Account acc2 = new Account();
        acc2.accountId = 2;
        acc2.email = "email1@gamil.com";
        acc2.username = "chanjinkwon";
        acc2.fullName = "fullname2333";
        acc2.createDate = LocalDate.of(2022, 5, 12);

        Account acc3 = new Account();
        acc3.accountId = 3;
        acc3.email = "email1@gamil.com";
        acc3.username = "kwonchanjinnnn2233";
        acc3.fullName = "xinduabe";
        acc3.createDate = LocalDate.now();

        Account[] accArray = { acc1, acc2, acc3 };// t???o m???ng cho account
        Group[] groupArray = { group1, group2, group3 };// t???o m???ng cho Group

        System.out.println("Danh s??ch User ??ang c?? tr??n h??? th???ng: ");
        for (int i = 0; i < accArray.length; i++) { // ?????m ????? d??i c???a m???ng
            System.out.println(accArray[i].username);// xu???t m???ng ra MH
        }
        System.out.println("Nh???p v??o UserName c???a account: ");
        String userName = sc.next();
        System.out.println("Danh s??ch Group ??ang c?? tr??n h??? th???ng: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].groupName);
        }

        // random khia b??o
        Random random = new Random();
        int indexGroup = random.nextInt(2);// khai b??o 1 bi???n inddexx nh?? i ????? l???y stt r???i g??n
        int indexAccount = -1; // khai b??o bi???n rooifgans gi?? tr??? n???u m?? so s??nh l???n h??n -1 ngh??a l?? c?? acc
        for (int j = 0; j < accArray.length; j++) {
            if (accArray[j].username.equals(userName)) { // so s??nh m???ng vs userName n???u c?? th?? g??n b???n j ko c?? th?? j=-1 t???c l?? ko c??
                indexAccount = j;
            }
        }
        if (indexAccount < 0) {
            System.out.println("Ki???m tra l???i th??ng tin ");

        } else {
            for (int j = 0; j < accArray.length; j++) {
                if (accArray[j].username.equals(userName)) {
                    Group[] gpAdd = { groupArray[indexGroup] };// t???o 1 m???ng gr c?? danh s??ch
                    accArray[j].groups = gpAdd;  // g??n th??i r???i xu???t ra MH
                    System.out.println("B???n v???a Add group: " + accArray[indexAccount].groups[0].groupName +
                            " cho Account: "+ accArray[indexAccount].username);
                }
            }
        }

    }
}
