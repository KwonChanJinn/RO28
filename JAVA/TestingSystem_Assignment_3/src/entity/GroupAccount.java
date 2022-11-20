package entity;

import java.util.Date;

public class GroupAccount {
    Group groupId;            //TINYINT UNSIGNED AUTO_INCREMENT ,
    Account AccountID;            //TINYINT UNSIGNED NOT NULL,
    Date joinDate;        //DATETIME DEFAULT NOW(),
}
