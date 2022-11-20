package vn.com.vti.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

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

}
