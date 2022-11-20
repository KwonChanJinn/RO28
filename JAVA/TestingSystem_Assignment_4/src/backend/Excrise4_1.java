package backend;

import entity.Student;

public class Excrise4_1 {

    public static void main(String[] args) {

        System.out.println("----------Câu 1c -----------");
        Question_1c();
        System.out.println("----------Câu 1d -----------");
        Question_1d();
        System.out.println("----------Câu 1e -----------");
        Question_1e();
        System.out.println("----------Câu 1f -----------");
        Question_1f();
    }

    public static void Question_1c() {

        Student student = new Student(1,"trần thanh song","bai tap về nhà 1 ",7);
        System.out.println(student);

    }

    public static void Question_1d(){
        Student student1 = new Student(1,"trần thanh song","bai tap về nhà 1 ",5);
        System.out.println(student1);

    }
    public static void Question_1e() {
        Student student = new Student();
        student.setdiemHL(1);
        System.out.println(student);
    }
    public static void Question_1f() {
        Student student = new Student();
        student.SumDiemHL(1);
        System.out.println(student);
    }

}
