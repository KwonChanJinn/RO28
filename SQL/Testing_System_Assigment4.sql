-- Exercise 1: Join
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ

SELECT D.DepartmentID, D.DepartmentName , A.Username
FROM `Department` D
INNER JOIN `Account` A ON D.DepartmentID = A.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010

SELECT AccountID,FullName,Email,Username,DepartmentID FROM `Account` WHERE CreateDate < 2010-12-20;

-- Question 3: Viết lệnh để lấy ra tất cả các developer

SELECT PositionID,PositionName FROM `Position` WHERE PositionName ='Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

SELECT D.DepartmentID,D.DepartmentName ,A.PositionID,A.AccountID,COUNT(A.PositionID) AS SLNV
FROM `Department`D
JOIN `Account` A ON D.DepartmentID = A.DepartmentID
GROUP BY  A.PositionID
HAVING COUNT( A.PositionID) > 3;


-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều
-- nhất

WITH `CTE_COUNT` AS (
SELECT Q.QuestionID,Q.Content, COUNT(Q.QuestionID) AS SLCH
FROM `ExamQuestion`E 
JOIN `Question` Q  ON Q.QuestionID = E.QuestionID
GROUP BY Q.QuestionID)

SELECT * FROM `CTE_COUNT` 
WHERE SLCH = (SELECT MAX(SLCH) FROM `CTE_COUNT`);
	

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT C.CategoryID, C.CategoryName, COUNT(Q.CategoryID) AS SL
FROM`CategoryQuestion` C
JOIN`Question` Q ON C.CategoryID = Q.CategoryID
GROUP BY Q.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
 SELECT Q.QuestionID,Q.Content, COUNT(E.CreatorID) AS SLL
 FROM  `Question`Q  RIGHT JOIN `Exam`E
 ON Q.CreatorID = E.CreatorID
 GROUP BY E.CreatorID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

WITH `CTE_COUNT_E` AS (
SELECT Q.QuestionID ,Q.CategoryID, Q.TypeID, Q.CreatorID, COUNT(A.AnswerID ) AS CÂU_TRẢ_LỜI
FROM  `Question` Q 
JOIN `Answer`A ON Q.QuestionID = A.QuestionID
GROUP BY A.AnswerID  )

SELECT * FROM `CTE_COUNT_E` 
WHERE CÂU_TRẢ_LỜI = (SELECT MAX(CÂU_TRẢ_LỜI) FROM `CTE_COUNT_E`);

-- Question 9: Thống kê số lượng account trong mỗi group

SELECT G.GroupID,G.GroupName,COUNT(GR.AccountID)
FROM `Group`G JOIN`GroupAccount`GR 
ON G.GroupID = GR.GroupID
GROUP BY GR.AccountID ;


SELECT*FROM `Group`G JOIN`GroupAccount`GR;

-- Question 10: Tìm chức vụ có ít người nhất

SELECT P.PositionID ,P.PositionName,COUNT(A.PositionID) AS SLNV

FROM `Position`P JOIN `Account`A
ON P.PositionID = A.PositionID
GROUP BY (A.PositionID) ;

-- SELECT COUNT( A.PositionID), P.PositionName ,P.PositionID
-- FROM `Position`P JOIN `Account`A ON P.PositionID = A.PositionID
-- HAVING COUNT( A.PositionID)=(select max(COUNT( A.PositionID))) from `Account` group by Category )
-- group by Category;  


WITH `CTE_COUNT_E` AS (
SELECT  P.PositionID  ,P.PositionName , COUNT(A.PositionID ) AS SLNV
FROM  `Position` P
JOIN `Account`A ON P.PositionID = A.PositionID
GROUP BY A.PositionID )

SELECT * FROM `CTE_COUNT_E` 
WHERE SLNV = (SELECT MIN(SLNV) FROM `CTE_COUNT_E`);



-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT P.PositionID ,P.PositionName,COUNT(A.PositionID) AS SLNV

FROM `Position`P JOIN `Account`A
ON P.PositionID = A.PositionID
GROUP BY (A.PositionID) ;
-- .///
SELECT d.DepartmentID,d.DepartmentName, p.PositionName, COUNT(p.PositionName) AS SLNV
FROM `Account` a
JOIN `Department` d ON a.DepartmentID = d.DepartmentID
JOIN `Position` p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, p.PositionID
ORDER BY DepartmentID;


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...

