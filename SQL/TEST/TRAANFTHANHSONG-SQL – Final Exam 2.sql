-- GiangVien(magv, hoten, luong)
-- SinhVien(masv, hoten, namsinh, quequan)
-- DeTai(madt, tendt, kinhphi, NoiThucTap)
-- HuongDan(id, masv, madt, magv, ketqua)

DROP DATABASE IF EXISTS Quan_Ly_Thuc_Tap_SV;

CREATE DATABASE Quan_Ly_Thuc_Tap_SV;

USE Quan_Ly_Thuc_Tap_SV;

CREATE TABLE GiangVien (
	magv 		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	hoten		VARCHAR(255) NOT NULL,
	luong		INT UNSIGNED NOT NULL
);

CREATE TABLE SinhVien(
	masv 		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	hoten		VARCHAR(255) NOT NULL, 
	namsinh		DATETIME, 
	quequan 	VARCHAR(255) NOT NULL
);
CREATE TABLE DeTai(
	madt 		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
	tendt 		VARCHAR(255) NOT NULL, 
	kinhphi 	INT UNSIGNED, 
	NoiThucTap 	VARCHAR(255)
);
CREATE TABLE HuongDan(
	id 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
	masv 		INT UNSIGNED NOT NULL, 
	madt 		INT UNSIGNED NOT NULL, 
	magv 		INT UNSIGNED NOT NULL, 
	ketqua VARCHAR(255),
    FOREIGN KEY (masv) REFERENCES SinhVien(masv) ON DELETE CASCADE,
    FOREIGN KEY (madt) REFERENCES DeTai(madt) ON DELETE CASCADE,
    FOREIGN KEY (magv) REFERENCES GiangVien(magv)ON DELETE CASCADE
);


INSERT INTO GiangVien (magv, hoten, luong)
VALUE 
	('101','GIANG VIEN 1','10000000'),
	('102','GIANG VIEN 2','15000000'),
	('103','GIANG VIEN 3','30000000');

INSERT INTO SinhVien (masv, hoten, namsinh, quequan)
VALUE 
	('10','SINH VIEN 1','2000-11-23','HÀ TĨNH '),
	('11','SINH VIEN 2','2000-09-23','HÀ NAM '),
	('12','SINH VIEN 3','2000-02-23','HÀ NỘI '),
    ('13','SINH VIEN 4','2000-05-21','HÀ NỘI ');
INSERT INTO DeTai (madt, tendt, kinhphi, NoiThucTap)
VALUE
	('1','CONG NGHE SINH HOC','1000000','NHẬT BẢN'),
	('2','CONG NGHE SINH HOC 2 ','5600000','HÀN QUỐC'),
	('3','DE TAI 3','1300000','SINGGAPOR'),
    ('4','DE TAI 4 ','3000000000','USA');
    
INSERT INTO HuongDan (id, masv, madt, magv, ketqua)
VALUE
	('123','10','2','103','TỐT'),
	('124','12','1','102','KHÁ'),
	('125','11','1','101','XUẤT SẮC');
    
    
 -- GiangVien(magv, hoten, luong)
-- SinhVien(masv, hoten, namsinh, quequan)
-- DeTai(madt, tendt, kinhphi, NoiThucTap)
-- HuongDan(id, masv, madt, magv, ketqua)

-- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
SELECT SV.masv ,SV.hoten,DT.madt,DT.tendt 
FROM HuongDan HD RIGHT JOIN SinhVien SV ON HD.masv =SV.masv
				 LEFT JOIN DeTai DT ON HD.madt =DT.madt
WHERE DT.madt IS NULL ;


-- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
-- M ã số, họ tên và tên đề tài
-- 	(Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")


DROP VIEW IF EXISTS `V_SinhVienInfo`;
CREATE VIEW `V_SinhVienInfo` AS 
SELECT SV.masv ,SV.hoten,DT.madt,DT.tendt ,
		CASE 
			WHEN DT.tendt IS NULL THEN 'CHUA CO'
			ELSE DT.tendt 
        END
		FROM HuongDan HD RIGHT JOIN SinhVien SV ON HD.masv =SV.masv
						 LEFT JOIN DeTai DT ON HD.madt =DT.madt;
SELECT*FROM `V_SinhVienInfo`;


-- Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’
-- -- DeTai(madt, tendt, kinhphi, NoiThucTap)

SELECT *FROM DeTai 
WHERE tendt = 'CONG NGHE SINH HOC';

SELECT DT.tendt,COUNT(HD.masv) AS SL_SV 
FROM `HuongDan` HD JOIN `DeTai`DT ON HD.madt=DT.madt
WHERE hd.madt=(SELECT madt FROM DeTai 
WHERE tendt = 'CONG NGHE SINH HOC') 
GROUP BY hd.madt;


 -- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900
-- thì hiện ra thông báo "năm sinh phải > 1900"

 DROP TRIGGER IF EXISTS trg_check;

	DELIMITER $$
		CREATE TRIGGER trg_check
        BEFORE INSERT on `SinhVien`
        FOR EACH ROW
		BEGIN
			DECLARE v_namsinh DATETIME;
		    SET v_namsinh = '1900-01-01' ;
            IF (NEW.namsinh <= v_namsinh ) THEN
				SIGNAL SQLSTATE '34567' 
				SET MESSAGE_TEXT = 'không thể nhập vào vui lòng nhập lại ngày sinh ';
            END IF;
		END$$
	DELIMITER ;
    
INSERT INTO SinhVien (masv, hoten, namsinh, quequan)
VALUE 
	(16,'SINH VIEN 1','1800-11-23','HÀ TĨNH ');
 
 
-- 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông
-- tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi

-- SỬ DỤNG ON DELETE CASCADE
CREATE TABLE HuongDan(
	FOREIGN KEY (masv) REFERENCES SinhVien(masv) ON DELETE CASCADE,
    FOREIGN KEY (madt) REFERENCES DeTai(madt) ON DELETE CASCADE,
    FOREIGN KEY (magv) REFERENCES GiangVien(magv)ON DELETE CASCADE
);   

DELETE FROM SinhVien WHERE MASV=10;

SELECT *FROM sinhvien;
SELECT*FROM detai;
SELECT *FROM huongdan;
SELECT * from giangvien;