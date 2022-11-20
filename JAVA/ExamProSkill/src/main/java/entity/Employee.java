package entity;

public class Employee extends  User {
    private int  projectId;
    private String proSkill;

    public Employee(int projectId, String proSkill) {
        this.projectId = projectId;
        this.proSkill = proSkill;
    }

    public Employee( String email, String fullName, String password, User.typeUser typeUser, int projectId, String proSkill) {
        super( email, fullName, password, typeUser);
        this.projectId = projectId;
        this.proSkill = proSkill;
    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return (super.toString()+ "Employee{" +
                "projectId=" + projectId +
                ", proSkill='" + proSkill + '\'' +
                '}');
    }
}
