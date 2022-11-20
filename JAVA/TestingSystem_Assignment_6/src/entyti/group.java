package entyti;

import java.time.LocalDate;

public class group {
    public static int COUNT = 0;
    private int id;
    private String name;
    private account creator;
    private LocalDate createDate;
    private account[] accounts;

    public group() {

    }

    public group(int id, String name, account creator, LocalDate createDate, account[] accounts) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public void printInforGroup() {
        System.out.println("Thông tin Group:");
        System.out.println("Group [id=" + id + ", name=" + name + ", createDate = " + createDate + "]");
        if (accounts != null) {
            System.out.println("Số lượng Account trong Group này là: " + accounts.length);

            for (account account : accounts) {
                System.out.println(account.toString());
            }
        } else {
            System.out.println("Chưa có account nào ở đây hết");
        }
    }

    public void abc() {
        System.out.println("Nhập thông tin tạo Group: ");
        COUNT++;
        this.id = COUNT;
        System.out.println("Nhập tên Group: ");
        this.name = ScanerInput.inputString();
        System.out.println("Nhập ngày tạo Group: ");
        this.createDate = ScanerInput.inputLocalDate();
        System.out.println("Bạn có muốn thêm Account vào Group hay không, 1. Có, 2. Không ");

        while (true) {
            int chooseAddAcc = ScanerInput.inputIntPositive();
            switch (chooseAddAcc) {
                case 1:
                    System.out.println("Nhập số lượng account muốn thêm vào Group này:");
                    int arrAcc = ScanerInput.inputIntPositive();
                    account[] accs = new account[arrAcc];
                    for (int i = 0; i < accs.length; i++) {
                        System.out.println("Nhập vào Account thứ " + (i + 1) + ": ");
                        account acc = new account();
                        accs[i] = acc;
                    }
                    this.accounts = accs;
                    return;
                case 2:
                    return;
                default:
                    System.out.println("Nhập lại: ");
                    break;
            }
        }
    }
}


