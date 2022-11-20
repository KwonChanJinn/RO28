DROP DATABASE IF EXISTS Database_User ;

CREATE DATABASE Database_User;

-- tạo bảng dữ liệu

USE Database_User;


-- tạo bảng
DROP TABLE IF EXISTS `ManageUser`;
CREATE TABLE `ManageUser` (
    id                  INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fullName            VARCHAR(255) NOT NULL,
    Email               VARCHAR(255) NOT NULL,
    `Password`         VARCHAR(50) NOT NULL,
    `User`              ENUM("Employee","Admin") NOT NULL,
    ExpInYear           TINYINT ,
    ProSkill           VARCHAR(255)

); 
-- đã là thêm user thì  ko thêm prrskill 
INSERT INTO `ManageUser`( fullName              , Email                         ,`Password` , `User`, ExpInYear) 
VALUES                  ( "TRẦN THANH SONG "    , "thanhsong@gmail.com" , "21082000","Admin",        1  ),
                        ( "LÊ HOÀNG ANH MINH "       , "a@gmail.com"          , "21082000","Admin",        2  ),
                        ( "LÊ HOÀNG ANH THƯ "       , "b@gmail.com"          , "21082000","Admin",        2  ),
                        ( "LÊ HOÀNG ANH DŨNG "       , "c@gmail.com"          , "21082000","Admin",        2  ),
                        ( "LÊ HOÀNG ANH  PHONG"       , "d@gmail.com"          , "21082000","Admin",        2  ),
                        ( "NGUYỄN MINH PHƯƠNG " , "minhpphuongnth@gmail.com"    , "21082000","Admin",        3  ),
                        ( "KWON CHAN JINN"      ,"kwonchanjin@gmail.com"        , "21082000","Admin",        2  ),
                        ( "LÊ ANH THƯ "         ,"thuanhntkh@gmail.com"         , "21082000","Admin",        1  );


INSERT INTO `ManageUser`( fullName              , Email                         ,`Password` , `User`   , ProSkill) 
VALUES                  ( "HOÀNG ANH SƠN "      , "thanhsong21082000@gmail.com" , "21082000","Employee",        "Java"  ),
                        ( "NGUYỄN MẠNH HÙNG "   , "n@gmail.com"          , "21082000","Employee",        "C++"  ),
                        ( "NGUYỄN MẠNH DŨNG "   , "r@gmail.com"          , "21082000","Employee",        "C++"  ),
                        ( "NGUYỄN MẠNH GIÁP "   , "t@gmail.com"          , "21082000","Employee",        "C++"  ),
                        ( "NGUYỄN MẠNH PHÁP "   , "g@gmail.com"          , "21082000","Employee",        "C++"  ),
                        ( "HOÀNG QUANG MINH "   , "minhpphuongnth@gmail.com"    , "21082000","Employee",        "C#"  ),
                        ( "LÊ VĂN MINH"         ,"kwonchanjin@gmail.com"        , "21082000","Employee",        "Python"  ),
                        ( "TRẦN ANH PHONG "     ,"thuanhntkh@gmail.com"         , "21082000","Employee",        ".Net"  );

SELECT * FROM `ManageUser` ;
SELECT * FROM `ManageUser` WHERE Email="a@gmail.com"  AND `Password`= "21082000" AND `User` = "Admin";

