-- Chú ý: Tạo 1 File SQL đặt tên là "Testing_System_Assignment_5"
-- Exercise 1: Tiếp tục với Database Testing System
-- (Sử dụng subquery hoặc CTE)


-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale

CREATE OR REPLACE VIEW `V_DSNV_View` AS  
SELECT D.DepartmentName, D.DepartmentId,A.AccountID,A.FullName
FROM `Account`A JOIN `Department`D  ON  A.DepartmentId = D.DepartmentId
WHERE DepartmentName = 'Phòng Tester';
-- thay vì sale thì làm thành phòng tester do dl nhập đầu vào khác nhau 
 
SELECT * FROM  `V_DSNV_View` ORDER BY AccountID;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE  VIEW `V_TTAC_SLGR` AS(
SELECT A.AccountId, A.Username, A.PositionID , COUNT(G.GroupID) AS SLAC
FROM `Account`A JOIN `GroupAccount`G ON A.AccountId = G.AccountId
GROUP BY A.Username );

SELECT * FROM `V_TTAC_SLGR` ORDER BY  SLAC DESC  ;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
-- được coi là quá dài) và xóa nó đi


CREATE VIEW `V_TTAC_SLGR` AS(
SELECT A.AnswerID AS TENTK,LENGTH(A.Content) AS KTTK
FROM `Question`Q JOIN `Answer`A ON Q.QuestionID= A.QuestionID
WHERE LENGTH(A.Content) > 8) ;

SELECT*FROM `V_TTAC_SLGR`;

SELECT TENTK FROM `V_TTAC_SLGR`;
-- // cái này làm nhưng ko chạy đc 
-- DELETE FROM `V_TTAC_SLGR` WHERE KTTK > '8' ;
DROP VIEW `V_TTAC_SLGR`;


CREATE VIEW `V_TTAC_1` AS(
SELECT QuestionID,Content,CategoryID,TypeID,CreatorID,CreateDate ,LENGTH(Content) AS KTTK
FROM `Question`Q
WHERE LENGTH(Content) > 8) ;

-- DELETE FROM `V_TTAC_1` WHERE KTTK > 8;

SELECT*FROM `V_TTAC_1`;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất

DROP VIEW IF EXISTS `V_NV_SL`;
CREATE VIEW `V_NV_SL` AS
SELECT D.DepartmentID, D.DepartmentName, COUNT(A.DepartmentID) AS 'SO LUONG'
FROM `Department` D JOIN  `Account` A ON A.DepartmentID = D.DepartmentID
GROUP BY 	A.DepartmentID
ORDER BY	COUNT(A.DepartmentID) DESC
LIMIT 		1;

SELECT*FROM `V_NV_SL`;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
DROP VIEW IF EXISTS `V_HO_NGUYEN`;
CREATE VIEW `V_HO_NGUYEN` AS
SELECT A.*
FROM `Exam`E JOIN `Account` A ON E.CreatorID = A.AccountID
WHERE 		A.FullName LIKE 'Nguyễn%';

SELECT*FROM `V_HO_NGUYEN`;