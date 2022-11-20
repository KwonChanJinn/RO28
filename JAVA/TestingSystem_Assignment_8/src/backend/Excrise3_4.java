package backend;

import java.util.ArrayList;

public class Excrise3_4 {
    public void question4() {

        Integer[] arrInt = {5, 10, 15};
        Float[] arrFloat = {6f, 5f, 15f};
        Double[] arrDouble = {5.2, 2.6, 6.9};

        System.out.println("Danh sách dãy arrInt là :");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);

        }

        System.out.println("Danh sách dãy arrFloat là :");
        for (int i = 0; i < arrFloat.length; i++) {
            System.out.println(arrFloat[i]);
        }

        System.out.println("Danh sách dãy arrDouble là :");
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
        }
    }


    public <T> void question(T[] arr) {
        System.out.println("Danh sách dãy là :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
