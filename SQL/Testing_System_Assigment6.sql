-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó

DROP PROCEDURE IF EXISTS SP_ACCOUNT;

DELIMITER $$
	CREATE PROCEDURE SP_ACCOUNT (IN deparmentName VARCHAR(50))
		BEGIN
			SELECT A.AccountID,A.Email,A.Username,A.FullName
            FROM `Department`D JOIN  `Account`A
            ON A.DepartmentID = D.DepartmentID
            WHERE D.DepartmentName = deparmentName;
        END $$
DELIMITER ;

CALL SP_ACCOUNT('Kế Toán');

-- Question 2: Tạo store để `in` ra số lượng `account` trong mỗi `group`

DROP PROCEDURE IF EXISTS SP_SLACCOUNT;

DELIMITER $$
	CREATE PROCEDURE SP_SLACCOUNT (IN GroupAcountID TINYINT)
		BEGIN
			SELECT A.AccountID,A.Email,A.Username,A.FullName,COUNT(A.AccountID) AS SLAC
            FROM `Account`A JOIN  `GroupAccount`G
            ON A.AccountID = G.AccountID
            WHERE G.GroupID = GroupAcountID;
        END $$
DELIMITER ;

CALL SP_SLACCOUNT('10');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại

DROP PROCEDURE IF EXISTS SP_QUESTION;

DELIMITER $$
	CREATE PROCEDURE SP_QUESTION ()
		BEGIN
			SELECT T.*,Q.*,COUNT(T.TypeID)
            FROM `TypeQuestion`T JOIN  `Question`Q
            ON T.TypeID = Q.TypeID
            WHERE MONTH(Q.CreateDate) = MONTH(current_date()) AND YEAR(Q.CreateDate) = YEAR(current_date());
        END $$
DELIMITER ;

CALL SP_QUESTION ;

--	Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP PROCEDURE IF EXISTS SP_QUESTION111;
DELIMITER $$
	CREATE PROCEDURE SP_QUESTION111 ()
		BEGIN
			SELECT T.*,COUNT(Q.TypeID) AS SLCH
            FROM `TypeQuestion`T JOIN  `Question`Q
            ON T.TypeID = Q.TypeID
            GROUP BY  T.TypeID LIMIT 1;
        END $$
DELIMITER ;

CALL SP_QUESTION111 ;


-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question

DROP PROCEDURE IF EXISTS SP_QUESTIONSONG;
DELIMITER $$
	CREATE PROCEDURE SP_QUESTIONSONG(OUT TIM_ID TINYINT)
		BEGIN
			WITH CTE_CountID AS (
			SELECT COUNT(Q.TypeID) AS SL FROM `Question` Q
			GROUP BY Q.TypeID)
			SELECT Q.TypeID INTO TIM_ID FROM `Question` Q
			GROUP BY Q.TypeID
			HAVING COUNT(q.TypeID) = (SELECT MAX(SL) FROM CTE_CountID);
		END$$
DELIMITER ;
-- CÂU 4 
SET @TIM_ID = 0;
CALL SP_QUESTIONSONG (@TIM_ID);
SELECT @TIM_ID;
-- CÂU 5 
SET @ID =0;
CALL SP_QUESTIONSONG(@ID);
SELECT * FROM typequestion WHERE TypeID = @ID;



-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS TIM_CHUOI;
DELIMITER $$
	CREATE PROCEDURE TIM_CHUOI (IN TIMTEN VARCHAR(255))
		BEGIN
			SELECT G.GroupName FROM `Group` G WHERE G.GroupName
			LIKE CONCAT("%",TIMTEN,"%")
			UNION
			SELECT A.Username FROM `Account` A WHERE A.Username
			LIKE CONCAT("%",TIMTEN,"%");
        END $$
DELIMITER ;

CALL TIM_CHUOI ('Gra') ;

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công

DROP PROCEDURE IF EXISTS ADD_CHUOI;
DELIMITER $$
	CREATE PROCEDURE ADD_CHUOI( IN TIMTEN VARCHAR(50),IN TIMGM VARCHAR(50),IN TENNE VARCHAR(500))
		BEGIN
			DECLARE Username VARCHAR(50)  ;
			DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 1 ;
			DECLARE PositionID TINYINT UNSIGNED DEFAULT 1;
			DECLARE CreateDate DATETIME DEFAULT now();
			INSERT INTO `account` (`Email`, `Username`, `FullName`,`DepartmentID`, `PositionID`, `CreateDate`)
			VALUES (TIMGM, TENNE, TIMTEN, DepartmentID, PositionID, CreateDate);
		END$$
DELIMITER ;
CALL ADD_CHUOI('TRẦN THANH SONG ',' THANHSONG21082000@GMAIL.COM','thanhsong2k');

SELECT * FROM `account`;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

