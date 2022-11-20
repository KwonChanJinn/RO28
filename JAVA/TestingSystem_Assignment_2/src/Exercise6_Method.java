import java.time.LocalDate;

public class Exercise6_Method {

    public static void main(String[] args) {
            System.out.println("");
            System.out.println("---------------------Question 1  ---------------------------");
            System.out.println("");
            Question_1();
            System.out.println("");
            System.out.println("---------------------Question 2  ---------------------------");
            System.out.println("");
            Question_2();
            System.out.println("");
            System.out.println("---------------------Question 3  ---------------------------");
            System.out.println("");
            Question_3();

    }

    private static void Question_1() {
        Account acc1 = new Account();
        acc1.accountId = 1;
        acc1.email = "email1";
        acc1.username = "username1";
        acc1.fullName = "KwonChanJinnnnn";
        acc1.createDate = LocalDate.of(2021, 03, 17);
        Account acc2 = new Account();
        acc2.accountId = 2;
        acc2.email = "email2222222";
        acc2.username = "username22222";
        acc2.fullName = "KwonChanJinnnnn1222222";
        acc2.createDate = LocalDate.of(2021, 03, 17);
        Account acc3 = new Account();
        acc3.accountId = 3;
        acc3.email = "email1333333";
        acc3.username = "username133333";
        acc3.fullName = "KwonChanJinnnnn333333333333";
        acc3.createDate = LocalDate.of(2021, 03, 17);
        printAccount(acc1);
        printAccount(acc2);
        printAccount(acc3);
    }

    // câu 2
    private static void printAccount(Account account) {
        System.out.println("ID: " + account.accountId + " Email: " +
                account.email + " Username: " + account.username +
                " FullName: " + account.fullName + " CreareDate: " + account.CreateDate);
    }




    private static void Question_2() {
        for (int i = 0; i < 10; i++) {
            if (i > 0 && i % 2 == 0) {
                System.out.println(":" + i);
            }
        }
    }

    private static void Question_3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(":" + i);
        }
    }
}