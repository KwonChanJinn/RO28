-- ghi chú tạo cơ sở dữ liệu

DROP DATABASE IF EXISTS Testing_System_Assigment1 ;
DROP DATABASE IF EXISTS Testing_System_Assigment2 ;

CREATE DATABASE Testing_System_Assigment1;

-- tạo bảng dữ liệu

USE Testing_System_Assigment1;

CREATE TABLE `Department` (
    DepartmentID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName 		VARCHAR(255) NOT NULL UNIQUE KEY
);

CREATE TABLE `Position` (
    PositionID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName 		ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE KEY
);

CREATE TABLE `Account` (
    AccountID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(255) NOT NULL UNIQUE KEY,
    Username VARCHAR(255) NOT NULL UNIQUE KEY,
    FullName VARCHAR(255) NOT NULL,
    DepartmentID TINYINT UNSIGNED NOT NULL,
    PositionID TINYINT UNSIGNED NOT NULL,
    CreateDate DATETIME DEFAULT NOW() ,
    FOREIGN KEY (DepartmentID)REFERENCES Department (DepartmentID),
    FOREIGN KEY (PositionID)REFERENCES Position (PositionID)
);  

CREATE TABLE `Group` (
    GroupID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName 			VARCHAR(255) NOT NULL UNIQUE KEY ,
    CreatorID 			TINYINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME
);

