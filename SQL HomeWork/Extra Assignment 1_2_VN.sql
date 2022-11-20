-- ghi chú tạo cơ sở dữ liệu

DROP DATABASE IF EXISTS Assigment2 ;

CREATE DATABASE Assigment2;

USE Assigment2;

CREATE TABLE `Trainee` (
    TraineeID 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name	 		VARCHAR(255) NOT NULL UNIQUE,
    Birth_Date 			DATETIME ,
    Gender 				ENUM('Male', 'Female', 'Unknown'),
    ET_IQ 				TINYINT, 
						CHECK (ET_IQ >= 0 AND ET_IQ <= 20 ),
	ET_Gmath			TINYINT,
						CHECK (ET_Gmath >= 0 AND ET_Gmath <= 20),
	ET_English 			INT,
						CHECK (ET_English >= 0 AND ET_English <= 50),
	Training_Class  	TINYINT UNSIGNED NOT NULL,
    Evaluation_Notes	VARCHAR(255)
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique
-- THÊM MỚI MỘT BẢNG CẬP NHẬT 

ALTER TABLE `Trainee` 	
ADD VTI_Account VARCHAR(255) NOT NULL UNIQUE ;

CREATE TABLE `fresher_1`(
	ID 					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(255) NOT NULL UNIQUE,
	`Code`				VARCHAR(5) NOT NULL UNIQUE,
	ModifiedDate		DATETIME DEFAULT NOW()
);

CREATE TABLE `fresher_2`(
	ID 					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	BirthDate			DATETIME DEFAULT NOW(),
	Gender				ENUM('0','1','NULL'), -- Là Integer gồm 3 giá trị: 0 là Male, 1là Female, NULL là Unknown
	IsDeletedFlag		BOOLEAN -- Có 2 giá trì: 0 là đang hoạt động, 1 là đã xóa.
);


INSERT INTO `Trainee` (TraineeID,Full_Name,Birth_Date,Gender,ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes,VTI_Account)
VALUES
	('111','Song','2000-08-21','Male','8','9','8','33','TAKENOT','VTI_Account1'),
    ('112','Sơn','2001-08-01','Male','7','8','9','33','TAKENOT1','VTI_Account2'),
    ('113','Thanh','2002-02-21','Female','5','6','7','33','TAKENOT2','VTI_Account3'),
    ('114','Thủy','1999-07-21','Female','8','8','9','33','TAKENOT3','VTI_Account4'),
    ('115','TRANG','2003-06-11','Female','9','10','5','33','TAKENOT4','VTI_Account5'),
    ('116','Quốc','2004-08-22','Male','7','7','7','33','TAKENOT5','VTI_Account6'),
    ('117','Minh','2000-11-23','Male','8','9','7.5','33','TAKENOT6','VTI_Account7'),
    ('118','Chiến','1998-08-21','Male','8','8','8','33','TAKENOT7','VTI_Account8'),
    ('119','Quang','2001-07-24','Male','8','9','10','33','TAKENOT8','VTI_Account9'),
    ('120','Dũng','1993-11-28','Male','10','7','6','33','TAKENOT9','VTI_Account10'),
    ('121','Hoàng','2000-12-21','Male','8','6','7','33','TAKENOT10','VTI_Account11'),
    ('122','Đại','2001-01-21','Male','6','8','9','33','TAKENOT11','VTI_Account12');
    
INSERT INTO `fresher_1` (ID,`Name`,`Code`,ModifiedDate)
VALUES
	('223','Quang','code1','2020-10-19'),
	('224','Hà','code2','2021-10-19'),
	('225','Đại','code3','2019-1-19'),
	('226','Dũng','code4','2022-10-9'),
	('227','Trí','code5','2018-10-19'),
	('228','Long','code6','2020-07-06'),
	('229','Sơn','code7','2010-10-20'),
	('2210','Trung','code8','2020-06-06'),
	('2211','Quân','code9','2003-11-19'),
	('2212','Minh','codec','2020-12-19'),
	('2213','Hải','codeb','2020-03-19');

INSERT INTO `fresher_2` (ID,BirthDate,Gender,IsDeletedFlag)
VALUES('3310','2020-10-19','0','0'),
('330','2020-02-02','1',1),
('331','2021-09-13','NULL',0),
('332','2019-07-23','0',1),
('333','2021-08-21','1',1),
('334','2011-11-13','NULL',0),
('335','2018-02-28','1',1),
('336','2022-04-13','0',0),
('337','2011-02-24','NULL',1),
('338','2021-12-13','0',1),
('339','2020-09-13','1',0);