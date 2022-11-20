package entity;

public class StudentEx3<T>{
    private T id;
    private String name;

    public StudentEx3() {
    }

    public StudentEx3(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEx3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
