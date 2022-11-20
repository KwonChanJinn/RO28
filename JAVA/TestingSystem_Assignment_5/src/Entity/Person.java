package Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    //Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa
    //chỉ với đầy đủ getter setter, constructor không tham số, constructor đầy
    //đủ tham số


    private String name;

    private Gender gender;
    private LocalDate date;
    private String adress;

    public Person() {
        super();
    }

    public Person(String name, Gender gender, LocalDate date, String adress) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.adress = adress;
    }

    public Person(String names, int flagGender, LocalDate date1, String addres) {

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    //a) Viết phương thức inputInfo(), nhập thông tin Person từ bàn
    //phím
    //b) Viết phương thức showInfo(), hiển thị tất cả thông tin Person

    private Scanner sc;
    private ArrayList<Person> PersonList;

    public void Person() {
        PersonList = new ArrayList<Person>();
        sc = new Scanner(System.in);
    }

    public void Question1() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("chọn 1 thông tin đầu vào ");
            System.out.println("Chọn 2 in thông tin ra màn hình");
            System.out.println("Thoát chương trình ");

            int check = sc.nextInt();

            switch (check) {
                case 1:
                    inputInfo();
                    break;
                case 2:
                    showInfo();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhâp đúng thông tin đầu vào ");
                    break;

            }
        }

    }

    public void inputInfo() {
        sc = new Scanner(System.in);
        System.out.println("Nhập thông tin name : ");
        this.name = sc.next();
        System.out.println("Nhập thông tin giới tính ");
        System.out.println("Gender 1.Male, 2.Female, 3.Unknown: ");
        int flagGender = sc.nextInt();
        switch (flagGender) {
            case 1:
                this.gender = Gender.MALE;
                break;
            case 2:
                this.gender = Gender.FEMALE;
                break;
            case 3:
                this.gender = Gender.UNKNOWNGENDER;
                break;
        }
        System.out.println("Nhập thông tin ngày yyyy-mm-dd");
        this.date = LocalDate.parse(sc.next());
        System.out.println("Nhập thông tin địa chỉ nơi ở ");
        this.adress = sc.next();

    }


    public String showInfo() {
        return "Person{" + "name='" + name + '\'' + ", gender=" + gender + ", date=" + date + ", adress='" + adress + '\'' + '}';
    }
}


