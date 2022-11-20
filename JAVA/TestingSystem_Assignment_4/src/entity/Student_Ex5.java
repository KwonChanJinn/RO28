package entity;

public class Student_Ex5 extends Person_Ex5 {
    ////Tạo class abstract Student kế thừa Person gồm các property id, name
    //    //và tạo constructor có 2 parameter id, name
    //    //Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
    //    //name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
    //    //muốn vào) và tạo constructor có 4 parameter id, name, clazz,
    //    //desiredUniversity.
    //    //Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
    //    //"Nam", clazz = "Chuyên Văn", desiredUniversity


    public Student_Ex5(String name, int id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return ("Họ và tên: "+super.getName()+ " ID: "+super.getId());
    }
}
