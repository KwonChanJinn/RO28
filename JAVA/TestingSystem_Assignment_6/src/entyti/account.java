package entyti;

public class account {
    public static int COUNT = 0;
    private int id;
    private String email;
    private String userName;
    private String fullName;

    public account() {
        super();
        COUNT++;
        this.id = COUNT;
        System.out.println("Nhập thông tin tên của bạn vào ");
        this.userName = ScanerInput.inputString();
        System.out.println("Nhập thông tin họ và tên của bạn vào ");
        this.fullName = ScanerInput.inputString();
        System.out.println("Nhập thông tin Gmail của bạn vào ");
        this.email = ScanerInput.inputString();

    }

    public account(String email, String userName, String fullName) {
        super();
        COUNT++;
        this.id = COUNT;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
