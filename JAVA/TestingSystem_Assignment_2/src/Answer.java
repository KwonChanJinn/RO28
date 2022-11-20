public class Answer {
    byte answerId;            //TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    String content;            //VARCHAR(255) UNIQUE NOT NULL,
    Question questionId;            //TINYINT UNSIGNED NOT NULL,
    boolean isCorrect;            //BOOLEAN,
}
