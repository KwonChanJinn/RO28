package entity;

public class User {
    private int id;

    private String email;

    private String fullName;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum typeUser {
        Admin, Employee, Manager
    }

    private typeUser typeUser;

    public User() {
    }

    public User(String email, String fullName, String password, User.typeUser typeUser) {
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.typeUser = typeUser;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User.typeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(User.typeUser typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public String toString() {
        return "User{" +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", typeUser=" + typeUser +
                '}';
    }
}
