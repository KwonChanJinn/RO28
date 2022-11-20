package entity;

public class HighSchooStudent extends Student_Ex5 {
    ////    //Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
    //    //    //name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
    //    //    //muốn vào) và tạo constructor có 4 parameter id, name, clazz,
    //    //    //desiredUniversity.
    //    //    //Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
    //    //    //"Nam", clazz = "Chuyên Văn", desiredUniversity

    private String clazz;
    private String desiredUniversity;

    public HighSchooStudent(String name, int id, String clazz, String desiredUniversity) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return (" ID: "+super.getId()+ "Name : "+super.getName() + "{" +
                "clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}');
    }
}
