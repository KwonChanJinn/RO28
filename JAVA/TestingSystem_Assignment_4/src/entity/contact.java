package entity;

public class contact {
    // number, name
    private String number;
    private String name;


    public contact() {
    }

    public contact(String name) {
        this.name = name;
    }

    public contact(String number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "contact{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
