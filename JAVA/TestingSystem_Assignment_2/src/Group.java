import java.sql.Date;

public class Group {
    byte groupId;            // TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    String groupName;        // 	VARCHAR(255) NOT NULL UNIQUE KEY ,
    byte creatorId;             //TINYINT UNSIGNED NOT NULL,
    Date CreateDate;            //DATETIME DEFAULT NOW()

    Account[] accounts;
}
