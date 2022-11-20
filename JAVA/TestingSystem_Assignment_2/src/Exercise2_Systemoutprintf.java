import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2_Systemoutprintf {
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

    }

    private static void Question_1() {
        //Exercise 2 (Optional): System out printf
        //Question 1:
        //Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
        int songuyen = 5;
        System.out.println(" Số Đấy chính là " + songuyen);

    }

    private static void Question_2() {
        //Question 2:
        //Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        //ra số nguyên đó thành định dạng như sau: 100,000,000
        int songuyen100000000 = 100000000;
        System.out.println(" Số Đấy chính là " + songuyen100000000);

    }

    private static void Question_3() {

        //Question 3:
        //Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        //thực đó chỉ bao gồm 4 số đằng sau

        float i3 = 5.567098f;
        System.out.println(" Số Đấy chính là " + i3);

    }

    private static void Question_4() {

        //Question 4:
        //Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        //dạng như sau:
        //Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        //Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
        String text1 = "Nguyễn Văn A";
        System.out.println("Họ và tên: " + text1 + " tôi đang F cmnr nó A");

    }

    private static void Question_5() {
        //Question 5:
        //Lấy thời gian bây giờ và in ra theo định dạng sau:
        //24/04/2020 11h:16p:20s

        SimpleDateFormat formatter9 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        try {
            Date date9 = formatter9.parse("24/04/2020 11:16:20 ");
            System.out.println("Date: " + date9);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date2 = simpleDateFormat.format(new Date());
        System.out.println(date2);



        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);



        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy: " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss: " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy: " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz: " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z: " + strDate);

    }

    private static void Question_6() {
        //Question 6:
        //In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
        //table (giống trong Database)

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------------Exercise 4 -----------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");

    }


}
