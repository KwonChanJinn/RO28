USE Testing_System_Assigment2;

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước

DROP TRIGGER IF EXISTS trg_check;

	DELIMITER $$
		CREATE TRIGGER trg_check
        BEFORE INSERT on `Group`
        FOR EACH ROW
		BEGIN
			DECLARE v_createdate DATETIME;
		    SET v_createdate = date_sub(now(), INTERVAL 1 YEAR );
            IF (NEW.CreateDate <= v_createdate ) THEN
				SIGNAL SQLSTATE '34567' 
				SET MESSAGE_TEXT = 'KHÔNG THỂ NHẬP VÀO ĐƯỢC NGÀY THÁNG LỚN HƠN 1 NĂM ';
            END IF;
		END$$
	DELIMITER ;
    
INSERT INTO `Group`(GroupID,GroupName,CreatorID,CreateDate )
VALUE ('11','Grappu000u','11','2002-03-12 00:00:00');
    
SELECT * FROM `group`;

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"

DROP TRIGGER IF EXISTS trg_check2;

	DELIMITER $$
		CREATE TRIGGER trg_check2
        BEFORE INSERT on `Account`
        FOR EACH ROW
		BEGIN
			DECLARE NHAPID TINYINT;
			SELECT d.DepartmentID INTO NHAPID FROM department d WHERE d.DepartmentName = 'Kế Toán';
			IF (NEW.DepartmentID = NHAPID) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Cant add more User to Sale Department'; 
            END IF;
            
		END$$
	DELIMITER ;
    
INSERT INTO `Account` (AccountID,Email,Username,FullName,CreateDate,DepartmentID, PositionID)
VALUE ('00017','Quantrivien1200@gmail.com','Nhanvien17','Tran Van An','2003-01-09',1,1);
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

DROP TRIGGER IF EXISTS trg_check3;

DELIMITER $$
	CREATE TRIGGER trg_check3
	BEFORE INSERT on `GroupAccount`
	FOR EACH ROW
		BEGIN
			DECLARE NHAPID TINYINT;
			SELECT count(GA.GroupID) INTO NHAPID FROM GroupAccount GA
			WHERE GA.GroupID = NEW.GroupID;
			IF (NHAPID >6) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'KHÔNG THỂ THÊM VÀO NỮA VÌ ĐÃ QUÁ SỐ LƯỢNG';
			END IF ;
		END$$
DELIMITER ;
            
 SELECT * FROM GroupAccount;
-- `GroupAccount` (GroupID,AccountID,JoinDate)

INSERT INTO `GroupAccount` (GroupID,AccountID,JoinDate)
VALUE ('10','5','2022-01-03 00:00:00');

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

DROP TRIGGER IF EXISTS trg_check4;

DELIMITER $$
	CREATE TRIGGER trg_check4
	BEFORE INSERT ON `ExamQuestion`
	FOR EACH ROW
		BEGIN
			DECLARE v_NhapID TINYINT;
			SELECT COUNT(E.ExamID) INTO v_NhapID FROM `ExamQuestion` E
			WHERE E.ExamID = NEW.ExamID;
			IF (v_NhapID >10) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'KHÔNG THỂ THÊM VÀO NỮA VÌ ĐÃ QUÁ SỐ LƯỢNG';
			END IF ;
		END$$
DELIMITER ;
            
SELECT * FROM GroupAccount;
-- `GroupAccount` (GroupID,AccountID,JoinDate)
SELECT * FROM  ExamQuestion;

INSERT INTO ExamQuestion (ExamID,questionID)
VALUE (110, 04);

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó

DROP TRIGGER IF EXISTS trg_check5 ;
	DELIMITER $$
		CREATE TRIGGER trg_check5
		BEFORE DELETE ON `Account`
		FOR EACH ROW
			BEGIN
				DECLARE v_Email VARCHAR(50);
				SET v_Email = 'admin@gmail.com';
					IF (OLD.Email = v_Email) THEN
					SIGNAL SQLSTATE '12345'
					SET MESSAGE_TEXT = 'không thể xóa tài khoản addmin';
					END IF;
			END $$
	DELIMITER ;
    
DELETE FROM `account` WHERE Email = 'admin@gmail.com';
DELETE FROM `account` WHERE Email = 'Quantrivien15@gmail.com';
SELECT * FROM `account`;

-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

DROP TRIGGER IF EXISTS trg_check6;
DELIMITER $$
	CREATE TRIGGER trg_check6
	BEFORE INSERT ON `Account`
	FOR EACH ROW
		BEGIN
		DECLARE NO_ID TINYINT;
		SELECT D.DepartmentID INTO NO_ID FROM Department D WHERE D.DepartmentName = 'waiting Department';
			IF (NEW.DepartmentID IS NULL ) THEN
			SET NEW.DepartmentID = NO_ID;
			END IF;
		END $$
DELIMITER ;

INSERT INTO `Account` (AccountID,Email,Username,FullName,CreateDate,DepartmentID, PositionID)
VALUE                 ('00017','admin111@gmail.com','Nhanvien17','Đinh Văn Tùng','1992-04-15',NULL,4);

SELECT * FROM `Account`;

SELECT D.DepartmentID FROM Department D WHERE D.DepartmentName = 'waiting Department';

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.

