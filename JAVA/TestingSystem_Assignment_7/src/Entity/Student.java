package Entity;


public class Student {

    private int id;
    private String name;
    public static String college = "Đại Học Bách Khoa Hà Nội ";
    public static int count = 0;
    public static int moneyGroup = 0;


    public Student() {
        super();
        count++;

    }

    public Student(int id, String name) {
        count++;
        this.id = id;
////        String[] name1 = {"A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B",};
        for (int i = 0; i < count; i++) {
            this.name = "Nguyenvan:" + i;
        }
        System.out.println("Tên sinh viên:" + this.name);
        this.name = name;

    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' + " collect:" +
                college +
                '}';
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }
}