CREATE TABLE `GroupAccount`(
    GroupID 			TINYINT UNSIGNED  ,
    AccountID 			TINYINT UNSIGNED ,
    JoinDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY(GroupID) REFERENCES `Group`( GroupID) ON DELETE CASCADE, 
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

CREATE TABLE `TypeQuestion` (
    TypeID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
    TypeName			ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE
);

CREATE TABLE `CategoryQuestion` (
    CategoryID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName 		ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby') NOT NULL UNIQUE KEY
);

-- DROP TABLE IF EXISTS `Question`;

CREATE TABLE `Question` (
    QuestionID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 			VARCHAR(255) NOT NULL UNIQUE,
    -- XẾP TỪ 0 -255 KO ĐC BỎ TRỐNG 
    CategoryID 			TINYINT UNSIGNED NOT NULL,
    TypeID 				TINYINT UNSIGNED NOT NULL,
    CreatorID 			TINYINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY(TypeID) REFERENCES `TypeQuestion`(TypeID),
    FOREIGN KEY(CategoryID) REFERENCES `CategoryQuestion`(CategoryID)
 
  --  FOREIGN KEY (CreatorID) REFERENCES `Group`(CreatorID)
);

CREATE TABLE `Answer` (
    AnswerID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content			 	VARCHAR(255) UNIQUE NOT NULL,
    QuestionID 			TINYINT UNSIGNED NOT NULL,
    isCorrect 			BOOLEAN,
    FOREIGN KEY (QuestionID) REFERENCES `Question`(QuestionID)  ON DELETE CASCADE
);

CREATE TABLE `Exam` (
    ExamID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 				VARCHAR(255) NOT NULL UNIQUE,
    Title 				VARCHAR(255) NOT NULL,
    CategoryIDi 		VARCHAR(255) NOT NULL,
    Duration 			TIME NOT NULL ,
    CreatorID 			TINYINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME NOT NULL
  
);

CREATE TABLE `ExamQuestion` (
    ExamID 				TINYINT UNSIGNED NOT NULL,
    QuestionID 			TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (QuestionID) REFERENCES `Question` (QuestionID)

);

INSERT INTO `Department` (DepartmentName)
VALUE ('Kế Toán'),
	('Nhân Sụ'),
	('Hành Chính'),
	('Chăm Sóc KH'),
	('Phòng Truyền Thông'),
	('Phòng Marketting'),
	('Phòng Kinh Doanh'),
	('Phòng Kiểm Toán'),
	('Phòng Kỹ Thuật'),
	('Phòng Tester'),
	('Phòng Dev'),
    ('waiting Department');

INSERT INTO `Position` (PositionName )
VALUE('Dev'),
	('Test'),
	('Scrum Master'),
	('PM');

INSERT INTO `Account` (AccountID,Email,Username,FullName,CreateDate,DepartmentID, PositionID)
VALUE
	('00001','Quantrivien1@gmail.com','Nhanvien1','Tran Van An','2003-01-09',1,1),
	('00002','Quantrivien2@gmail.com','Nhanvien2','Nguyen Van B','2002-02-19',2,1),
	('00003','Quantrivien3@gmail.com','Nhanvien3','Tran Cong Ccccccccccc','1990-01-09',3,2),
	('00004','Quantrivien4@gmail.com','Nhanvien4','Le Huyen Tran','1996-10-19',4,2),
	('00005','Quantrivien5@gmail.com','Nhanvien5','Mai Châu Anh','1995-01-29',5,2),
	('00006','Quantrivien6@gmail.com','Nhanvien6','Lý Công Uẩn','1999-01-12',6,3),
	('00007','Quantrivien7@gmail.com','Nhanvien7','Mai Văn Ý','1997-02-22',7,3),
	('00008','Quantrivien8@gmail.com','Nhanvien8','Phan Đăng Dươnggggg','2000-01-09',8,3),
	('00009','Quantrivien9@gmail.com','Nhanvien9','Chu Huyền Trang','2001-12-22',9,3),
    ('00010','Quantrivien10@gmail.com','Nhanvien10','Đinh Văn Tùng','1992-04-15',10,4),
    ('00011','Quantrivien11@gmail.com','Nhanvien11','Đinh Văn Tùng','1992-04-15',10,4),
    ('00012','Quantrivien12@gmail.com','Nhanvien12','Đinh Văn Tùng','1992-04-15',10,4),
    ('00013','Quantrivien13@gmail.com','Nhanvien13','Đinh Văn Tùng','1992-04-15',10,4),
    ('00014','Quantrivien14@gmail.com','Nhanvien14','Đinh Văn Tùng','1992-04-15',10,4),
    ('00015','Quantrivien15@gmail.com','Nhanvien15','Đinh Văn Tùng','1992-04-15',10,4),
    ('00016','admin@gmail.com','Nhanvien16','Đinh Văn Tùng','1992-04-15',10,4);
INSERT INTO `Group` (GroupID,GroupName,CreatorID,CreateDate)
VALUE
	('01','Grab Vietnam','0001','2000-02-02'),
	('02','NFQ Asia','0002','2002-03-12'),
	('03','Tiki','0003','2003-01-09'),
	('04','Knorex','0004','2010-10-03'),
	('05','HARAVAN','0005','2011-02-02'),
	('06','LG Development Center Vietnam','0006','2012-03-24'),
	('07','Lazada','0007','2000-08-21'),
	('08','Shoppee','0008','2000-07-27'),
	('09','ZALORA Group.','0009','2009-12-02'),
	('10','Giao Hàng Tiết Kiệm','0010','2010-02-02');
  
INSERT INTO `GroupAccount` (GroupID,AccountID,JoinDate)
VALUES
	('01','00001','2020-01-02'),
	('02','00002','2020-07-25'),
	('03','00003','2022-09-13'),
	('04','00004','2021-01-02'),
	('05','00005','2020-10-22'),
	('06','00006','2018-12-02'),
	('07','00007','2022-02-22'),
	('08','00008','2021-03-24'),
	('09','00008','2019-12-12'),
    ('09','00011','2019-12-12'),
    ('09','00012','2019-12-12'),
    ('09','00013','2019-12-12'),
    ('09','00014','2019-12-12'),
    ('09','00015','2019-12-12'),
    ('09','00016','2019-12-12'),
	('10','00010','2020-12-29'),
	('10','00011','2020-12-29'),
    ('10','00012','2020-12-29'),
    ('10','00013','2020-12-29'),
    ('10','00014','2020-12-29'),
    ('10','00015','2020-12-29'),
    ('10','00012','2020-12-29'),
    ('10','00011','2020-12-29');

    
INSERT INTO `TypeQuestion`(TypeID,TypeName)
VALUES
	('011','Essay'),
	('012','Multiple-Choice');
    
    
INSERT INTO `CategoryQuestion`(CategoryID,CategoryName)
VALUES
	('01','Java'),
	('02','.NET'),
	('03','SQL'),
	('04','Postman'),
	('05','Ruby');
    
INSERT INTO `Question`(QuestionID,Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUES
	('01','Content1','01','012','0001','2022-01-01'),
	('02','Content2','02','011','0002','2022-02-22'),
	('03','Content3','03','012','0003','2022-03-01'),
	('04','Content4','04','011','0004','2022-04-01'),
	('05','Content5','05','011','0005','2022-05-02'),
	('06','Content6','04','011','0006','2022-06-01'),
	('07','Content7','03','012','0007','2022-07-01'),
	('08','Content8','02','011','0008','2022-08-01'),
	('09','Content9999','01','012','0009','2022-09-01'),
	('010','Content100000000000000000000000000000000000','05','011','0010','2022-10-22'),
    ('11','Content00','02','011','0008','2022-08-04'),
    ('12','Content12','02','011','0009','2022-08-02'),
    ('13','Content13','02','011','0008','2022-08-03');
    
INSERT INTO `Answer` (AnswerID,Content,QuestionID,isCorrect)
VALUES
	('0120','content9999','01',TRUE),
	('0121','content99998','01',TRUE),
	('0111','content1','02',TRUE),
	('0112','content2','03',TRUE),
	('0113','content3','04',FALSE),
	('0114','content4','05',TRUE),
	('0115','content5','01',TRUE),
	('0116','content6','02',FALSE),
	('0117','content7','03',TRUE),
	('0118','content8','04',FALSE),
	('0119','content100000000000000000000000000000000000','05',TRUE);

INSERT INTO Exam (ExamID,`Code`,Title,CategoryIDi,Duration,CreatorID,CreateDate)
VALUES('101','Code ABC1','Title1','01','90:00:00','0001','2022-02-04'),
	('102','Code ABC2','Title2','02','90:00:00','0002','2021-03-07'),
	('103','Code ABC3','Title3','03','120:00:00','0003','2013-07-04'),
	('104','Code ABC4','Title4','04','180:00:00','0004','2022-06-05'),
	('105','Code ABC5','Title5','05','45:00:00','0005','2018-12-09'),
	('106','Code ABC6','Title6','04','15:00:00','0006','2022-11-04'),
	('107','Code ABC7','Title7','03','60:00:00','0007','2019-09-23'),
	('108','Code ABC8','Title8','02','25:00:00','0008','2022-06-06'),
	('109','Code ABC9','Title9','01','10:00:00','0009','2010-08-07'),
	('110','Code ABC10','Title10','05','5:00:00','0010','2022-10-08');


INSERT INTO ExamQuestion (ExamID,QuestionID)
VALUE('100','01'),
	('101','02'),
	('102','03'),
	('103','04'),
	('104','05'),
	('105','06'),
	('106','07'),
	('107','08'),
	('108','09'),
	('109','010');
    

