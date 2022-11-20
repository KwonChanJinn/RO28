package BackEnd;

import Entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Excrise1 {

    private ArrayList<Student> studentList;
    private Scanner sc;

    public int index;

    public Excrise1() {
        sc = new Scanner(System.in);
        studentList = new ArrayList<Student>();
    }

    public Student[] ArrStd = new Student[8];

    public void question1() {

        System.out.println("tạo " + ArrStd.length + "sv mới ");
        for (int i = 0; i < ArrStd.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            String name = "Sinh Viên " + i;
            Student st = new Student(i, name);
            ArrStd[i] = st;
        }

        System.out.println("Thông tin sv mới : ");
        for (int i = 0; i < ArrStd.length; i++) {
            System.out.println(ArrStd[i]);
        }
        System.out.println("Chuyển sv sang Đại học công nghệ: ");
        Student.college = "Đại học Công nghệ ";
        System.out.println("sinh viên sau khi chuyển ");
        for (int i = 0; i < ArrStd.length; i++) {
            System.out.println(ArrStd[i]);
        }
    }

    public void question2() {
        Student[] ArrStd = new Student[3];
        System.out.println("khởi tạo 3 sinh viện");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sinh viên " + (i + 1 + ":"));
            Student st = new Student();
            ArrStd[i] = st;
        }
        System.out.println("Các sinh viên nộp quỹ, mỗi bạn 100K: ");
        System.out.println("Tổng quỹ: " + (Student.moneyGroup += 300));

        System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
        System.out.println("Quỹ còn lại là " + (Student.moneyGroup -= 50));
        System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");

        System.out.println("TQuỹ còn lại là " + (Student.moneyGroup -= 20));
        System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");

        System.out.println("Quỹ còn lại là : " + (Student.moneyGroup -= 150));
        System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k: ");

        System.out.println("Quỹ còn lại là : " + (Student.moneyGroup += 150));
    }

    public void question3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a :");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số a:");
        int b = scanner.nextInt();
        System.out.println("Max a và b: " + myMath.max(a, b));
        System.out.println("Min a và b: " + myMath.min(a, b));
        System.out.println("Sum a và b: " + myMath.sum(a, b));
    }

    public void question4() {
        //a) Viết method cho phép thay đổi college
        //b) Viết method cho phép lấy giá trị của college
//        Student[] ST = new Student[5];
//
//        System.out.println("Demo Get Set Collect: ");
//        Student st = null;
//        System.out.println("Tên Sinh viên");
//        for (int i = 0; i < ST.length; i++) {
//            System.out.println("Sinh Viên thứ i " + i+":");
//            st = new Student();
//            ST[i] = st;
//        }
//        for (int i = 0; i < ST.length; i++) {
//
//            System.out.println("Collect là: " + ST[i].getCollege());
//            System.out.println("Thay đổi Collect: Đại học Xây Dựng");
//            ST[i].setCollege("Đại học Xây Dựng ");
//            System.out.println("Collect là: " +  ST[i].getCollege());
//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Demo Get Set Collect: ");
        // tạo 1 cái st mới  1 lớp truyền vào cho nó
        Student st = new Student();
        // lôi get nó ra trogn cái student đã nhập
        System.out.println("Collect cũ  là: " + st.getCollege());
        System.out.println(" Nhập collect cần sửa  ");
        String col = scanner.nextLine();
        //set nhập vào cho nó
        st.setCollege(col);
        System.out.println("Collect moi là: " + st.getCollege());
        // giống cái này nhưng cái dưới là nhập cứng
        // còn cái teeen là truyền tham số vào
        //System.out.println("Chuyển sv sang Đại học công nghệ: ");
        //        Student.college = "Đại học Công nghệ ";
        //        System.out.println("sinh viên sau khi chuyển ");
        //        for (int i = 0; i < ArrStd.length; i++) {
        //            System.out.println(ArrStd[i]);
        //        }

        System.out.println("sinh viên sau khi chuyển ");
        for (int i = 0; i < ArrStd.length; i++) {
            System.out.println(ArrStd[i]);
        }
    }

    public void question5() {

        System.out.println("Sử dụng For để tạo sinh viên: ");
        for (int i = 0; i < ArrStd.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            Student st = new Student();
        }
        System.out.println("Số sinh viên được tạo ra trên hệ thống là: " + Student.count);
    }

    public void question6() {

        System.out.println("Tạo 2 Primary Student: ");
        PrimaryStudent primaryStudent = new PrimaryStudent();
        PrimaryStudent primaryStudent1 = new PrimaryStudent();
        System.out.println("Tạo 6 Secondary Student: ");
        SecondaryStudent secondaryStudent = new SecondaryStudent();
        SecondaryStudent secondaryStudent1 = new SecondaryStudent();
        SecondaryStudent secondaryStudent2 = new SecondaryStudent();
        SecondaryStudent secondaryStudent3 = new SecondaryStudent();
        SecondaryStudent secondaryStudent4 = new SecondaryStudent();
        SecondaryStudent secondaryStudent5 = new SecondaryStudent();

        System.out.println("Thông tin số lượng sinh viên");
        System.out.println("Student" + Student.count);

        System.out.println("PrimaryStudent" + PrimaryStudent.COUNTPri);
        System.out.println("SecondaryStudent" + SecondaryStudent.COUNTSecond);

    }

    public void question7() {
        int sumAll = PrimaryStudent.COUNTPri + SecondaryStudent.COUNTSecond + Student.count;

        System.out.println("Tổng số học sinh 3 cấp 1 2 3 là " + sumAll);

        if (Student.count > 7) {
            System.out.println("Số học sinh đã lớn hơn 7");
        } else {
            System.out.println("Số học sinh đã đuược tạo ra là " + Student.count);
            System.out.println("Nhập lại số lượng học sinh sinh viên toàn khóa nhé ");
        }

    }

    // còn đây là cách làm aifi có biến cục bộ nè
    public void question7_1() {
        System.out.println("=================BÀI NÀY LÀM CHƠI CHƠI ĐỂ ÔN LẠI SWITH CASE ÔN LẠI FOR ÔN LẠI BÀI TẬP===================");
        System.out.println("Nhâp số luong học sinh muốn thêm");
        int checkStudent = sc.nextInt();
        Student[] studentArr = new Student[checkStudent];
        for (int i = 0; i < checkStudent; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            String name = "Sinh Viên " + i;
            Student st = new Student(i, name);
            studentArr[i] = st;
        }
        System.out.println("thêm số học sinh cấp 1  vào đây");
        int addPrimary = sc.nextInt();
        PrimaryStudent[] primaryStudentArr = new PrimaryStudent[addPrimary];
        {
            for (int i = 0; i < primaryStudentArr.length; i++) {
                System.out.println("Học sinh cấp 1 thứ " + (i + 1));
                String name = "học sinh tiều học là" + i;
                PrimaryStudent primaryStudent = new PrimaryStudent();
                studentList.add(primaryStudent);

                primaryStudentArr[i] = primaryStudent;
            }
            System.out.println("Số lượng học sinh cấp 1 là " + PrimaryStudent.COUNTPri);
        }

        System.out.println("Nhập số lượng học sinh cấp 2 vào đây");
        int addSecondary = sc.nextInt();
        SecondaryStudent[] secondaryStudentArr = new SecondaryStudent[addSecondary];
        for (int i = 0; i < addSecondary; i++) {
            System.out.println("Đây là học sinh cấp 2 thứ " + (i + 1));
            String name = "Họ và tên " + i;
            SecondaryStudent secondaryStudent = new SecondaryStudent();

        }
        System.out.println("Số lượng học sinh cấp 2 là " + SecondaryStudent.COUNTSecond);

        int sumStudent = Student.count + SecondaryStudent.COUNTSecond + PrimaryStudent.COUNTPri;

        while (true) {
            System.out.println("==========================1 là kiểm tra học sinh 3 khối lớn hơn 7 hay ko==========================");
            System.out.println("==========================2 là kiểm tra studen lớn hơn 7 không ==========================");
            System.out.println("==========================3 là kiểm tra học sinh cấp 1 có lớn hơn 7 không==========================");
            System.out.println("==========================4 là kiểm tra học sinh cấp 2 có lớn hơn 7 không ==========================");
            System.out.println("==========================5 là thoát chương trình nhé ==========================");
            System.out.println("Nhập giá trị cần kiểm tra ");
            int chooseStudent = sc.nextInt();

            switch (chooseStudent) {
                case 1:
                    if (sumStudent > 7) {
                        System.out.println(" Nhập lại số lượng học sinh 3 khối ");
                    } else {
                        System.out.println("Học sinh 3 khối thỏa mãn bé hơn 7");
                    }
                    System.out.println("SỐ lượng học sih là " + sumStudent);
                    break;
                case 2:
                    if (Student.count > 7) {
                        System.out.println(" Nhập lại số lượng học sinh cấp 3 ");
                    } else {
                        System.out.println("Học sinh cấp3 thỏa mãn bé hơn 7");
                    }
                    System.out.println("SỐ lượng học sih là " + Student.count);
                    break;
                case 3:
                    if (PrimaryStudent.COUNTPri > 7) {
                        System.out.println(" Nhập lại số lượng học sinh cấp 1 khối ");
                    } else {
                        System.out.println("Học sinh cấp 1 khối thỏa mãn bé hơn 7");
                    }
                    System.out.println("SỐ lượng học sih là " + PrimaryStudent.COUNTPri);
                    break;
                case 4:
                    if (SecondaryStudent.COUNTSecond > 7) {
                        System.out.println(" Nhập lại số lượng học sinh cấp 2  ");
                    } else {
                        System.out.println("Học sinh cấp 2  khối thỏa mãn bé hơn 7");
                    }
                    System.out.println("SỐ lượng học sih là " + SecondaryStudent.COUNTSecond);
                    break;
                case 5:
                    return;
                case 6:
                    System.out.println("Nhâp lại đúng đầu vào nhé 1 2 3 4 5 thôi nha ");
                    break;
            }

        }

    }

    public void question7_2() {

        System.out.println("Số lượng student là ");

        for (Student student1 : studentList) {
            System.out.println(student1);
        }

    }

    public void question8() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tạo 4 hình chữ nhật.");
        rectanguler[] hcn = new rectanguler[4];
        for (int i = 0; i < 4; i++) {

            System.out.println("Hình " + (i + 1) + ":");
            System.out.println("Canh a: ");
            Float a = sc.nextFloat();
            System.out.println("Canh b: ");
            Float b = sc.nextFloat();
            rectanguler hcn1 = new rectanguler(a, b);
            hcn[i] = hcn1;
        }
        System.out.println("Tạo hình tròn số 1, nhập vào bán kính ");
        Float r1 = sc.nextFloat();
        circle hinhtron1 = new circle(r1, r1);
        System.out.println("Tạo hình tròn số 2, nhập vào bán kính ");
        Float r2 = sc.nextFloat();
        circle hinhtron2 = new circle(r2, r2);
    }
}


