package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {

    private int id;

    private String email;

    private String userName;

    private String fullName;

    private Department department;

    private Position position;

    private LocalDate createDate;

    private Group[] groups;



    //a) Không có parameters
    public Account() {
    }

    //b) Có các parameter là id, Email, Username, FirstName,
    //LastName (với FullName = FirstName + LastName)

    public Account(int id, String email, String userName, String fullName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
    }




    //c) Có các parameter là id, Email, Username, FirstName,
    //LastName (với FullName = FirstName + LastName) và
    //Position của User, default createDate = now

    public Account(int id, String email, String userName,
                   String fullName, Position position,
                   LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.position = position;
        this.createDate = LocalDate.now();
    }



    //d) Có các parameter là id, Email, Username, FirstName,
    //LastName (với FullName = FirstName + LastName) và
    //Position của User, createDate


    // all in one
    public Account(int id, String email, String userName, String fullName,
                   Department department,
                   Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {


        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department.getDepartmentName() +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }

}
