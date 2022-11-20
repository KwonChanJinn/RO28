package frontend;

public class Program3_6 {
    public static void main(String[] args) {

        String str1 = "AStrings are immutable";
        String str2 = "BStrings are immutable";
        String str3 = "CIntegers are not immutable";
        String str4 = "DIntegers are not immutable";

        int result = str1.compareToIgnoreCase(str1);
        System.out.println(result + " s2");

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result + "  s3");

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result + " s1");

        result = str4.compareToIgnoreCase(str3 );
        System.out.println(result + " s4");
    }
}
