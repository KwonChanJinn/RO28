-- Question 1: Thêm ít nhất 10 bản ghi vào table
-- đã thêm rồi thêm trong EX 1-2 lun
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau

SELECT Full_Name,Birth_Date  FROM `Trainee`
ORDER BY Birth_Date DESC ;


-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)

SELECT * FROM `Trainee`
ORDER BY LENGTH(Full_Name) LIMIT 1;

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--  ET_IQ + ET_Gmath>=20
--  ET_IQ>=8
--  ET_Gmath>=8
--  ET_English>=18

SELECT Full_Name,Birth_Date  FROM `Trainee`
WHERE ET_IQ*1.5 + ET_Gmath*1.5 >= 20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English *2 >=18;


-- Question 5: xóa thực tập sinh có TraineeID = 3

DELETE FROM `Trainee` WHERE TraineeID = '3';


-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật

UPDATE `Trainee`
SET	Training_Class ='2'
WHERE  TraineeID = '115';


SELECT * FROM `Trainee`;
-- thông tin vào database