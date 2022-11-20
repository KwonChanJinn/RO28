package entity;

// tạo 1 cái biến để tự soánh
public class Student implements Comparable<Student> {
    //Tạo 1 student có property id, name (trong đó có 3 student có name
    //trùng nhau, id sẽ là auto increment)
    private int id;
    private String name;


    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