-- CÂU NÀY EM LÀM KO CẦN DÙNG IF ELSE 

DROP PROCEDURE IF EXISTS ADD_SELECT;
DELIMITER $$
	CREATE PROCEDURE ADD_SELECT( IN TIMTEN VARCHAR(50))
	BEGIN
		WITH `CTE_SELECT` AS(
		SELECT Q.QuestionID,Q.Content,T.TypeName ,length(Q.Content) AS LENGHT_CONTENT
		FROM `Question`Q JOIN `TypeQuestion`T 
		ON  T.TypeId = Q.TypeID
		WHERE T.TypeName = TIMTEN )

		SELECT * FROM `CTE_SELECT`
		WHERE LENGHT_CONTENT= (SELECT MAX(LENGHT_CONTENT) FROM `CTE_SELECT`);

	END$$
DELIMITER ;
CALL ADD_SELECT('essay');
CALL ADD_SELECT('multiple-choice');

-- // CÁCH NÀY CỦA MENTOR LÀ FIXX CỨNG LUÔN TÌM IF ELSE 
DROP PROCEDURE IF EXISTS sp_getMaxNameQuesFormNameType;
DELIMITER $$
CREATE PROCEDURE sp_getMaxNameQuesFormNameType( IN var_Choice VARCHAR(50))
	BEGIN
		DECLARE v_TypeID TINYINT UNSIGNED;
		SELECT tq.TypeID INTO v_TypeID FROM typequestion tq
		WHERE tq.TypeName = var_Choice;
		
			IF var_Choice = 'Essay' THEN
			WITH CTE_LengContent AS(
			SELECT length(q.Content) AS leng FROM question q
			WHERE TypeID = v_TypeID)
			SELECT * FROM question q
			WHERE TypeID = v_TypeID
			AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
            
			ELSEIF var_Choice = 'Multiple-Choice' THEN
			WITH CTE_LengContent AS(
			SELECT length(q.Content) AS leng FROM question q
			WHERE TypeID = v_TypeID)
			SELECT * FROM question q
			WHERE TypeID = v_TypeID
			AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
		END IF;
	END$$
DELIMITER ;


