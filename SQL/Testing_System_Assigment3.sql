-- Question 1: Thêm ít nhất 10 record vào mỗi table
SELECT * FROM department;

-- lấy ra id của phòng ban "Sale"
SELECT departmentID
FROM department
WHERE DepartmentName = 'Nhân Sụ';
    
-- Question 4: lấy ra thông tin account có full name dài nhất

SELECT AccountID FROM `Account`
ORDER BY  CHAR_LENGTH(FullName) LIMIT 1; 

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id= 3
SELECT AccountID, LENGTH(FullName),FullName FROM `Account`
WHERE DepartmentID = '3' ORDER BY LENGTH(FullName) DESC LIMIT 1 ;

-- Question 6 Lấy ra tên group đã tham gia trước ngày 20/12/2019

SELECT GroupName FROM `Group`
WHERE CreateDate > '2019-12-20'; 

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời

SELECT QuestionID FROM  `Answer` 
GROUP BY (QuestionID)
HAVING QuestionID >= '4';

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019

SELECT `Code` FROM `Exam`
WHERE Duration >= '60:00:00' AND CreateDate >= '2019-12-20' ;

-- Question 9: Lấy ra 5 group được tạo gần đây nhất
SELECT GroupName FROM `Group`
WHERE CreateDate  < '2022/10/3 '
ORDER BY CreateDate LIMIT 5; 

-- Question 10: Đếm số nhân viên thuộc department có id = 2

SELECT COUNT(DepartmentID)
FROM Department
WHERE DepartmentID = '2' ;

SELECT*FROM `Department`;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"

SELECT*
FROM `Account`
WHERE FullName LIKE 'D%o';

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019

DELETE ExamID
FROM Exam 
WHERE CreateDate > '2019-12-20';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"

DELETE QuestionID
FROM Question 
WHERE Content > ' câu hỏi ';


-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và -- email thành loc.nguyenba@vti.com.vn

UPDATE `Account`
SET FullName = 'Nguyễn Bá Lộc' , Email ='loc.nguyenba@vti.com.vn'
WHERE  AccountID = '5';


-- Question 15: update account có id = 5 sẽ thuộc group có id = 4

UPDATE `GroupAccount`
SET GroupID = '4'
WHERE  AccountID = '5';