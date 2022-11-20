import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Program {


    public static void main(String[] args) {
        // khai báo Department

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
        gr1.CreateDate = new Date(2020 - 02 - 01);

        Group gr2 = new Group();
        gr2.groupId = 2;
        gr2.groupName = "Gr2";
        gr2.CreateDate = new Date(2020 - 02 - 01);

        Group gr3 = new Group();
        gr3.groupId = 3;
        gr3.groupName = "Gr3";
        gr3.CreateDate = new Date(2020 - 02 - 01);

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
        ac1.CreateDate = new Date(2020 - 02 - 01);
        ac1.groups = new Group[]{gr1, gr2};

        Account ac2 = new Account();
        ac2.accountId = 2;
        ac2.email = "email2@gmail.com";
        ac2.username = " username2 ";
        ac2.fullName = "Trần Thanh Song 22222";
        ac2.Department = dep2;
        ac1.position = pos2;
        ac2.PositionId = pos2;
        ac2.CreateDate = new Date(2020 - 02 - 01);
        ac2.groups = new Group[]{gr2, gr3};

        Account ac3 = new Account();
        ac3.accountId = 3;
        ac3.email = "email3@gmail.com";
        ac3.username = " username3 ";
        ac3.fullName = "Trần Thanh Song 33333";
        ac1.position = pos3;
        ac3.Department = dep3;
        ac3.PositionId = pos3;
        ac3.CreateDate = new Date(2020 - 02 - 01);
        ac3.groups = new Group[]{gr1, gr3};


        GroupAccount grc1 = new GroupAccount();
        grc1.groupId = gr1;
        grc1.AccountID = ac1;
        grc1.joinDate = new Date(2020 - 02 - 01);

        GroupAccount grc2 = new GroupAccount();
        grc2.groupId = gr2;
        grc2.AccountID = ac2;
        grc2.joinDate = new Date(2020 - 02 - 01);

        GroupAccount grc3 = new GroupAccount();
        grc3.groupId = gr3;
        grc3.AccountID = ac3;
        grc3.joinDate = new Date(2020 - 02 - 01);


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

        //Question

        //  QuestionID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        //    Content 			VARCHAR(255) NOT NULL UNIQUE,
        //    CategoryID 			TINYINT UNSIGNED NOT NULL,
        //    TypeID 				TINYINT UNSIGNED NOT NULL,
        //    CreatorID 			TINYINT UNSIGNED NOT NULL,
        //    CreateDate

        Question qs1 = new Question();
        qs1.questionId = 1;
        qs1.content = "conten1";
        qs1.typeID = ty1;
        qs1.creatorId = ca1;
        qs1.createDate = new Date(2020 - 02 - 01);

        Question qs2 = new Question();
        qs2.questionId = 2;
        qs2.content = "conten1";
        qs2.typeID = ty2;
        qs2.creatorId = ca2;
        qs2.createDate = new Date(2020 - 02 - 01);
        //AnswerID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        //    Content			 	VARCHAR(255) UNIQUE NOT NULL,
        //    QuestionID 			TINYINT UNSIGNED NOT NULL,
        //    isCorrect 			BOOLEAN,
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

        // exam
        //    ExamID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        //    `Code` 				VARCHAR(255) NOT NULL UNIQUE,
        //    Title 				VARCHAR(255) NOT NULL,
        //    CategoryIDi 		VARCHAR(255) NOT NULL,
        //    Duration 			TIME NOT NULL ,
        //    CreatorID 			TINYINT UNSIGNED NOT NULL,
        //    CreateDate 			DATETIME NOT NULL

        Exam ex = new Exam();
        ex.examId = 1;
        ex.Code = "code123";
        ex.title = " title1";
        ex.CategoryIdi = "Chả biết viết gì ";
        ex.duration = new Date(2020 - 02 - 01);
        ex.creatorId = ca1;
        ex.CreateDate = new Date(2020 - 02 - 01);

// acc2.createDate = LocalDate.of(2021, 03, 17);
        Exam ex1 = new Exam();
        ex1.examId = 2;
        ex1.Code = "code33333123";
        ex1.title = " title1232323";
        ex1.CategoryIdi = "Chả biết viết gì ";
        ex1.duration = new Date(2020 - 02 - 01);
        ex1.creatorId = ca2;
        ex1.CreateDate = new Date(2020 - 02 - 01);


        Exam ex2 = new Exam();
        ex2.examId = 3;
        ex2.Code = "code122222223";
        ex2.title = " title142424";
        ex2.CategoryIdi = "Chả biết viết gì ";
        ex2.duration = new Date(2020 - 02 - 01);
        ex2.creatorId = ca3;
        ex2.CreateDate = new Date(2020 - 02 - 01);

        // ExamQuestion

        ExamQuestion exq1 = new ExamQuestion();
        exq1.examId = 1;
        exq1.questionId = qs1;

        ExamQuestion exq2 = new ExamQuestion();
        exq2.examId = 2;
        exq2.questionId = qs2;

        System.out.println(dep1);
        System.out.println(ex2);


    }
}
