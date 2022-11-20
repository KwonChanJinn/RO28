-- Questions
-- 1. Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 5 bản ghi vào table
 -- OK 
 
 
-- 2. Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã
-- mua và sắp sếp tăng dần theo số lượng oto đã mua.
-- INSERT INTO CUSTOMER (CustomerID,`Name`,Phone,Email,Address,Note)
-- INSERT INTO CAR (CarID,Make,Model,`Year`,Color,Note)
-- INSERT INTO CAR_ORDER (OrderID,CustomerID,CarID,`Amount`,SalePrice,OrderDate,DeliveryDate,DeliveryAddress,Staus,Note)

SELECT `Name`,`Amount` FROM `CUSTOMER`  C JOIN `CAR_ORDER` CA  ON  C.CustomerID = CA.CustomerID
ORDER BY `Amount` ;

SELECT `Name`,`Amount` FROM `CUSTOMER`  C left JOIN `CAR_ORDER` CA  ON  C.CustomerID = CA.CustomerID
GROUP BY `Name` ;


-- 3. Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều
-- oto nhất trong năm nay.


WITH `CTE_COUNT_E` AS (
SELECT  C.Make,SUM(`Amount`) AS SL, YEAR(CA.OrderDate) AS NAM
FROM  `CAR_ORDER` CA 
JOIN CAR C ON CA.CarID =C.CarID
WHERE YEAR(CA.OrderDate) = YEAR(current_date ()) AND CA.Staus = '1'
GROUP BY C.Make )

SELECT * FROM `CTE_COUNT_E` 
WHERE  SL = (SELECT MAX(SL) FROM `CTE_COUNT_E`)  ;


-- 4. Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của
-- những năm trước. In ra số lượng bản ghi đã bị xóa.


-- 5. Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn
-- hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto
-- và tên hãng sản xuất.

DROP PROCEDURE IF EXISTS sp_TIMID;
	DELIMITER $$
		CREATE PROCEDURE sp_TIMID (IN in_ID TINYINT UNSIGNED)
			BEGIN
				SELECT CC.`MAKE`,C.`Name`,CA.`Amount`,CA.OrderID FROM `CUSTOMER`  C JOIN `CAR_ORDER` CA 
                ON  C.CustomerID = CA.CustomerID
                JOIN CAR CC 
                ON CC.CarID = CA.CarID
                
                WHERE in_ID = OrderID AND CA.Staus = '0'
				ORDER BY `Amount` ;
			END$$
	DELIMITER ;
CALL sp_TIMID (16);

-- 6. Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ
-- vào database (DeliveryDate < OrderDate + 15).

DROP TRIGGER IF EXISTS trg_check;

	DELIMITER $$
		CREATE TRIGGER trg_check
        BEFORE INSERT ON`CAR_ORDER`
        FOR EACH ROW
		BEGIN
        
			DECLARE v_createdate DATETIME;
            IF (NEW.DeliveryDate <= DATE_ADD(NEW.OrderDate , INTERVAL(15) DAY))
            THEN
				SIGNAL SQLSTATE '34567' 
				SET MESSAGE_TEXT = 'KHÔNG THỂ NHẬP ';
            END IF;
		END$$
	DELIMITER ;
    
INSERT INTO CAR_ORDER (OrderID,CustomerID,CarID,`Amount`,SalePrice,OrderDate,DeliveryDate,DeliveryAddress,Staus,Note)
VALUE 
		('28','1','101',2,'2000000','2020-01-04','2020-01-05','HÀ NỘI','0', 'BÁN ĐƯỢC XE NOTE 1');
        
SELECT *FROM CAR_ORDER;