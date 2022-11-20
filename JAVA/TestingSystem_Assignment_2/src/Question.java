import java.sql.Date;

public class Question {
    byte questionId;            //TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    String content;            //VARCHAR(255) NOT NULL UNIQUE,
    CategoryQuestion categoryId;            //TINYINT UNSIGNED NOT NULL,
    TypeQuestion typeID;                //TINYINT UNSIGNED NOT NULL,
    CategoryQuestion creatorId;            //TINYINT UNSIGNED NOT NULL,
    Date createDate;        //DATETIME DEFAULT NOW(),
}
