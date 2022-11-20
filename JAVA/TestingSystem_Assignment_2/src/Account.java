import java.sql.Date;
import java.time.LocalDate;

public class Account {

    public LocalDate createDate;
    int accountId; // TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    String email; //VARCHAR(255) NOT NULL UNIQUE KEY,
    String username;// VARCHAR(255) NOT NULL UNIQUE KEY,
    String fullName;// VARCHAR(255) NOT NULL,
    Department Department; //TINYINT UNSIGNED NOT NULL,
    Position PositionId;// TINYINT UNSIGNED NOT NULL,

    EnumPosition PositionName;
    Position position;

    Date CreateDate;

    Group[] groups;


}
