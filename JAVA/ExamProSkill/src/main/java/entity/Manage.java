package entity;

public class Manage extends User {
    private int  ExpInYear;
    private int  projectId;

    public Manage(int expInYear, int projectId) {
        ExpInYear = expInYear;
        this.projectId = projectId;
    }

    public Manage( String email, String fullName, String password, User.typeUser typeUser, int expInYear, int projectId) {
        super( email, fullName, password, typeUser);
        ExpInYear = expInYear;
        this.projectId = projectId;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return (super.toString()+"Manage{" +
                "ExpInYear=" + ExpInYear +
                ", projectId=" + projectId +
                '}');
    }
}
