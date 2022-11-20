package backend;

import entity.Employee;

import java.util.Scanner;

public class Excrise3_5 {


    private Scanner scanner = new Scanner(System.in);

    //a) Hãy tạo chương trình demo với Employee có salaries là
    //datatype int
    public void intEmployee() {
        System.out.println("Xin mời nhập số Employee cần thêm vào :");
        int indexEmploye = scanner.nextInt();
        Integer[] salaryEmployee = new Integer[indexEmploye];
        for (int i = 0; i < indexEmploye; i++) {
            salaryEmployee[i] = i + 1000;
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            System.out.println(salaryEmployee[i]);
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            Employee<Integer> employee = new Employee<Integer>(i, "Song" + i, salaryEmployee);
        }
        System.out.println("Tạo thành công Employee");

        System.out.println("Nhập thông tin employ caand in lương");
        int intCheck = scanner.nextInt();

        System.out.println(salaryEmployee);

        System.out.println("Tháng lương cuối cùng của employee : " + intCheck +"là :::"+ salaryEmployee[salaryEmployee.length - 1]);

//        Integer[] salaryEmployee = {100000 ,144000, 120000};
//        Employee<Integer> employee= new Employee<Integer>(1, "Song", salaryEmployee);
//        System.out.println("Employee vừa khởi tạo: ");
//
//        System.out.println(employee);
//        System.out.println("Tháng lương cuối cùng của employee : " + salaryEmployee[salaryEmployee.length - 1]);
    }

    //b) Hãy tạo chương trình demo với Employee có salaries là
    //datatype float
    public void floatEmploye() {
        System.out.println("Xin mời nhập số Employee cần thêm vào :");
        int indexEmploye = scanner.nextInt();
        Float[] salaryEmployee = new Float[indexEmploye];
        for (int i = 0; i < indexEmploye; i++) {
            salaryEmployee[i] = i + 1000f;
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            System.out.println(salaryEmployee[i]);
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            Employee<Float> employee = new Employee<Float>(i, "Song" + i, salaryEmployee);
        }
        System.out.println("Tạo thành công Employee");
        System.out.println("Nhập thông tin employ caand in lương");
        int intCheck = scanner.nextInt();
        System.out.println(salaryEmployee[intCheck]);
        System.out.println("Tháng lương cuối cùng của employee : " + intCheck +"là :::"+  salaryEmployee[salaryEmployee.length - 1]);
    }

    //c) Hãy tạo chương trình demo với Employee có salaries là
    //datatype double
    public void doubleEmploye() {
        System.out.println("Xin mời nhập số Employee cần thêm vào :");
        int indexEmploye = scanner.nextInt();
        Double[] salaryEmployee = new Double[indexEmploye];
        for (int i = 0; i < indexEmploye; i++) {
            salaryEmployee[i] = i + 1000d;
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            System.out.println(salaryEmployee[i]);
        }
        for (int i = 0; i < salaryEmployee.length; i++) {
            Employee<Double> employee = new Employee<Double>(i, "Song" + i, salaryEmployee);
        }
        System.out.println("Tạo thành công Employee");

        System.out.println("Nhập thông tin employ caand in lương");
        int intCheck = scanner.nextInt();
        System.out.println(salaryEmployee);
        System.out.println("Tháng lương cuối cùng của employee : " + intCheck +"là :::"+  salaryEmployee[salaryEmployee.length - 1]);
    }

}
