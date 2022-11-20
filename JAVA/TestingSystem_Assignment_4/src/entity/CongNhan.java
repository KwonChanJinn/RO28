package entity;

public class CongNhan  extends  CanBo {
    private  int Level ;

    public CongNhan(String fullname, int age, Gender gender, String address, int level) {
        super(fullname, age, gender, address);
       this.Level = Level;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        Level = Level;
    }

    @Override
    public String toString() {
        return( "Họ và tên :"+
                super.getFullname()+" Quê Quán: "+
                super.getAddress()+"  Tuổi: "+
                super.getAge() +"  Giới Tính "+
                super.getGender()+ " "+
                "CongNhan [" + "Level=" + Level + ']');
    }
}
