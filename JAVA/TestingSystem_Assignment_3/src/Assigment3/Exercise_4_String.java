package Assigment3;

import java.sql.Date;
import java.util.Scanner;

public class Exercise_4_String {
    public static void main(String[] args) {
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 1-----------------------------------");
//        System.out.println("");
//        Question_1();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 2-----------------------------------");
//        System.out.println("");
//        Question_2();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 3-----------------------------------");
//        System.out.println("");
//        Question_3();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 4-----------------------------------");
//        System.out.println("");
//        Question_4();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 5-----------------------------------");
//        System.out.println("");
//        Question_5();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 6-----------------------------------");
//        System.out.println("");
//        Question_6();

//        System.out.println("");
//        System.out.println("-------------------------------------Bài 7-----------------------------------");
//        System.out.println("");
//        Question_7();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 8-----------------------------------");
//        System.out.println("");
//        Question_8();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 9-----------------------------------");
//        System.out.println("");
//        Question_9();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 10-----------------------------------");
//        System.out.println("");
//        Question_10();
//
//        System.out.println("");
//        System.out.println("-------------------------------------Bài 11-----------------------------------");
//        System.out.println("");
//        Question_11();

        System.out.println("");
        System.out.println("-------------------------------------Bài 12-----------------------------------");
        System.out.println("");
        Question_12();
        System.out.println("");
        System.out.println("-------------------------------------Bài 13-----------------------------------");
        System.out.println("");
        Question_13();
        System.out.println("");
        System.out.println("-------------------------------------Bài 14-----------------------------------");
        System.out.println("");
        Question_14();
        System.out.println("");
        System.out.println("-------------------------------------Bài 15-----------------------------------");
        System.out.println("");
        Question_15();
        System.out.println("");
        System.out.println("-------------------------------------Bài 16-----------------------------------");
        System.out.println("");
        Question_16();
    }

    //Question 1:
    //Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
    //thể cách nhau bằng nhiều khoảng trắng );

    private static void Question_1() {
        String s = "Trần Thanh Song Kwon ChanJinnn";
        System.out.println(s.length());
    }

    //Question 2:
    //Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;

    private static void Question_2() {
        String s = "Trần Thanh Song KwonChanJinnn";
        String s1 = "Ngu hơn bò";
        String s2 = s1 + s;
        System.out.println(s + s1);
        System.out.println(s2.length() + "  Đây là số ký tự");
    }

    //Question 3:
    //Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
    //viết hoa chữ cái đầu thì viết hoa lên
    private static void Question_3() {
//        String s = "tttttttrần Thanh Song KwonChanJinnn";
//        s.substring(0,1).toUpperCase();
//        System.out.println(s);
//        System.out.println(s.length()+"  Đây là số ký tự");

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Nhập Tên: ");
        name = scanner.nextLine();
        String firstCharacter = name.substring(0, 1).toUpperCase();
        String leftCharacter = name.substring(1);
        System.out.println("char at:" + name.charAt(1));
        name = firstCharacter + leftCharacter;
        System.out.println(name);

    }

    //Question 4:
    //Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
    //của người dùng ra
    //VD:
    //Người dùng nhập vào "Nam", hệ thống sẽ in ra
    //"Ký tự thứ 1 là: N"
    //"Ký tự thứ 1 là: A"
    //"Ký tự thứ 1 là: M"


    private static void Question_4() {
        Scanner scanner = new Scanner(System.in);
        String song;
        System.out.print("Mời bạn nhập tên vào :");
        song = scanner.nextLine();
        for (int i = 0; i < song.length(); i++) {
            System.out.println("Ký tự thứ : " + (i + 1) + " là :" + song.charAt(i));
        }
    }

    //Question 5:
    //Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
    //dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ

    private static void Question_5() {

        Scanner scanner = new Scanner(System.in);
        String Ho;
        String ten;
        String tendem;

        System.out.print("Nhập Họ của cậu vào ");
        Ho = scanner.nextLine();
        System.out.print("Nhập tên lót của cậu vào ");
        tendem = scanner.nextLine();
        System.out.print("Nhập Tên của cậu vào ");
        ten = scanner.nextLine();

        System.out.println("Tên đầy đủ " + Ho + " " + tendem + " " + ten);

    }

    //Question 6:
    //Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
    //sau đó hệ thống sẽ tách ra họ, tên , tên đệm
    //VD:
    //Người dùng nhập vào "Nguyễn Văn Nam"
    //Hệ thống sẽ in ra
    //"Họ là: Nguyễn"
    //"Tên đệm là: Văn"
    //"Tên là: Nam"
    private static void Question_6() {

        Scanner scanner = new Scanner(System.in);
        String Hovaten;
        String Ho = "", Tenlot = "", Ten = "";
        System.out.println("Nhập họ tên đầy đủ:");
        Hovaten = scanner.nextLine();

        Hovaten = Hovaten.trim(); // dùng để cắt chuỗi khoảng trắng
        //Phương thức split() tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi
        String[] str = Hovaten.split(" ");
        // gán hok cho chuỗi thứ 0
        Ho = str[0];
        // gán tên cho length -1 vd trần thanh song thì là lấy song vì nó chạy từ 0
        Ten = str[str.length - 1];
        // gán cho nó tên lót vd như << tran thanh thanh song song >> thì nó sẽ for thanh thanh song
        for (int i = 1; i <= str.length - 2; i++) {
            Tenlot += str[i] + " ";
        }
        System.out.println("Họ là: " + Ho);
        System.out.println("Tên đệm là: " + Tenlot);
        System.out.println("Tên là: " + Ten);
        scanner.close();

    }

    //Question 7:
    //Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
    //chuẩn hóa họ và tên của họ như sau:
    //a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
    //vào

