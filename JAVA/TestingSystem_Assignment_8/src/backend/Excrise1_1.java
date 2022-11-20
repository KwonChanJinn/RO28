package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excrise1_1 {
    // khai báo 1 array list


    private Scanner scanner = new Scanner(System.in);
    public List<Student> students = new ArrayList<Student>();

    public Excrise1_1() {
//        for (int i = 0; i <= 4; i++) {
//            students.add(new Student(i, "Song"));
//        }
        Student student = new Student(1,"a");
        Student student1 = new Student(5,"fsf");
        Student student2 = new Student(3,"đf");
        Student student3 = new Student(2,"asff");
        Student student4 = new Student(6,"fsfa");

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    public static void main(String[] args) {
        Excrise1_1 e = new Excrise1_1();
        e.question();
    }

    public void question() {
//        System.out.println("học sinh là : " + students);
//        //a) In ra tổng số phần tử của students
//        System.out.println("tổng số phần tử của students: " + students.size());
//        //b) Lấy phần tử thứ 4 của students
//        System.out.println("học sinh thứ 4 là: " + students.get(4));
//        //c) In ra phần tử đầu và phần tử cuối của students
//        System.out.println("học sinh phần tử đầu  là: " + students.get(1) + "    học sinh phần tử cuối là:" + students.get(students.size() - 1));
//        //d) Thêm 1 phần tử vào vị trí đầu của students
//        students.add(0, new Student(1, "song22222222"));
//        System.out.println("Thêm 1 phần tử vào vị trí đầu của students thành công ");
//        System.out.println("học sinh là : " + students);
//        //e) Thêm 1 phần tử vào vị trí cuối của students
//        System.out.println("Thêm 1 phần tử vào vị trí cuối của students" + students.add(new Student(0, "songngu")));
//        System.out.println("học sinh là : " + students);
        //f) Đảo ngược vị trí của students
//        System.out.println("Thêm 1 phần tử vào vị trí cuối của students");
//        Collections.reverse(students);
//        System.out.println("học sinh là : " + students);
//
//        for (int i = 0; i < (students.size() - 1); i++) {
//            for (int j = i + 1; j < students.size(); j++) {
//                Student temp = students.get(i);
//                students.set(i, students.get(j));
//                students.set(j,temp);
//            }
//        }//
        for (Student std : students) {
            System.out.println(std);
        }
        System.out.println("**********************");
        for (int i = 0; i < (students.size() - 1); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                //iff  so sasnh
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j,temp);
            }
        }

//        for (int i = 0; i < students.size()/2; i++) {
//            Student temp = students.get(i);
//            students.set(i, students.get(students.size()-1-i));
//            students.set(students.size()-1-i , temp);
//        }
        for (Student std : students) {
            System.out.println(std);
        }

//
//        Excrise1_1 excrise1_1 = new Excrise1_1();
//        excrise1_1.searchIdStudent();
//        excrise1_1.searchNameStudent();
//        excrise1_1.searchDuplicateStudent();
//        excrise1_1.deleteNameStudent();
//        excrise1_1.deleteStudent();
//        excrise1_1.addStudentCoppy();
        //i) Tạo 1 method để in ra các student có trùng tên
        //j) Xóa name của student có id = 2;
        //k) Delete student có id = 5;
        //l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
        //studentCopies
    }

    public void searchIdStudent() {
        //g) Tạo 1 method tìm kiếm student theo id
        System.out.println("Nhập thông tin id cần tìm kiếm: ");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }

    //h) Tạo 1 method tìm kiếm student theo name
    public void searchNameStudent() {
        System.out.println("Nhập tên bạn cần tìm kiếm");
        String name = scanner.next();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }

    //i) Tạo 1 method để in ra các student có trùng tên
    public void searchDuplicateStudent() {
        System.out.println("Danh sách học sinh có tên trùng lặp :");
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                // nếu studen1 trùng tên student 2 thì in ra màn hình
                //get ấy phần thử 1 . getname là hàm gọi tên đã nhập
                //equals so sánh với thằng student sau
                if (students.get(i).getName().equals(students.get(j).getName())) ;
                System.out.println("Học sinh trùng tên : ");
                //in danh sách trùng ra convert nó sang sờ tring cũng đc mà ko
                // cần cũng đựược á
                // System.out.println(students.get(i));
                System.out.println(students.get(i).toString());
            }
        }
    }

    public void deleteNameStudent() {
        System.out.println("học sinh là : " + students);
        System.out.println("Nhập id của học sinh để xóa tên nó");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id) {
//                student.remove(student.getName());
                student.setName("");
            }
        }
        System.out.println(students);
    }

    public void deleteStudent() {
        System.out.println("Nhập thông tin id để xóa học sinh ấy");
        int id = scanner.nextInt();
        for (Student student : students) {
            students.removeIf(student1 -> student1.getId() == id);
            break;
        }
        System.out.println("Xóa thành công");
    }

    public void addStudentCoppy() {
        System.out.println("Tạo mới ArrayCopy:");
        // tạo 1 arr mới
        List<Student> arrayCopy = new ArrayList<Student>();
        //addall cho nhanh
        arrayCopy.addAll(students);
        System.out.println("In phần tử trong ArrayCopy: ");
        // in ra như bình thừn thui
        for (Student student : arrayCopy) {
            System.out.println(student);
        }
    }
}