DROP TRIGGER IF EXISTS trg_check7;
DELIMITER $$
	CREATE TRIGGER trg_check7
	BEFORE INSERT ON `answer`
	FOR EACH ROW
		BEGIN

		DECLARE v_demsldapan TINYINT;
		DECLARE v_soluongdapandungkolonhon2 TINYINT;
        
		SELECT COUNT(A.QuestionID) INTO v_demsldapan FROM Answer A 
        WHERE A.QuestionID = NEW.QuestionID;
        
		SELECT COUNT(1) INTO v_soluongdapandungkolonhon2 FROM Answer A 
        WHERE A.QuestionID = NEW.QuestionID AND A.isCorrect = NEW.isCorrect;
        
			IF (v_demsldapan > 4 ) OR (v_soluongdapandungkolonhon2 >2) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'ĐÃ VƯỢT QUÁ SỐ LƯỢNG CÂU TRẢ LỜI';

			END IF;
		END $$
DELIMITER ;

INSERT INTO `Answer` (AnswerID,Content,QuestionID,isCorrect)
VALUES
	('0124','content2378','01',FALSE),
    ('0125','content230','01',FALSE),
    ('0127','content232','01',FALSE),
    ('0128','content234','01',FALSE),
    ('0129','content233','01',FALSE);
    
SELECT COUNT(1) FROM `Answer` ;
SELECT * FROM `Answer` ;


    
    
    
    
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database


DROP TRIGGER IF EXISTS trg_check8;
	DELIMITER $$
		CREATE TRIGGER trg_check8
		BEFORE INSERT ON `Account`
		FOR EACH ROW
			BEGIN
				IF NEW.Gender = 'Nam' THEN 
				SET NEW.Gender = 'M';
       
				ELSEIF NEW.Gender = 'Nu' THEN
				SET NEW.Gender = 'F';
				ELSEIF NEW.Gender = 'Chưa xác định' THEN
				SET NEW.Gender = 'U';
				END IF ;	

			END $$
	DELIMITER ;
    
INSERT INTO `Account` (AccountID,Email,Username,FullName,CreateDate,DepartmentID, PositionID,Gender)
VALUE
	('00019','Quantrivien19@gmail.com','Nhanvien19','Tran Van An','2003-01-09',1,1,'Nam');
    
    SELECT * FROM `Account`;
  -- xóa cột Gender  
    ALTER TABLE `Account`
    DROP COLUMN `Gender`;
    -- thêm mới cột gender
    ALTER TABLE `Account`
    ADD `Gender`VARCHAR (50);
    SELECT * FROM `Account`;


-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày


DROP TRIGGER IF EXISTS trg_check;

	DELIMITER $$
		CREATE TRIGGER trg_check
        BEFORE DELETE on `Exam`
        FOR EACH ROW
		BEGIN
			DECLARE v_createdate DATETIME;
			
            SET v_createdate = date_sub(now(), INTERVAL 2 day );
            
            IF (OLD.CreateDate > v_createdate ) THEN
				SIGNAL SQLSTATE '34567' 
				SET MESSAGE_TEXT = 'không phải 2 ngày  ';
            END IF;
            
		END$$
	DELIMITER ;
    
    
DELETE FROM Exam WHERE ExamID = '110';
DELETE FROM Exam WHERE ExamID = '106';
 

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào

DROP TRIGGER IF EXISTS trg_check10;
	DELIMITER $$
		CREATE TRIGGER trg_check10
		BEFORE UPDATE ON `question`
		FOR EACH ROW
			BEGIN
			DECLARE CountId TINYINT;
			SET CountId = -1;
			SELECT count(1) INTO CountId FROM `Examquestion` Ex
            WHERE Ex.QuestionID = NEW.QuestionID;
            
				IF (CountId != -1) THEN
				SIGNAL SQLSTATE '12345'

				SET MESSAGE_TEXT = 'không thể cập nhật 	';
				END IF ;
			END $$
	DELIMITER ;

UPDATE `question` 
SET `Content` = 'contentnnnnnnnnnn' 
WHERE (`QuestionID` = '13');

DROP TRIGGER IF EXISTS Trg_Check11;
	DELIMITER $$
		CREATE TRIGGER Trg_Check11

		BEFORE DELETE ON `Question`
		FOR EACH ROW
			BEGIN
			DECLARE CountId TINYINT;
			SET CountId = -1;
			SELECT count(1) INTO CountId FROM examquestion ex 
            WHERE ex.QuestionID = OLD.QuestionID;
				IF (CountId != -1) THEN
				SIGNAL SQLSTATE '12345'

				SET MESSAGE_TEXT = 'không thể xóa cái này ';
				END IF ;
			END $$
	DELIMITER ;
    
DELETE FROM `Question` WHERE (`QuestionID` = '1');

--  `Question`(QuestionID,Content,CategoryID,TypeID,CreatorID,CreateDate)
SELECT QuestionID,Content INTO Song FROM `Question`;
-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"

SELECT e.ExamID, e.`Code`, e.Title , 

	CASE
	WHEN Duration <= 30 THEN 'Short time'
	WHEN Duration <= 60 THEN 'Medium time'
	ELSE 'Longtime'
	END AS Duration, e.CreateDate, e.Duration

FROM exam e;
SELECT * FROM exam;

-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- 		Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- 		Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- 		Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher


SELECT Gr.GroupID, COUNT(Gr.GroupID), 
	CASE
	WHEN COUNT(Gr.GroupID) <= 5 THEN 'few'
	WHEN COUNT(Gr.GroupID) <= 20 THEN 'normal'
	ELSE 'higher'
	END AS the_number_user_amount
FROM Groupaccount Gr
GROUP BY Gr.GroupID
ORDER BY Gr.GroupID DESC;

-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"

SELECT D.DepartmentName, 
CASE
WHEN COUNT(A.DepartmentID) = 0 THEN 'Không có User'
ELSE COUNT(A.DepartmentID)
END AS SL

FROM Department D
LEFT JOIN `Account` A ON D.DepartmentID = A.DepartmentID
GROUP BY D.DepartmentID;