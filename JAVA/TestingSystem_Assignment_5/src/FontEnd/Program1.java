package FontEnd;

import BackEnd.Excrise2_1;
import Entity.News;

//a) Method Display() sẽ in ra Title, PublishDate, Author,
//Content và AverageRate của tin tức ra console.
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Bài tập 1a ");
        News excrise1a = new News();
        excrise1a.display();
    }

    public static class Excrise1b {
        public static void main(String[] args) {
            System.out.println("Phần mềm đang chạy");
            Excrise1b ex1b = new Excrise1b();
            ex1b.Question1b();
        }

        public void Question1b() {
            Excrise2_1 news = new Excrise2_1();
            news.Excrise2_q1();
        }
        //b) Method có tên Calculate() để thiết đặt thuộc tính
        //Khai báo một array có tên Rates kiểu int gồm 3 phần tử
        //AverageRate là trung bình cộng của 3 phần tử của array
        //Rates.

    }
}
