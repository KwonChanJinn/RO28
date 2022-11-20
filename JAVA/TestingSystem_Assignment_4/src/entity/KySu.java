package entity;

public class KySu extends  CanBo{
    private  String nganhdaotao;

    public KySu(String fullname, int age, Gender gender, String address, String nganhdaotao) {
        super(fullname, age, gender, address);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return( "Họ và tên :"+
                super.getFullname()+" Quê Quán: "+
                super.getAddress()+"  Tuổi: "+
                super.getAge() +"  Giới Tính "+
                super.getGender()+ " "+
                "KySu [" + "nganhdaotao='" + nganhdaotao + '\'' +
                ']');
    }
}