SELECT Q.QuestionID,Q.CreatorID, T.TypeID ,T. TypeName,A.AnswerID
FROM ((`Question`Q  
INNER JOIN `TypeQuestion`T ON Q.TypeID = T.TypeID)
INNER JOIN `Answer` A ON Q.QuestionID = A.QuestionID)
ORDER BY Q.QuestionID DESC;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm


WITH `CTE_COUNT_E` AS (
SELECT Q.QuestionID,T.TypeName, SUM(E.QuestionID) AS SỐ_LƯỢNG
FROM ((`Question`Q  
JOIN `TypeQuestion`T ON Q.TypeID = T.TypeID)
JOIN `ExamQuestion` E ON Q.QuestionID = E.QuestionID)
GROUP BY T.TypeName )

SELECT * FROM `CTE_COUNT_E` ;

-- Question 14:Lấy ra group không có account nào

SELECT *
FROM  `Group`;
SELECT *
FROM  `GroupAccount`;

SELECT G.GroupID,GR.AccountID, G.GroupName
FROM `Group`G ,`GroupAccount`GR  WHERE  GR.AccountID IS NULL AND  GR.GroupID IS NULL AND G.GroupID IS NOT NULL
GROUP BY G.GroupName;

-- Question 15: Lấy ra group không có account nào
-- Question 16: Lấy ra question không có answer nào

SELECT Q.QuestionID,Q.CategoryID,A.AnswerID
FROM `Question`Q JOIN `Answer`A
ON Q.QuestionID = A.QuestionID;

WITH `CTE_COUNT` AS(
SELECT Q.QuestionID,Q.CategoryID,COUNT(A.AnswerID) AS SỐ_CÂU_TRẢ_LỜI
FROM `Question`Q JOIN `Answer`A ON Q.QuestionID = A.QuestionID
GROUP BY A.AnswerID )

SELECT * FROM CTE_COUNT 
WHERE SỐ_CÂU_TRẢ_LỜI = 0;
-- ////////////////////////////////////////////////////////////////
-- /////SỬA 0 THÀNH 1 THÌ NÓ SẼ HIỆN THỊ LÊN SỐ CAU TRẢ LỜI///////
-- ///////////////////////////////////////////////////////////////
-- Exercise 2: Union
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT AccountID,GroupID FROM `GroupAccount` WHERE GroupID = '01';

-- b) Lấy các account thuộc nhóm thứ 2
SELECT AccountID,GroupID FROM `GroupAccount` WHERE GroupID = '02';
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau

SELECT AccountID,GroupID FROM `GroupAccount` WHERE GroupID = '01'
UNION ALL
SELECT AccountID,GroupID FROM `GroupAccount` WHERE GroupID = '02'
ORDER BY AccountID;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên

SELECT * FROM `Account` ,`Group`;

WITH `CTE_COUNT_E` AS (
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV
FROM  `Group` G
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E` 
WHERE SLNV >= 5;
-- b) Lấy các group có nhỏ hơn 7 thành viên

WITH `CTE_COUNT_E` AS (  -- tạo bảng mới 
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV      -- tìm cái cột của bảng nào đấy 
FROM  `Group` G -- tới bảng G liên kết bảng A thông qua cái khóa ngoại
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E`  -- tìm kiếm 
WHERE SLNV<= 7;  -- điều kiện  là ok 


-- c) Ghép 2 kết quả từ câu a) và câu b)

WITH `CTE_COUNT_E` AS (  
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV      
FROM  `Group` G 
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E`  -- tìm kiếm 
WHERE SLNV >= 5  ;

SELECT(
WITH `CTE_COUNT_E` AS (  
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV      
FROM  `Group` G 
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E`  -- tìm kiếm 
WHERE SLNV <= 7);
 

 (
WITH `CTE_COUNT_E` AS (  
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV      
FROM  `Group` G 
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E`  -- tìm kiếm 
WHERE SLNV >= 5)
UNION ALL
(
WITH `CTE_COUNT_E` AS (  
SELECT G.GroupID,G.GroupName , COUNT(G.GroupID ) AS SLNV      
FROM  `Group` G 
JOIN `GroupAccount`A ON G.GroupID = A.GroupID
GROUP BY G.GroupID )

SELECT * FROM `CTE_COUNT_E`  -- tìm kiếm 
WHERE SLNV <= 7);