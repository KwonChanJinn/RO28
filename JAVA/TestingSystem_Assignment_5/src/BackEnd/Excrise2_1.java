package BackEnd;

import Entity.IStudent;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class Excrise2_1 {
    private Scanner sc;
    private ArrayList<IStudent.Student> StudentList;
    private Random random;

    public Excrise2_1() {
        StudentList = new ArrayList<IStudent.Student>();
        sc = new Scanner(System.in);
        random = new Random();
    }


    public void Excrise2_q1() {
        Main();
    }

    public void Main() {
        //a) Tạo 10 học sinh, chia thành 3 nhóm
        //b) Kêu gọi cả lớp điểm danh.
        //c) Gọi nhóm 1 đi học bài
        //d) Gọi nhóm 2 đi dọn vệ sinh

        while (true) {

            System.out.println("====================PHẦN MỀM CHỐNG GIAN LẬN TRONG HỌC TẬP ==========================");
            System.out.println("====================1   TẠO SINH VIÊN VÀ TẠO NHÓM==========================");
            System.out.println("====================2   IN THÔNG TIN SINH VIÊN RA MÀN HÌNH  ==========================");
            System.out.println("====================3   ĐIỂM DANH CHO SINH VIÊN=========================");
            System.out.println("====================4   GỌI NHÓM I VÀO HỌC   ==========================");
            System.out.println("====================5   GỌI NHÓM I LAO ĐỘNG ==========================");
            System.out.println("====================6    THOÁT CHƯƠNG TRÌNH  ==========================");


            int check = sc.nextInt();
            switch (check) {
                case 1:
                    them();
                    break;
                case 2:
                    hienthisv();
                    break;
                case 3:
                    taogroup();
                    break;
                case 4:
                    hocBai();
                    break;
                case 5:
                    laodong();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Chọn sai đầu vào nên chọn lại ");
                    break;

            }
        }
    }


    public void them() {
        System.out.println("Nhập số lượng sinh viên cân thêm vào");
        int slsv = sc.nextInt();

        for (int i = 0; i < slsv; i++) {
            IStudent.Student st = new IStudent.Student("\" Lê Quang C \"" + (i + 1), random.nextInt(3) + 1);
            StudentList.add(st);
        }
        System.out.println("TẠO THÀNH CÔNG`");

    }

    public void taogroup() {
        //Kêu gọi cả lớp điểm danh.
        System.out.println("Cả lớp điểm danh: ");
        for (IStudent.Student student : StudentList) {
            student.diemDanh();
        }

    }

    public void laodong() {
        System.out.println("Thay vì gọi cứng là nhóm 2 thì mình có thể màu mè 1 xíu");
        System.out.println("đó là mình  sẽ tự nhập tay chọn nhóm tùy thích hoặc có thể random luôn tùy thích ai đ");

        System.out.println("Nhập nhóm cần đi lao động");
        int index = sc.nextInt();
        System.out.println("Nhóm n đi lao động");
        for (IStudent.Student student : StudentList) {
            // if (student.getGroup() == random.nextInt(4)) {
            if (student.getGroup() == index) {
                System.out.println(student + "");
            }
            else {
                System.out.println("Nhóm này ko có Sinh viên");
                break;
            }
        }
    }


    public void hienthisv() {
        for (IStudent.Student st : StudentList) {
            System.out.println(st);
        }
    }

    public void  hocBai(){

        System.out.println("Làm tương tự câu tìm thằng đi lao đọng");
        System.out.println("Nhập nhóm cần đi học bài ");
        int index = sc.nextInt();
        //tạo student rồi tạo mới add list
        for(IStudent.Student student : StudentList){
            if(student.getGroup()== index){
                System.out.println(student + "");
            }
            else {
                System.out.println("Nhóm này ko có Sinh viên");
                break;
            }
        }
    }

}
