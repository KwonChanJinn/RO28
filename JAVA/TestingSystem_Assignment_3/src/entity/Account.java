package entity;

import java.sql.Date;
import java.time.LocalDate;

public class Account {

    public LocalDate createDate;
    public String userName;
    int accountId; // TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    public String email; //VARCHAR(255) NOT NULL UNIQUE KEY,
    String username;// VARCHAR(255) NOT NULL UNIQUE KEY,
    public String fullName;// VARCHAR(255) NOT NULL,
    Department Department; //TINYINT UNSIGNED NOT NULL,
    Position PositionId;// TINYINT UNSIGNED NOT NULL,

    EnumTypeQuestion.EnumPosition PositionName;
    Position position;

    Date CreateDate;

    Group[] groups;


}
