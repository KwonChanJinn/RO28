package backend;

import entity.Student;

import java.util.*;

public class Excrise1_2 {
    private Deque<Student> students1 = new ArrayDeque<>();
    private Deque<Student> students2 = new LinkedList<>();
    private Stack<Student> students = new Stack<>();
    private Scanner scanner = new Scanner(System.in);

    public Excrise1_2() {
        System.out.println("Thông tin các học sinh tham dự phỏng vấn ");
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Nguyễn Văn Nam");
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Nguyễn Văn Huyên");
        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Trần Văn Nam");
        Student student4 = new Student();
        student4.setId(4);
        student4.setName("Trần Thanh Song");

        students.push(student1);
        students.push(student2);
        students.push(student3);
        students.push(student4);

        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        students2.add(student4);

        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);

        System.out.println("Danh sách sinh viên:" + students1);
    }

    public void question() {
        Excrise1_2 excrise_12 = new Excrise1_2();
        excrise_12.abcStudent();
        excrise_12.zyxStudent();
    }

    public void abcStudent() {
        //a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
        //muộn nhất tới sớm nhất (gợi ý dùng Stack)
        System.out.println("****************************Danh sách sắp xếp từ sớm đến muộn****************************");
        Iterator<Student> iteratorStudent = students.iterator();
        while (iteratorStudent.hasNext()) {
            Student st = iteratorStudent.next();
            System.out.println(st);
        }


        int i = 0;
        System.out.println("****************************Danh sách sắp xếp từ sớm đến muộn****************************");
        do {
            System.out.println(students2.pollFirst());
        }
        while (i < students2.size());
    }

    public void zyxStudent() {

        //Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
        //sớm nhất tới muộn nhất (gợi ý dùng Queue)
        System.out.println("****************************Danh sách sắp xếp từ muộn tới sớm****************************");
        int i = 0;
        do {
            System.out.println(students1.pollLast());
        }
        while (i < students1.size());
    }

}