package backend.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class chưa các hàm hỗ trợ liên quan đến nhập dữ liệu từ bàn phím
 */
public class ScannerUtils {
    private static Scanner sc = new Scanner(System.in);

    public static Integer inputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.print("Dữ liệu bạn nhập vào không phải là số mời nhập lại: ");
            }
        }
    }

    //public static final Pattern REGEX_EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static String inputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.err.print("Dữ liệu ban nhập vào không phải là chuỗi mời nhập lại: ");
            }
        }
    }

    public static LocalDate inputLocalDate() {
        System.out.println("Nhập theo định dạng yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            String localdate = sc.next().trim();
            try {
                if (format.parse(localdate) != null) {
                    return LocalDate.parse(localdate);
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            String email = sc.nextLine();
            String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()) {
                System.err.println("Sai định dạng email, bạn vui lòng nhập lại: ");
            } else {
                return email;
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String password = sc.nextLine();
            String regex = "^.{6,12}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if (!matcher.find()) {
                System.err.println("Sai định dạng password, bạn vui lòng nhập lại: ");
            } else {
                return password;
            }
        }
    }

}
