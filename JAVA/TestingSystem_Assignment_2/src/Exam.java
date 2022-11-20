import java.sql.Date;

public class Exam {
    byte examId;                //TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    String Code;                //VARCHAR(255) NOT NULL UNIQUE,
    String title;                //VARCHAR(255) NOT NULL,
    String CategoryIdi;        //VARCHAR(255) NOT NULL,
    Date duration;            //TIME NOT NULL ,
    CategoryQuestion creatorId;            //TINYINT UNSIGNED NOT NULL,
    Date CreateDate;            //DATETIME NOT NULL

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", Code='" + Code + '\'' +
                ", title='" + title + '\'' +
                ", CategoryIdi='" + CategoryIdi + '\'' +
                ", duration=" + duration +
                ", creatorId=" + creatorId +
                ", CreateDate=" + CreateDate +
                '}';
    }
}