CALL sp_getMaxNameQuesFormNameType('essay');
CALL sp_getMaxNameQuesFormNameType('multiple-choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

-- test xóa khi chưa dùng PROCEDURE
DELETE FROM Exam WHERE ExamID = '101';

DROP PROCEDURE IF EXISTS ADD_ExamID;
	DELIMITER $$
		CREATE PROCEDURE ADD_ExamID( IN ADD_ID VARCHAR(50))
		BEGIN
			DELETE FROM ExamQuestion WHERE ExamID = ADD_ID;
			DELETE FROM Exam WHERE ExamID = ADD_ID;
		END$$
	DELIMITER ;
    
CALL ADD_ExamID('102');
-- check lại bảng
SELECT *FROM Exam;
SELECT *FROM ExamQuestion;

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
-- TÌM EXAME 3 NĂM TRC (1)

SELECT * FROM exam 
WHERE year(current_date())- year(CreateDate) >= 3;

-- xóa các exam đó đi

DELETE FROM exam WHERE year(current_date())- year(CreateDate) >= 3;

-- check lại xóa chưa  rồi lại SELECT 1 lần (1) xem còn không 
SELECT *FROM Exam;
SELECT * FROM exam 
WHERE year(current_date())- year(CreateDate) >= 3; -- đã xóa .. chạy lại database để làm PROCEDURE

-- bài làmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
DROP PROCEDURE IF EXISTS ADD_ExamID;
	DELIMITER $$
		CREATE PROCEDURE ADD_ExamID( )
		BEGIN
        -- tìm kiếm và xóa bảng 
			DELETE FROM Exam WHERE year(current_date())- year(CreateDate) >= 3; 
            
		-- thống kê lại cái đã xóa 
		END$$
	DELIMITER ;
    
CALL ADD_ExamID();
-- check lại bảng
SELECT *FROM Exam;
SELECT *FROM ExamQuestion;

-- câu 9 mentor khác câu 9 của em nên em mượn tạm

DROP PROCEDURE IF EXISTS sp_DeleteExamWithID;
	DELIMITER $$
		CREATE PROCEDURE sp_DeleteExamWithID (IN in_ExamID TINYINT UNSIGNED)
			BEGIN
			DELETE FROM examquestion WHERE ExamID = in_ExamID;
			DELETE FROM Exam WHERE ExamID = in_ExamID;
			END$$
	DELIMITER ;
CALL sp_DeleteExamWithID (5);

SELECT *FROM Exam;

DROP PROCEDURE IF EXISTS SP_DeleteExamBefore3Year;
	DELIMITER $$
		CREATE PROCEDURE SP_DeleteExamBefore3Year()
			BEGIN

				-- Khai báo biến 
				DECLARE v_ExamID TINYINT UNSIGNED;
				DECLARE v_CountExam TINYINT UNSIGNED DEFAULT 0;
				DECLARE v_CountExamquestion TINYINT UNSIGNED DEFAULT 0;
				DECLARE i TINYINT UNSIGNED DEFAULT 1;
				DECLARE v_print_Del_info_Exam VARCHAR(50) ;
				-- Tạo bảng 
				DROP TABLE IF EXISTS ExamIDBefore3Year_Temp;
				CREATE TABLE ExamIDBefore3Year_Temp(
				ID INT PRIMARY KEY AUTO_INCREMENT,
				ExamID INT);
				-- Insert dữ liệu vào
				INSERT INTO ExamIDBefore3Year_Temp(ExamID)
				SELECT e.ExamID FROM exam e WHERE (year(now()) - year(e.CreateDate)) >2;
				-- Lấy số lượng số Exam và ExamQuestion cần xóa.
				SELECT count(1) INTO v_CountExam FROM ExamIDBefore3Year_Temp;
				SELECT count(1) INTO v_CountExamquestion FROM examquestion ex
				INNER JOIN ExamIDBefore3Year_Temp et ON ex.ExamID = et.ExamID;
				-- Thực hiện xóa trên bảng Exam và ExamQuestion 
                
				WHILE (i <= v_CountExam) DO

					SELECT ExamID INTO v_ExamID FROM ExamIDBefore3Year_Temp WHERE ID=i limit 1;
					CALL sp_DeleteExamWithID(v_ExamID);
					SET i = i +1;
                    
				END WHILE;

				-- in cái đã xóa 
				SELECT * FROM ExamIDBefore3Year_Temp;
				-- In câu thông 
                
				SELECT CONCAT("đã xóa ",v_CountExam," IN Exam AND ", v_CountExamquestion ," IN ExamQuestion") INTO v_print_Del_info_Exam;  
                -- đây là cái thông báo in ra
				SIGNAL SQLSTATE '45000' -- in ra cái thông báo do cái này -- thế cái danh sách xóa đâu an h
				SET MESSAGE_TEXT = v_print_Del_info_Exam ; 
				-- Xóa bảng tạm sau khi hoàn thành
				DROP TABLE IF EXISTS ExamIDBefore3Year_Temp;
			END$$
	DELIMITER ;

Call SP_DeleteExamBefore3Year();


-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc


DROP PROCEDURE IF EXISTS SP_XOAPHONGBAN;
	DELIMITER $$
		CREATE PROCEDURE SP_XOAPHONGBAN(IN TenPB VARCHAR(30))
			BEGIN
			DECLARE v_DepartmentID VARCHAR(30) ;
			SELECT D1.DepartmentID INTO v_DepartmentID FROM department D1 
            WHERE D1.DepartmentName= TenPB;
			UPDATE `account` A SET A.DepartmentID = '09' 
            WHERE A.DepartmentID = v_DepartmentID;
			DELETE FROM department d WHERE d.DepartmentName = TenPB;
			END$$
	DELIMITER ;
    
Call SP_XOAPHONGBAN('Phòng Tester');

SELECT * FROM `account`;

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

-- CÁCH ĐƠN GIẢN FIXX CỨNG  NẾU YÊU CẦU MỖI NẰM THÌ TẠO CTE RỒI LIÊN KẾT THEO THÁNG MỖI NĂM 
DROP PROCEDURE IF EXISTS SP_THEOTHANG;
	DELIMITER $$
		CREATE PROCEDURE SP_THEOTHANG()
			BEGIN
				SELECT month('2022-01-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q1 WHERE CreateDate  BETWEEN '2022-01-01 ' AND '2022-01-31' UNION ALL
				SELECT month('2022-02-02') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q2 WHERE CreateDate  BETWEEN '2022-02-01 ' AND '2022-02-28' UNION ALL
				SELECT month('2022-03-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q3 WHERE CreateDate  BETWEEN '2022-03-01 ' AND '2022-03-31' UNION ALL
				SELECT month('2022-04-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q4 WHERE CreateDate  BETWEEN '2022-04-01 ' AND '2022-04-30' UNION ALL
				SELECT month('2022-05-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q5 WHERE CreateDate  BETWEEN '2022-05-01 ' AND '2022-05-31' UNION ALL
				SELECT month('2022-06-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q6 WHERE CreateDate  BETWEEN '2022-06-01 ' AND '2022-06-30' UNION ALL
				SELECT month('2022-07-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q7 WHERE CreateDate  BETWEEN '2022-07-01 ' AND '2022-07-31' UNION ALL
				SELECT month('2022-08-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q8 WHERE CreateDate  BETWEEN '2022-08-01 ' AND '2022-08-31' UNION ALL
				SELECT month('2022-09-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q9 WHERE CreateDate  BETWEEN '2022-09-01 ' AND '2022-09-30' UNION ALL
				SELECT month('2022-10-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q10 WHERE CreateDate  BETWEEN '2022-10-01 ' AND '2022-10-31'UNION ALL
				SELECT month('2022-11-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q11 WHERE CreateDate  BETWEEN '2022-11-01 ' AND '2022-11-30'UNION ALL
				SELECT month('2022-12-01') AS THÁNG ,COUNT(QuestionID) AS SOLUONG FROM `Question`Q12 WHERE CreateDate  BETWEEN '2022-12-01 ' AND '2022-12-31';
			END$$
	DELIMITER ;
Call SP_THEOTHANG();

-- CÁCH CỦA MENTOR 
DROP PROCEDURE IF EXISTS sp_CountQuesInMonth;
	DELIMITER $$
		CREATE PROCEDURE sp_CountQuesInMonth()
			BEGIN
			WITH `CTE_12Months` AS (
				SELECT 1 AS MONTH
				UNION SELECT 2 AS MONTH
				UNION SELECT 3 AS MONTH
				UNION SELECT 4 AS MONTH
				UNION SELECT 5 AS MONTH
				UNION SELECT 6 AS MONTH
				UNION SELECT 7 AS MONTH
				UNION SELECT 8 AS MONTH
				UNION SELECT 9 AS MONTH
				UNION SELECT 10 AS MONTH
				UNION SELECT 11 AS MONTH
				UNION SELECT 12 AS MONTH
			)
			SELECT M.MONTH, COUNT(MONTH(Q.CreateDate)) AS SL FROM `CTE_12Months` M
            
			LEFT JOIN (SELECT * FROM question Q WHERE year(Q.CreateDate) = year(now())) Q
	
			ON M.MONTH = MONTH(Q.CreateDate)
			GROUP BY M.MONTH;
			END$$
	DELIMITER ;
Call sp_CountQuesInMonth();

	

-- 	Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
--  (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")


DROP PROCEDURE IF EXISTS SP_6THANGGANNHAT;
	DELIMITER $$
	CREATE PROCEDURE SP_6THANGGANNHAT()
		BEGIN
			WITH `CTE_6THANGGANNHAT` AS (
            
--            TÌM KIẾM THÁNG  GẦN NHẤT THEO HÀM  (DATE_SUB(date, INTERVAL value interval) 
            
				SELECT MONTH(DATE_SUB(NOW(), INTERVAL 5 MONTH)) AS `MONTH`, YEAR(DATE_SUB(NOW(), INTERVAL 5 MONTH)) AS `YEAR`
				UNION
				SELECT MONTH(DATE_SUB(NOW(), INTERVAL 4 MONTH)) AS `MONTH`,YEAR(DATE_SUB(NOW(), INTERVAL 4 MONTH)) AS `YEAR`
				UNION
				SELECT MONTH(DATE_SUB(NOW(), INTERVAL 3 MONTH)) AS` MONTH`,YEAR(DATE_SUB(NOW(), INTERVAL 3 MONTH)) AS `YEAR`
				UNION
				SELECT MONTH(DATE_SUB(NOW(), INTERVAL 2 MONTH)) AS `MONTH`,YEAR(DATE_SUB(NOW(), INTERVAL 2 MONTH)) AS `YEAR`
				UNION
				SELECT MONTH(DATE_SUB(NOW(), INTERVAL 1 MONTH)) AS `MONTH`,YEAR(DATE_SUB(NOW(), INTERVAL 1 MONTH)) AS `YEAR`
				UNION
				SELECT MONTH(NOW()) AS MONTH, YEAR(NOW()) AS `YEAR`
				)
-- CASE
--    WHEN condition1 THEN result1
--    WHEN condition2 THEN result2
--    WHEN conditionN THEN resultN
--    ELSE result
-- END
			SELECT CTE.MONTH,CTE.YEAR, 
				CASE
            	WHEN COUNT(QuestionID) = 0 THEN 'không có câu hỏi nào trong tháng'
				ELSE COUNT(QuestionID)
				END AS SL
			FROM `CTE_6THANGGANNHAT` CTE
            -- LÚC ĐẦU DÙNG INNER THIẾU THÁNG 1O
			LEFT JOIN (SELECT * FROM question WHERE CreateDate >= DATE_SUB(NOW(),INTERVAL 6 MONTH) 
            AND CreateDate <= NOW()) AS Sub_Question ON CTE.MONTH = MONTH(CreateDate)
            -- INTERVAL ĐẾM TRONG 6 THÁNG 
			GROUP BY CTE.MONTH
			ORDER BY CTE.MONTH ASC;
		END$$
	DELIMITER ;

CALL SP_6THANGGANNHAT;