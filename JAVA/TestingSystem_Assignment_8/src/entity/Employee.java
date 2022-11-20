package entity;

import java.util.Arrays;

public class Employee<T> {
    private int id;
    private String name;
    private T[] salary;

    public Employee() {
    }

    public Employee(int id, String name, T[] salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public T[] getSalary() {
        return salary;
    }

    public void setSalary(T[] salary) {
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("Id :"+ this.getId());
        System.out.println("Name :"+this.getName());
        System.out.println("Salary :"+ this.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + Arrays.toString(salary) +
                '}';
    }
}
