package backend;

import entity.StudentEx3;

public class Excrise3_1 {

    public void question() {
        StudentEx3<Integer> student1 = new StudentEx3<Integer>(1, "Song");
        StudentEx3<Float> student2 = new StudentEx3<Float>(2.0f, "Song1");
        StudentEx3<Double> student3 = new StudentEx3<Double>(3.2d, "Song2");

        System.out.println(student1);
        System.out.println(student3);
        System.out.println(student2);
    }


    public <T> void question(T id, String name) {
        System.out.print("Id : " + id + " ");
        System.out.print("Name :" + name + " ");
        System.out.println("");
    }


}
