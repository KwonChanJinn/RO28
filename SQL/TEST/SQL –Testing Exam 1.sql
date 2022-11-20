DROP DATABASE IF EXISTS Testing_Exam_1;

CREATE DATABASE Testing_Exam_1;

USE  Testing_Exam_1;

CREATE TABLE CUSTOMER (
	CustomerID 		TINYINT UNSIGNED  AUTO_INCREMENT PRIMARY KEY ,								-- : mã khách hàng, primary key, auto increment.
	`Name` 			VARCHAR(255) NOT NULL,										-- : tên của khách hàng.
	Phone 			VARCHAR (255)  NOT NULL,								-- : số điện thoại của khách hàng.
	Email 			VARCHAR(255) NOT NULL ,							-- : địa chỉ email của khách hàng.
	Address 		VARCHAR(1000),							-- : địa chỉ của khách hàng.
	Note  			VARCHAR(255) NOT NULL		-- : tóm tắt mô tả về khách hàng.
);									

CREATE TABLE CAR (
CarID	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,								-- : mã oto, primary key.
Make	ENUM('HONDA','TOYOTA','NISSAN')	,							-- : tên hãng sản xuất (chỉ có thể là 3 giá trị: ‘HONDA’, ‘TOYOTA’,‘NISSAN’).
Model	VARCHAR(500) NOT NULL,							-- : tên của mẫu xe.
`Year`	VARCHAR(255) NOT NULL,										-- : năm sản xuất.
Color	VARCHAR(50) NOT NULL,									-- : màu của xe (black, white, yellow…).
Note	VARCHAR(255) NOT NULL											-- : tóm tắt mô tả về xe
);

CREATE TABLE CAR_ORDER (
OrderID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,	-- : mã đơn hàng, primary key, auto increment.
CustomerID		TINYINT UNSIGNED NOT NULL,						 -- : mã khách hàng, foreign key.
CarID			TINYINT UNSIGNED NOT NULL,							-- : mã oto, foreign key.
 `Amount`		TINYINT DEFAULT 1,				-- : số lượng oto, default value = 1.
SalePrice       BIGINT NOT NULL,								--  giá bán oto.
OrderDate		DATETIME ,						 -- : ngày bán .
DeliveryDate	DATETIME ,									--  ngày giao hàng.
DeliveryAddress	VARCHAR(500) NOT NULL,								-- : địa chỉ giao hàng.
Staus			ENUM ('0','1','2'),					-- : trạng thái của đơn hàng (0: đã đặt hàng, 1: đã giao, 2: đã hủy), mặc định trạng thái là đã đặt hàng.
Note			VARCHAR (255) NOT NULL,								-- : tóm tắt mô tả về đơn hàng.
 
FOREIGN KEY( CustomerID ) REFERENCES CUSTOMER(CustomerID) ON DELETE CASCADE,
FOREIGN KEY( CarID ) REFERENCES CAR(CarID) ON DELETE CASCADE
);

INSERT INTO CUSTOMER (CustomerID,`Name`,Phone,Email,Address,Note)
VALUE 
	('1','MAI THANH TÙNG','09887756783','khachhang1@gmail.com','Hà Nội','đẹp trai cao ráo '),
	('2','TRẦN PHUONG','34537374534','khachhang2@gmail.com','Hà TĨNH','đẹp trai cao ráo '),	
	('3','MAI THANH ','434378378','khachhang3@gmail.com','LÀO CAI','XING GÁI cao ráo '),	
	('4','TRÂN THANH SONG','78378378374534','khachhang4@gmail.com','HƯNG YÊN','đẹp trai cao ráo '),	
	('5','LÊ ĐẠI NHÂN','787782782782','khachhang5@gmail.com','SƠN LA ','đẹp trai cao ráo '),	
	('6','NGUYỄN ĐẠI HIỆP','767878278278','khachhang6@gmail.com','NGHỆ AN','đẹp trai cao ráo ');							

INSERT INTO CAR (CarID,Make,Model,`Year`,Color,Note)
VALUE 
('101','HONDA','CRV','2021','BLUE','NOTE1'),
('102','NISSAN','Almera','2021','RED','NOTE12'),
('103','NISSAN','Terra','2021','GREEN','NOTE3'),
('104','TOYOTA','FORTUNER','2021','BLACK','NOTE4'),
('105','HONDA','CIVIC','2021','WHITE','NOTE5'),
('106','TOYOTA','INNOVAR','2021','YELLOW','NOTE6');	

INSERT INTO CAR_ORDER (OrderID,CustomerID,CarID,`Amount`,SalePrice,OrderDate,DeliveryDate,DeliveryAddress,Staus,Note)
VALUE 
		('11','1','101',2,'2000000','2020-01-04','2020-02-03','HÀ NỘI','0', 'BÁN ĐƯỢC XE NOTE 1'),
		('12','2','102',5,'25000000000','2021-03-04','2021-04-05','HÀ NỘI','1', 'BÁN ĐƯỢC XE NOTE 2'),
		('13','3','103','2','3000000000','2022-05-04','2022-06-05','HÀ TĨNH','2', 'BÁN ĐƯỢC XE NOTE 3'),
		('14','4','104',4,'7000000000','2022-06-23','2019-08-21','HÀ NAM','2', 'BÁN ĐƯỢC XE NOTE 4'),
		('15','5','105',1,'9000000000','2020-11-04','2020-12-03',' CAO BẰNG','1', 'BÁN ĐƯỢC XE NOTE 5'),
		('16','6','106',4,'12000000000','2021-01-30','2021-02-03',' NGHỆ AN','0', 'BÁN ĐƯỢC XE NOTE 6');


