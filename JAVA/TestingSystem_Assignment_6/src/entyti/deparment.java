package entyti;

public class deparment {
    public static int COUNT;
    private int id;
    private String name;
    public deparment(String name) {
        super();
        COUNT++;
        this.id = COUNT;
        this.name = name;
    }
    public deparment() {
        super();
        COUNT++;
        this.id = COUNT;
        System.out.println("Nhập tên phòng: ");
        this.name = ScanerInput.inputString();
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
