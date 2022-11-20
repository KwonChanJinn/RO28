package frontend;

import entyti.ScanerInput;

public class program5 {

    public static void main(String[] args) {
        program5 p = new program5();
        p.question5();

    }


    private void question5() {
        System.out.println("Nhập vào tuổi của sinh viên: ");
        int age = ScanerInput.inputIntPositive();
        System.out.println("Tuổi của sinh viên là: " + age);
    }

}