    static void Question_7() {

        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.println("Nhập họ tên đầy đủ");
        fullName = scanner.nextLine();
        scanner.close();

        fullName = fullName.trim();
        fullName = fullName.replaceAll("\\s+", " ");
        String[] words = fullName.split(" ");
        System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);

    }

    //VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
    //chuẩn hóa thành "nguyễn văn nam"
    //b) Viết hoa chữ cái mỗi từ của người dùng
    //VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
    //chuẩn hóa thành "Nguyễn Văn Nam"
    //
    //Question 8:
    //In ra tất cả các group có chứa chữ "Java"


    private static void Question_8() {


        String[] groupNames = {"Java", "Javacore", " javaaaaaaaaaa", "Ja   va nè"};

        for (String groupName : groupNames) {
            if (groupName.contains("Java")) {
                System.out.println(groupName);
            }

        }
    }

    //Question 9:
    //In ra tất cả các group "Java"

    private static void Question_9() {

        String[] groupNames = {"Java", "Javacore", " javaaaaaaaaaa", "Ja   va nè"};

        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
                System.out.println(groupName);
            }
        }
    }
    //Question 10 (Optional):
    //Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
    //Nếu có xuất ra “OK” ngược lại “KO”.
    //Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.

    // câu này dùng split chatAt for

    private static void Question_10() {


        Scanner scanner = new Scanner(System.in);
        String str;
        String None = "";
        System.out.print("Mời bạn nhập tên vào :");
        str = scanner.nextLine();
        // bỏ vòng for vào cho nó màu mè tí thoai
        for (int i = 0; i < str.length(); i++) {
            String strMirror = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                strMirror = strMirror + str.charAt(j);
            }
            None = None + strMirror;
            break;
        }
        System.out.println(str);
        System.out.println(None);

    }

    //Question 11 (Optional): Count special Character
    //Tìm số lần xuất hiện ký tự "a" trong chuỗi

    private static void Question_11() {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Nhập dữ liệu đầu vào đi nhá:: ");
        text = scanner.next();
        int dem = 0;
        // có thể làm như này muốn đếm chữ nào thì mình nhập dữ liệu đầu vào cho nó viduj muốn tìm a b c tùy ý >>
        //  char a = scanner.next().charAt(0);
        char a = 'a';
        for (int i = 0; i < text.length(); i++) {


            if (text.charAt(i) == a) {
                dem++;
            }

        }
        System.out.println("Số ký tự " + a + "=" + dem);

    }


    //Question 12 (Optional): Reverse String
    //Đảo ngược chuỗi sử dụng vòng lặp

    private static void Question_12() {
        System.out.println(" Đã làm ở câu trên nào đấy nhưng ko nhớ lắm dùng 2 for lồng nhau rùi á ");
    }

    //Question 13 (Optional): String not contains digit
    //Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
    //lại true.
    //Ví dụ:
    //"abc" => true
    //"1abc", "abc1", "123", "a1bc", null => false


    private static void Question_13() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < str.length(); i++) {
            if (checkKeyNumber(str.charAt(i))) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
    public static boolean checkKeyNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    //Question 14 (Optional): Replace character
    //Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
    //cho trước.
    //Ví dụ:
    //"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"


    private static void Question_14() {
        Scanner scanner = new Scanner(System.in);
        String text1;
        System.out.print("Nhập chuỗi vào cần thay đổi nè ");
        text1 = scanner.nextLine();
        String Replace_character = text1.replace('a', 'b');
        System.out.println("Chuỗi mới là :" + Replace_character);

    }
    //Question 15 (Optional): Revert string by word
    //Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
    //thư viện.
    //Ví dụ: " I am developer " => "developer am I".
    //Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
    //Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
    //chuỗi theo dấu cách


    private static void Question_15() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Nhâp chuỗi : ");
        str = scanner.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s++", " ");
        String[] Mirrors = str.split(" ");
        for (int i = Mirrors.length - 1; i >= 0; i--) {
            System.out.print(Mirrors[i] + " ");
        }
    }
    //Question 16 (Optional):

    //Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
    //bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
    //hình “KO”.

    private static void Question_16() {
        // đây là cách lôm côm
/*        Scanner scanner = new Scanner(System.in);
        String text1;
        System.out.print("Nhập Chuỗi vào nè :");
        text1 = scanner.nextLine();
        int iIndex;
        System.out.print("Nhập số nguyên vào nè:");
        iIndex = scanner.nextInt();
        String idex = Integer.toString(iIndex);

        String str = text1 + idex;
        System.out.println(str);

        if (str.length() % 2 == 0) {
            System.out.println("Chuỗi đã chia đôi đc ");
        } else {
            System.out.println("Chuỗi này lẻ nhé KOOOOOOO");
        }
        return;*/
        Scanner scanner = new Scanner(System.in);
        String text1;
        System.out.print("Nhập Chuỗi vào nè :");
        text1 = scanner.nextLine();
        int iIndex;
        System.out.print("Nhập số nguyên vào nè:");
        iIndex = scanner.nextInt();
        if (iIndex == 0) {

            System.out.print("nhập lại số khác 0 đi ");
            System.out.print("Nhập số nguyên vào nè:");
            iIndex = scanner.nextInt();
            if (text1.length() % iIndex == 0) {
                System.out.println("Chuỗi đã chia đôi đc ");
            } else {
                System.out.println("Chuỗi này lẻ nhé KOOOOOOO");
            }
            return;

        } else {
            if (text1.length() % iIndex == 0) {
                System.out.println("Chuỗi đã chia đôi đc ");
            } else {
                System.out.println("Chuỗi này lẻ nhé KOOOOOOO");
            }
        }
    }

}