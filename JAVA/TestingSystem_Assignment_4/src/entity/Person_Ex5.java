package entity;

public class Person_Ex5 {
    //Tạo class abstract Person gồm các property name và tạo constructor có
    //1 parameter name
    //Tạo class abstract Student kế thừa Person gồm các property id, name
    //và tạo constructor có 2 parameter id, name
    //Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
    //name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
    //muốn vào) và tạo constructor có 4 parameter id, name, clazz,
    //desiredUniversity.
    //Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
    //"Nam", clazz = "Chuyên Văn", desiredUniversity

    private  String name;

    private  int id;
    public Person_Ex5() {
    }

    public Person_Ex5(String name) {
        this.name = name;
    }
    public Person_Ex5(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person_Ex5{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
