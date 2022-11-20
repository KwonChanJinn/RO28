import java.time.LocalDate;
import java.util.Random;

public class Exercise4_RandomNumber {
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
        System.out.println("");
        System.out.println("---------------------Question 4  ---------------------------");
        System.out.println("");
        Question_4();
        System.out.println("");
        System.out.println("---------------------Question 5  ---------------------------");
        System.out.println("");
        Question_5();
        System.out.println("");
        System.out.println("---------------------Question 6  ---------------------------");
        System.out.println("");
        Question_6();
        System.out.println("");
        System.out.println("---------------------Question 7  ---------------------------");
        System.out.println("");
        Question_7();

    }

    private static void Question_1() {
        //Exercise 4 (Optional): Random Number-
        //Question 1:
        //In ngẫu nhiên ra 1 số nguyên

        Random inRandom = new Random();
        int n = inRandom.nextInt();
        System.out.println(n);

    }

    private static void Question_2() {
        //Question 2:
        //In ngẫu nhiên ra 1 số thực


        Random random1 = new Random();
        float a = random1.nextFloat();
        System.out.println(a);

    }

    private static void Question_3() {
        //Question 3:
        //Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
        //ra tên của 1 bạn

        String[] songngu1 = {"Trần Thanh Song", "Song không ngu", "SOng cực ngu ", "Supper song ngu"};
        Random random22 = new Random();
        int i = random22.nextInt(songngu1.length);
        System.out.println("Tên  :" + songngu1[i]);

    }

    private static void Question_4() {
        //Question 4:
        //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995


        // ép kiểu ngày qua số
        int Day1 = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int Day2 = (int) LocalDate.of(1995, 12, 20).toEpochDay();

        Random randomms = new Random();         // bound ràng buộc điều kiện
        long randomInt = Day1 + randomms.nextInt(Day2 - Day1);

        //  ép kiểu số qua ngày

        LocalDate reusultDate1 = LocalDate.ofEpochDay(randomInt);
        System.out.println("Ngày ngẫu nhiên là: " + reusultDate1);

    }

    private static void Question_5() {
        //Question 5:
        //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
        System.out.println("");


        int now = (int) LocalDate.now().toEpochDay();
        Random random = new Random();
        int randomDate = now - random.nextInt(365);
        LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
        System.out.println("Ngày ngẫu nhiên là: " + reusultDate);

    }

    private static void Question_6() {

        //Question 6:
        //Lấy ngẫu nhiên 1 ngày trong quá khứ
        System.out.println("----Exercise 4 -check time ofEpochDay  ------");
        System.out.println("");

        LocalDate date789 = LocalDate.ofEpochDay(100);
        System.out.println(date789);

        System.out.println("------Exercise 4 -check time toEpochDay  -------");
        System.out.println("");


        LocalDate localDate = LocalDate.of(1970, 01, 10);
        System.out.println(localDate);
        long l = localDate.toEpochDay();
        System.out.println("Epoch Days : " + l);


        System.out.println("");

        int localeday = (int) LocalDate.now().toEpochDay();
        Random random123 = new Random();
        int randomDay = random123.nextInt(localeday);
        //epochDay - Ngày kỷ nguyên để chuyển đổi, dựa trên kỷ nguyên 1970-01-01.
        LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay);
        // giá trị trả lại ngày địa phương, không phải null.
        System.out.println(" Ngày ngẫu nhiên trong quá khứ: " + resultDate1);

    }

    private static void Question_7() {
        //Question 7:
        //Lấy ngẫu nhiên 1 số có 3 chữ số


//        int[] songngu21 = new int[1000];
//        for (int l = 100; l <= 999; l++) {
//            songngu21[i] = l;
//            Random ngune = new Random();
//            int m = ngune.nextInt(songngu21[i]);
//            System.out.println("Cái số RanDooommmm nè :" + songngu21[i]);
//        }

        int[] b = new int[1000];
        Random rand = new Random();
        for (int u = 100; u <= 999; u++) {
            b[u] = rand.nextInt(1000);
            if (b[u] <= 999 && b[u] >= 100) {
                System.out.println(b[u]);
                break;
            }
        }
    }
}
