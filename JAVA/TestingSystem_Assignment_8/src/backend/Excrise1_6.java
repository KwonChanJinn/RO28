package backend;

import entity.Student;
import entity.StudentMap;

public class Excrise1_6 {
    public void question(){
        StudentMap<Integer, String> student = new StudentMap<>(1, "Student 1 ");
        System.out.print(student.getKey()+" ");
        System.out.println(student.getValue());

        StudentMap<Integer, Student> studentInfo = new StudentMap<>();
        Student student1 = new Student(1, "KWON CHAN JIN");
        studentInfo.setKey(1);
        studentInfo.setValue(student1);
        System.out.println(studentInfo);
        System.out.println(student.getValue());


    }
}
