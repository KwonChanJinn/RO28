package frontend;

import entyti.ScanerInput;

public class program7 {
    public static void main(String[] args) {
        program7 p = new program7();
        p.question7();
    }

    public void question7() {
        System.out.println("Nhập vào tuổi của sinh viên: ");
        int age = ScanerInput.inputInt();
        System.out.println("Tuổi của sinh viên là: " + age);
    }
}

