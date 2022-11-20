DROP DATABASE IF EXISTS Database_Exam ;

CREATE DATABASE Database_Exam;

-- tạo bảng dữ liệu

USE Database_Exam;


-- tạo bảng
DROP TABLE IF EXISTS `ManageUser`;
CREATE TABLE `ManageUser` (
    id                  INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fullName            VARCHAR(255) NOT NULL,
    Email               VARCHAR(255) NOT NULL,
    `Password`         VARCHAR(50) NOT NULL,
    `role`              ENUM("Manager","Employee","Admin") NOT NULL,
    ProjectId            INT,
    ExpInYear           TINYINT ,
    ProSkill           VARCHAR(255)

); 
-- đã là thêm user thì  ko thêm prrskill 
INSERT INTO `ManageUser`( fullName              , Email                         ,`Password` ,  `role`,ProjectId  , ExpInYear) 
VALUES                  ( "TRẦN THANH SONG "    , "thanhsong@gmail.com" , "21082000","Manager",        1,2  ),
                        ( "LÊ HOÀNG ANH MINH "       , "a@gmail.com"          , "21082000","Manager",     3,   2  ),
                        ( "LÊ HOÀNG ANH THƯ "       , "b@gmail.com"          , "21082000","Manager",      4,  2  ),
                        ( "LÊ HOÀNG ANH DŨNG "       , "c@gmail.com"          , "21082000","Manager",     6 ,  2  ),
                        ( "LÊ HOÀNG ANH  PHONG"       , "d@gmail.com"          , "21082000","Manager",    1 ,   2  ),
                        ( "NGUYỄN MINH PHƯƠNG " , "minhpphuongnth@gmail.com"    , "21082000","Manager",   2 ,    3  ),
                        ( "KWON CHAN JINN"      ,"kwonchanjin@gmail.com"        , "21082000","Manager",   5 ,    2  ),
                        ( "LÊ ANH THƯ "         ,"thuanhntkh@gmail.com"         , "21082000","Manager",   4 ,    1  );


INSERT INTO `ManageUser`( fullName              , Email                         ,`Password` ,  `role` ,ProjectId  , ProSkill) 
VALUES                  ( "HOÀNG ANH SƠN "      , "thanhsong21082000@gmail.com" , "21082000","Employee", 2,       "Java"  ),
                        ( "NGUYỄN MẠNH HÙNG "   , "n@gmail.com"          , "21082000","Employee",       3 ,"C++"  ),
                        ( "NGUYỄN MẠNH DŨNG "   , "r@gmail.com"          , "21082000","Employee",       4, "C++"  ),
                        ( "NGUYỄN MẠNH GIÁP "   , "t@gmail.com"          , "21082000","Employee",      2 , "C++"  ),
                        ( "NGUYỄN MẠNH PHÁP "   , "g@gmail.com"          , "21082000","Employee",      1 , "C++"  ),
                        ( "HOÀNG QUANG MINH "   , "minhpphuongnth@gmail.com"    , "21082000","Employee",3,        "C#"  ),
                        ( "LÊ VĂN MINH"         ,"kwonchanjin@gmail.com"        , "21082000","Employee",  4,      "Python"  ),
                        ( "TRẦN ANH PHONG "     ,"thuanhntkh@gmail.com"         , "21082000","Employee",    5,    ".Net"  );
                        
                        INSERT INTO `ManageUser`( fullName              , Email                         ,`Password` ,  `role`) 
VALUES                  ( "TRẦN THANH SONG 1 2  "    , "thanhsong@gmail.com" , "21082000","Admin" ),
                        ( "LÊ HOÀNG ANH MINH  3 4 "       , "a@gmail.com"          , "21082000","Admin" ),
                        ( "LÊ HOÀNG ANH THƯ 5 6 "       , "b@gmail.com"          , "21082000","Admin" ),
                        ( "LÊ HOÀNG ANH DŨNG 7 8 "       , "c@gmail.com"          , "21082000","Admin"  ),
                        ( "LÊ HOÀNG ANH  PHONG 7 9"       , "d@gmail.com"          , "21082000","Admin" ),
                        ( "NGUYỄN MINH PHƯƠNG 11" , "minhpphuongnth@gmail.com"    , "21082000","Admin" ),
                        ( "KWON CHAN JINN  123"      ,"kwonchanjin@gmail.com"        , "21082000","Admin"  ),
                        ( "LÊ ANH THƯ  12345"         ,"thuanhntkh@gmail.com"         , "21082000","Admin" );


SELECT * FROM `ManageUser` ;
-- SELECT * FROM `ManageUser` WHERE Email="a@gmail.com"  AND `Password`= "21082000" AND `User` = "Admin";

