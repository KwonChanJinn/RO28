package backend;

import entity.Student;

import java.util.*;

public class Excrise1_5 {
    private Set<Student> setStudents = new HashSet<>();
    private List<Student> studentlist = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void Excrise1_5() {
        //Tạo 1 student có property id, name
        //Khai báo 1 Set students, sau đó làm các chức năng tương tự List

        Student st1 = new Student();
        st1.setId(1);
        st1.setName("ATrần Thanh Song");
        Student st2 = new Student();
        st2.setId(2);
        st2.setName("CLê Quang Liêm");
        Student st3 = new Student();
        st3.setId(3);
        st3.setName("BLê Văn Hưng");

        setStudents.add(st1);
        setStudents.add(st2);
        setStudents.add(st3);
        setStudents.add(st3);
        setStudents.add(st1);
        setStudents.add(st2);

        studentlist.add(st1);
        studentlist.add(st2);
        studentlist.add(st3);

        for (Student students : setStudents) {
            System.out.println(students);
        }

    }

    public void question4() {
        for (Student students : setStudents) {
            System.out.println(students);
        }
    }

    public void question5() {
        System.out.println("Danh sách sau khi sắp xếp theo A B C");
        Collections.sort(studentlist);
        for (Student studentarr : studentlist) {
            System.out.println(studentarr);
        }
    }

    public static void main(String[] args) {
        Excrise1_5 e = new Excrise1_5();
        e.Excrise1_5();
    }
}
