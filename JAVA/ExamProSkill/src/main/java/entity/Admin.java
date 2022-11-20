package entity;

public class Admin extends  User {
    public Admin() {
    }

    public Admin( String email, String fullName, String password, User.typeUser typeUser) {
        super( email, fullName, password, typeUser);
    }



    @Override
    public String toString() {
        return ( super.toString() +"Admin{}");
    }
}
