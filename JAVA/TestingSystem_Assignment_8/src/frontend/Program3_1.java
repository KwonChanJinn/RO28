package frontend;

import backend.Excrise3_1;
import entity.StudentEx3;

import java.util.Scanner;

public class Program3_1 {
    public static void main(String[] args) {
        System.out.println("***********************Câu 1-2*******************");
        Excrise3_1 excrise3_1 = new Excrise3_1();
        excrise3_1.question();

        System.out.println("***********************Câu 1-2*******************");
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        float b= 2.0f;
        double c =3d;
        excrise3_1.question(b,"Song");

    }
}
