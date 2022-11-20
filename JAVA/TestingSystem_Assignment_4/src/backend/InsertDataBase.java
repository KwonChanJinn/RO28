package backend;

import entity.*;

import java.sql.Date;
import java.time.LocalDate;

public class InsertDataBase {
    public static void main(String[] args) {
        Department department = new Department();

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

// thêm database Gr

        Group gr1 = new Group();
        gr1.setId(1);
        gr1.setName("Gr1");
        gr1.setCreateDate(new Date(2020 - 2 - 1).toLocalDate());
//        Group [] group1 = new Group[] {gr1};

        Group gr2 = new Group();
        gr2.setId(2);
        gr2.setName("Gr2");
        gr2.setCreateDate(new Date(2020 - 7 - 1).toLocalDate());
//        Group [] group2 = new Group[] {gr2,gr1};

        Group gr3 = new Group();
        gr3.setId(3);
        gr3.setName("Gr3");
        gr3.setCreateDate(new Date(2020 - 12 - 31).toLocalDate());
//        Group [] group3 = new Group[] {gr3,gr2,gr1};



        //account
        Account ac1 = new Account();
        ac1.setId(1);
        ac1.setEmail("email1@gmail.com");
        ac1.setUserName(" username1 ");
        ac1.setFullName("Trần Thanh Song 111111");
        ac1.setDepartment(dep1);
        ac1.setPosition(pos1);
        ac1.setCreateDate(LocalDate.ofEpochDay(2020 - 2 - 1));
//        ac1.setGroups(group1);

        Account ac2 = new Account();
        ac2.setId(2);
        ac2.setEmail("email2@gmail.com");
        ac2.setUserName(" username2 ");
        ac2.setFullName("Trần Thanh Song 222222221");
        ac2.setPosition(pos2);
        ac2.setDepartment(dep2);
        ac2.setCreateDate(LocalDate.ofEpochDay(2020 - 1 - 1));
//        ac1.setGroups(group3);

        Account ac3 = new Account();
        ac3.setId(3);
        ac3.setEmail("email3@gmail.com");
        ac3.setUserName(" username3 ");
        ac3.setFullName("Trần Thanh Song 333333");
        ac3.setPosition(pos3);
        ac3.setDepartment(dep3);
        ac3.setCreateDate(new Date(2020 - 12 - 31).toLocalDate());

//        ac1.setGroups(group3);
        // khai báo group

        // khai báo Account
        gr1.setAccounts(new Account[] { ac1,ac3 });
        gr2.setAccounts(new Account[] { ac2,ac1 });
        gr3.setAccounts(new Account[] { ac3,ac2 });

        ac1.setGroups(new Group[]{gr1, gr2});
        ac3.setGroups(new Group[]{gr1, gr3});
        ac2.setGroups(new Group[]{gr3, gr2});



        GroupAccount grc1 = new GroupAccount();
        grc1.setGroupId(1);
        grc1.setAccount(ac1);
        grc1.setJoinDate(new Date(2020 - 2 - 1).toLocalDate());

        GroupAccount grc2 = new GroupAccount();
        grc2.setGroupId(2);
        grc2.setAccount(ac2);
        grc2.setJoinDate(new Date(2020 - 2 -1).toLocalDate());

        GroupAccount grc3 = new GroupAccount();
        grc3.setGroupId(3);
        grc3.setAccount(ac3);
        grc3.setJoinDate(new Date(2020 - 2 -1).toLocalDate());


        // CategoryQuestion

        CategoryQuestion ca1 = new CategoryQuestion();
        ca1.setId(1);
        ca1.setName("JAVA");

        CategoryQuestion ca2 = new CategoryQuestion();
        ca2.setId(2);
        ca2.setName("RUBY");

        CategoryQuestion ca3 = new CategoryQuestion();
        ca3.setId(3);
        ca3.setName("NET");

        CategoryQuestion ca4 = new CategoryQuestion();
        ca4.setId(4);
        ca4.setName("POSTMAN");


        // TypeQuestion
        TypeQuestion ty1 = new TypeQuestion();
        ty1.setId(1);
        ty1.setName(TypeName.ESSAY);

        TypeQuestion ty2 = new TypeQuestion();
        ty2.setId(2);
        ty2.setName(TypeName.MULTIPLE_CHOICE);


        Question qs1 = new Question();
        qs1.setId(1);
        qs1.setContent("conten1");
        qs1.setType(ty1);
        qs1.setCreator(ac1);
        qs1.setCreateDate(new Date(2020 - 2 - 1).toLocalDate());

        Question qs2 = new Question();
        qs2.setId(2);
        qs2.setContent("conten2");
        qs2.setType(ty2);
        qs2.setCreator(ac2);
        qs2.setCreateDate(new Date(2022 - 2 - 1).toLocalDate());

        Question qs3 = new Question();
        qs3.setId(3);
        qs3.setContent("conten3");
        qs3.setType(ty1);
        qs3.setCreator(ac3);
        qs3.setCreateDate(new Date(2022 - 2 - 1).toLocalDate());
/// answer


        Answer an1 = new Answer();
        an1.setId(1);
        an1.setContent("11111111111");
        an1.setQuestion(qs1);
        an1.setCorrect(true);

        Answer an2 = new Answer();
        an2.setId(2);
        an2.setContent("2222222222222");
        an2.setQuestion(qs2);
        an2.setCorrect(false);

        Answer an3 = new Answer();
        an3.setId(3);
        an3.setContent("33333333");
        an3.setQuestion(qs3);
        an3.setCorrect(false);


// exam dâtbase

        Exam ex = new Exam();
        ex.setId(1);
        ex.setCode("code123");
        ex.setTitle(" title1");
        ex.setCategory(new CategoryQuestion[]{ca1});
        ex.setDuration(1);
        ex.setCreator(ac1);
        ex.setCreateDate(new Date(2020 - 2 - 1).toLocalDate());
        ex.setQuestion(new Question[]{qs1,qs2});


        Exam ex1 = new Exam();
        ex1.setId(2);
        ex1.setCode("code1232323232");
        ex1.setTitle(" title1323232323");
        ex1.setCategory(new CategoryQuestion[]{ca2,ca3});
        ex1.setDuration(2);
        ex1.setCreator(ac2);
        ex1.setCreateDate(new Date(2020 - 2 - 1).toLocalDate());
        ex1.setQuestion(new Question[]{qs2,qs3});


        // ExamQuestion

        ExamQuestion exq1 = new ExamQuestion();
        exq1.setExamId(1);
        exq1.setQuestions(new Question[]{qs1,qs2});

        ExamQuestion exq2 = new ExamQuestion();
        exq2.setExamId(2);
        exq2.setQuestions(new Question[]{qs2});


    }
}
