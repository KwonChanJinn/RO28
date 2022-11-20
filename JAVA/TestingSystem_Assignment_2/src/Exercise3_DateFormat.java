import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Exercise3_DateFormat {
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

    }

    private static void Question_1() {
        //Exercise 3 (Optional): Date Format
        //Question 1:
        //In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
        //dạng vietnamese
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

        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new java.sql.Date(2020 - 02 - 01);

        gr1.accounts = new Account[]{ac1, ac2};
        gr2.accounts = new Account[]{ac1, ac2};
        gr3.accounts = new Account[]{ac2, ac2};

        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.CategoryId = 1;
        ca1.categoryName = EnumCategoryQuestion.JAVA;

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.CategoryId = 2;
        ca2.categoryName = EnumCategoryQuestion.RUBY;

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.CategoryId = 3;
        ca3.categoryName = EnumCategoryQuestion.NET;

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.CategoryId = 4;
        ca4.categoryName = EnumCategoryQuestion.POSTMAN;

        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.TypeID = 1;
        ty1.typeName = EnumTypeQuestion.ESSAY;

        TypeQuestion ty2 = new TypeQuestion();
        ty2.TypeID = 2;
        ty2.typeName = EnumTypeQuestion.MULTIPLE_CHOICE;

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new java.sql.Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new java.sql.Date(2020 - 02 - 01);

        Answer an1 = new Answer();
        an1.answerId = 1;
        an1.content = "111111";
        an1.questionId = qs1;
        an1.isCorrect = true;

        Answer an2 = new Answer();
        an2.answerId = 3;
        an2.content = "12222211";
        an2.questionId = qs2;
        an2.isCorrect = true;

        Answer an3 = new Answer();
        an3.answerId = 3;
        an3.content = "11333311";
        an3.questionId = qs1;
        an3.isCorrect = true;

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new java.sql.Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new java.sql.Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new java.sql.Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        // ExamQuestion
        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;

        // bài làm

        Locale locale = new Locale("VN", "VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date23 = dateformat.format(ex1.CreateDate);
        System.out.println(date23);

        Locale locale1 = new Locale(" VN", "VN"); // khai báo biến mới locale mới = new cái locale ấy
        DateFormat dateformat1 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale1); //
        // rồi gọi cái hàm datefomat ấy ra rồi gán  giá trị datedefaut cho nó , rồi gán gias trị cho nó chính là cái locale
        String date13 = dateformat.format(ex1.CreateDate); // khai báo một cái hàm string  cho cái date format  bằng cái giá
        // trị là cretedate từ cái exam
        System.out.println(date13); //  xuất ra màn hình   bằng lệnh sysout xuất date

    }

    private static void Question_2() {

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

        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new java.sql.Date(2020 - 02 - 01);

        gr1.accounts = new Account[]{ac1, ac2};
        gr2.accounts = new Account[]{ac1, ac2};
        gr3.accounts = new Account[]{ac2, ac2};

        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.CategoryId = 1;
        ca1.categoryName = EnumCategoryQuestion.JAVA;

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.CategoryId = 2;
        ca2.categoryName = EnumCategoryQuestion.RUBY;

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.CategoryId = 3;
        ca3.categoryName = EnumCategoryQuestion.NET;

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.CategoryId = 4;
        ca4.categoryName = EnumCategoryQuestion.POSTMAN;

        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.TypeID = 1;
        ty1.typeName = EnumTypeQuestion.ESSAY;

        TypeQuestion ty2 = new TypeQuestion();
        ty2.TypeID = 2;
        ty2.typeName = EnumTypeQuestion.MULTIPLE_CHOICE;

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new java.sql.Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new java.sql.Date(2020 - 02 - 01);

        Answer an1 = new Answer();
        an1.answerId = 1;
        an1.content = "111111";
        an1.questionId = qs1;
        an1.isCorrect = true;

        Answer an2 = new Answer();
        an2.answerId = 3;
        an2.content = "12222211";
        an2.questionId = qs2;
        an2.isCorrect = true;

        Answer an3 = new Answer();
        an3.answerId = 3;
        an3.content = "11333311";
        an3.questionId = qs1;
        an3.isCorrect = true;

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new java.sql.Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new java.sql.Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new java.sql.Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        // ExamQuestion
        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;

        //Question 2:
        //In ra thông tin: Exam đã tạo ngày nào theo định dạng
        //Năm – tháng – ngày – giờ – phút – giây

        System.out.println("----------------------Question 2   cách 1 -------------------------");
        System.out.println("");

        Exam[] examArray12222222 = {ex1, ex2};
        for (int i = 0; i < examArray12222222.length; i++) {
            Date date1234 = new Date();
            SimpleDateFormat formatter123 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            String strDate123 = formatter123.format(examArray12222222[i].CreateDate);
            for (Exam exam : examArray12222222) {
                System.out.println(exam.title + " __  " + strDate123);
            }
        }

        System.out.println("---------------------- Question 1 cách 2 -------------------------");
        System.out.println("");

        String pattern12 = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat111 = new SimpleDateFormat(pattern12);
        Exam[] exams = {ex1, ex2};
        for (Exam exam : exams) {
            String date25634 = simpleDateFormat111.format(exam.CreateDate);
            System.out.println(exam.Code + ": " + date25634);
        }

    }

    private static void Question_3() {

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

        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new java.sql.Date(2020 - 02 - 01);

        gr1.accounts = new Account[]{ac1, ac2};
        gr2.accounts = new Account[]{ac1, ac2};
        gr3.accounts = new Account[]{ac2, ac2};

        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.CategoryId = 1;
        ca1.categoryName = EnumCategoryQuestion.JAVA;

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.CategoryId = 2;
        ca2.categoryName = EnumCategoryQuestion.RUBY;

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.CategoryId = 3;
        ca3.categoryName = EnumCategoryQuestion.NET;

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.CategoryId = 4;
        ca4.categoryName = EnumCategoryQuestion.POSTMAN;

        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.TypeID = 1;
        ty1.typeName = EnumTypeQuestion.ESSAY;

        TypeQuestion ty2 = new TypeQuestion();
        ty2.TypeID = 2;
        ty2.typeName = EnumTypeQuestion.MULTIPLE_CHOICE;

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new java.sql.Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new java.sql.Date(2020 - 02 - 01);

        Answer an1 = new Answer();
        an1.answerId = 1;
        an1.content = "111111";
        an1.questionId = qs1;
        an1.isCorrect = true;

        Answer an2 = new Answer();
        an2.answerId = 3;
        an2.content = "12222211";
        an2.questionId = qs2;
        an2.isCorrect = true;

        Answer an3 = new Answer();
        an3.answerId = 3;
        an3.content = "11333311";
        an3.questionId = qs1;
        an3.isCorrect = true;

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new java.sql.Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new java.sql.Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new java.sql.Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        // ExamQuestion
        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;


        //Question 3:
        //Chỉ in ra năm của create date property trong Question 2

        Date date1234 = new Date();
        SimpleDateFormat formatter1234 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String pattern12 = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat111 = new SimpleDateFormat(pattern12);
        Question[] questionsarray = {qs1, qs2};
        for (Question question : questionsarray) {
            if (question.questionId == 2) {
                String date25634 = simpleDateFormat111.format(question.createDate);
                System.out.println(question.createDate + ": " + date25634 + " ID " + question.questionId);
            }
        }


    }

    private static void Question_4() {
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

        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new java.sql.Date(2020 - 02 - 01);

        gr1.accounts = new Account[]{ac1, ac2};
        gr2.accounts = new Account[]{ac1, ac2};
        gr3.accounts = new Account[]{ac2, ac2};

        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.CategoryId = 1;
        ca1.categoryName = EnumCategoryQuestion.JAVA;

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.CategoryId = 2;
        ca2.categoryName = EnumCategoryQuestion.RUBY;

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.CategoryId = 3;
        ca3.categoryName = EnumCategoryQuestion.NET;

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.CategoryId = 4;
        ca4.categoryName = EnumCategoryQuestion.POSTMAN;

        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.TypeID = 1;
        ty1.typeName = EnumTypeQuestion.ESSAY;

        TypeQuestion ty2 = new TypeQuestion();
        ty2.TypeID = 2;
        ty2.typeName = EnumTypeQuestion.MULTIPLE_CHOICE;

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new java.sql.Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new java.sql.Date(2020 - 02 - 01);

        Answer an1 = new Answer();
        an1.answerId = 1;
        an1.content = "111111";
        an1.questionId = qs1;
        an1.isCorrect = true;

        Answer an2 = new Answer();
        an2.answerId = 3;
        an2.content = "12222211";
        an2.questionId = qs2;
        an2.isCorrect = true;

        Answer an3 = new Answer();
        an3.answerId = 3;
        an3.content = "11333311";
        an3.questionId = qs1;
        an3.isCorrect = true;

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new java.sql.Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new java.sql.Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new java.sql.Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        // ExamQuestion
        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;

        //Question 4:
        //Chỉ in ra tháng và năm của create date property trong Question 2
        System.out.println("----------------------Cách 1-------------------------");

        Question[] questionsarray5 = {qs1, qs2};
        SimpleDateFormat formatter12345 = new SimpleDateFormat("yyyy-MM");

//        String pattern1234 = "MM-dd";
//        simpleDateFormat = new SimpleDateFormat(pattern1234);
        for (Question question : questionsarray5) {
            if (question.questionId == 2) {
                String date12345678 = formatter12345.format(question.createDate);
                System.out.println("Giá trị đấy sẽ là : " + date12345678 + " ID " + question.questionId);
            }
        }

        System.out.println("----------------------Cách 2-------------------------");

        String pattern1 = "yyyy-MM";
        SimpleDateFormat simpleDateFormat111 = new SimpleDateFormat(pattern1);
        Exam[] exams = {ex1, ex2};
        simpleDateFormat111 = new SimpleDateFormat(pattern1);
        for (Exam exam : exams) {
            String date312 = simpleDateFormat111.format(exam.CreateDate);
            System.out.println(exam.Code + ": " + date312);
        }


    }

    private static void Question_5() {

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

        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new java.sql.Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new java.sql.Date(2020 - 02 - 01);

        gr1.accounts = new Account[]{ac1, ac2};
        gr2.accounts = new Account[]{ac1, ac2};
        gr3.accounts = new Account[]{ac2, ac2};

        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.CategoryId = 1;
        ca1.categoryName = EnumCategoryQuestion.JAVA;

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.CategoryId = 2;
        ca2.categoryName = EnumCategoryQuestion.RUBY;

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.CategoryId = 3;
        ca3.categoryName = EnumCategoryQuestion.NET;

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.CategoryId = 4;
        ca4.categoryName = EnumCategoryQuestion.POSTMAN;

        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.TypeID = 1;
        ty1.typeName = EnumTypeQuestion.ESSAY;

        TypeQuestion ty2 = new TypeQuestion();
        ty2.TypeID = 2;
        ty2.typeName = EnumTypeQuestion.MULTIPLE_CHOICE;

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new java.sql.Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new java.sql.Date(2020 - 02 - 01);

        Answer an1 = new Answer();
        an1.answerId = 1;
        an1.content = "111111";
        an1.questionId = qs1;
        an1.isCorrect = true;

        Answer an2 = new Answer();
        an2.answerId = 3;
        an2.content = "12222211";
        an2.questionId = qs2;
        an2.isCorrect = true;

        Answer an3 = new Answer();
        an3.answerId = 3;
        an3.content = "11333311";
        an3.questionId = qs1;
        an3.isCorrect = true;

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new java.sql.Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new java.sql.Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new java.sql.Date(2020 - 02 - 01);

        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new java.sql.Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new java.sql.Date(2020 - 02 - 01);
        // ExamQuestion
        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;


        //Question 5:
        //Chỉ in ra "MM-DD" của create date trong Question 2
        System.out.println("----------------------Cách 1-------------------------");
        Question[] questionsarray56 = {qs1, qs2};
        SimpleDateFormat formatter123456 = new SimpleDateFormat("MM-dd");

//        String pattern1234 = "MM-dd";
//        simpleDateFormat = new SimpleDateFormat(pattern1234);
        for (Question question : questionsarray56) {
            if (question.questionId == 2) {
                String date123456786 = formatter123456.format(question.createDate);
                System.out.println("Giá trị đấy sẽ là : " + date123456786 + " ID " + question.questionId);
            }
        }

        System.out.println("----------------------Cách 2-------------------------");


        String pattern13456 = "MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern13456);
        Exam[] exams = {ex1, ex2};
        for (Exam exam : exams) {
            String date3123333 = simpleDateFormat.format(exam.CreateDate);
            System.out.println(exam.Code + ": " + date3123333);
        }

    }
}
