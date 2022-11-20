package frontend;
import  entyti.deparment;

import java.util.ArrayList;

public class program9 {
    public static void main(String[] args) {

        question9();

    }
    public static void question9 (){

        System.out.println("Nhập thông tin của phòng ban");
        deparment dep1 = new deparment();
        deparment dep2 = new deparment();
        deparment dep3 = new deparment();
        ArrayList<deparment> listDep = new ArrayList<deparment>();
        listDep.add(dep1);
        listDep.add(dep2);
        listDep.add(dep3);
        System.out.println("Thông tin phòng vừa nhập: ");
        for (deparment department : listDep) {
            System.out.println(department);
        }
    }
}
