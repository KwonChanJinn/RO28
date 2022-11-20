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
        System.out.println("Mời bạn nhập vào 3 số nguyên");
        System.out.println("Nhập vào số thứ 1: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ 2: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số thứ 3: ");
        int c = sc.nextInt();
        System.out.println("Bạn vừa nhập vào các số: " + a + " " + b + " " + c);
    }
    private static void Question_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số thực");
        System.out.println("Nhập vào số thứ 1: ");
        float f1 = sc.nextFloat();
        System.out.println("Nhập vào số thứ 2: ");
        float f2 = sc.nextFloat();
        System.out.println("IN ra MH: " + f1 + " " + f2);
    }
    private static void Question_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào Họ: ");
        String str1 = sc.next();
        System.out.println("nhập vào Tên: ");
        String str2 = sc.next();
        System.out.println("Fullname :" + str1 + " " + str2);
    }
    private static void Question_4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào năm sinh: ");
        int year = sc.nextInt();
        System.out.println("nhập vào tháng sinh: ");
        int month = sc.nextInt();
        System.out.println("nhập vào ngày sinh: ");
        int day = sc.nextInt();
        LocalDate dateBirth = LocalDate.of(year, month, day);
        System.out.println("Ngày sinh của bạn : " + dateBirth);
    }

    private static void Question_5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin account cân tạo: ");

        Account acc = new Account();
        System.out.println("Nhập ID: ");
        acc.accountId = sc.nextInt();
        System.out.println("Nhập email: ");
        acc.email = sc.nextLine();
        System.out.println("Nhập userName: ");
        acc.username = sc.nextLine();
        System.out.println("Nhập fullName: ");
        acc.fullName = sc.nextLine();


        System.out.println("Nhập các số từ 1 đến 4 tương ứng với:1.Dev, 2. Test, 3. Scrum_Master, 4. PM");
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
        System.out.println("Thông tin Acc , ID: " + acc.accountId +
                " Email:" + acc.email +
                " UserName:" + acc.username +
                " FullName: " + acc.fullName +
                " Position:" + acc.position.PositionName);
    }

    private static void Question_6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin Department cân tạo: ");

        Department dep123 = new Department();
        System.out.println("Nhập ID: ");
        dep123.departmentId = (byte) sc.nextInt();
        System.out.println("Nhập Name: ");
        dep123.departmentName = sc.next();
        System.out.println("Thông tin Department vừa nhập, ID: " + dep123.departmentId + " Name: " + dep123.departmentName);

    }
    private static void Question_7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số vào : ");
        int nhapso;
        nhapso = sc.nextInt();
        if (nhapso %2 == 0) {
            System.out.println("Đay là số chẵn");
        }
        else {
            System.out.println("Đây là số lẻ ");
        }

    }
    private static void Question_8(){
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("chọn chức năng: 1. Tạo Account, 2. Tạo Department");

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
                System.out.println("Nhập lại: ");
            }
        }

    }
    private static void Question_9(){
        Scanner sc = new Scanner(System.in);
// Tạo Group
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

// Tạo Account

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

        System.out.println("Danh sách User : ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(accArray[i].username);
        }

        Group[] groupArray = { group1, group2, group3 };
        System.out.println("Nhập UserName của account: ");
        String userName = sc.next();
        System.out.println("Danh sách Group : ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].groupName);
        }

        System.out.println("Nhập thêm tên Group : ");
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
            System.out.println("Kiểm tra lại thông tin ");

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
            System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department, 3.Add Group vào Account");
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
                System.out.println(" chọn Menu tiếp tục ,  0 để thoát chương trình!");
                int sc1 = sc.nextInt();
                if (sc1 == 0) {
                    System.out.println("Xin chào hẹn gặp lại");
                    return;
                }
            } else {
                System.out.println("Nhập lại: ");
            }
        }

    }
    private static void Question_11(){
        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println(" 1. Tạo Account, 2. Tạo Department, 3.Add Group vào Account, 4. Thêm Account vào 1 nhóm ngẫu nhiên");

            choose = sc.nextInt();
            if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {

                switch (choose) {
                    case 1:
                        Question_5();// nhớ là phải  có Privater ko thì k dùng đc như này phải tạo hàm ngay trong phần này viết ctrinh mới
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
                System.out.println(" chọn menu để tiếp tục sử dung, Chọn 0 để thoát chương trình!");
                int sc1 = sc.nextInt();
                if (sc1 == 0) {
                    System.out.println(" Cảm ơn bạn đã dùng chương trình abc!!!");
                    return;
                }
            } else {
                System.out.println("Nhập lại: ");

            }
        }
    }
    private static void addAccountToRandomGroup() {
        Scanner sc = new Scanner(System.in);
        // Tạo Group
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

        // Tạo Account

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

        Account[] accArray = { acc1, acc2, acc3 };// tạo mảng cho account
        Group[] groupArray = { group1, group2, group3 };// tạo mảng cho Group

        System.out.println("Danh sách User đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) { // đếm độ dài của mảng
            System.out.println(accArray[i].username);// xuất mảng ra MH
        }
        System.out.println("Nhập vào UserName của account: ");
        String userName = sc.next();
        System.out.println("Danh sách Group đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].groupName);
        }

        // random khia báo
        Random random = new Random();
        int indexGroup = random.nextInt(2);// khai báo 1 biến inddexx như i để lấy stt rồi gán
        int indexAccount = -1; // khai báo biến rooifgans giá trị nếu mà so sánh lớn hơn -1 nghĩa là có acc
        for (int j = 0; j < accArray.length; j++) {
            if (accArray[j].username.equals(userName)) { // so sánh mảng vs userName nếu có thì gán bằn j ko có thì j=-1 tức là ko có
                indexAccount = j;
            }
        }
        if (indexAccount < 0) {
            System.out.println("Kiểm tra lại thông tin ");

        } else {
            for (int j = 0; j < accArray.length; j++) {
                if (accArray[j].username.equals(userName)) {
                    Group[] gpAdd = { groupArray[indexGroup] };// tạo 1 mảng gr có danh sách
                    accArray[j].groups = gpAdd;  // gán thôi rồi xuất ra MH
                    System.out.println("Bạn vừa Add group: " + accArray[indexAccount].groups[0].groupName +
                            " cho Account: "+ accArray[indexAccount].username);
                }
            }
        }

    }
}
