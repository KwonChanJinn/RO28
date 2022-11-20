package Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    private Scanner sc;

    private ArrayList<News> newlist;

    public MyNews() {

        sc = new Scanner(System.in);

        newlist = new ArrayList<News>();

    }


    public void Question1c() {
        Menu();
    }


    public void Menu() {

        while (true) {
            System.out.println("===========================Chương trình này hơi lởm========================");
            System.out.println("=================1================Insert news============================");
            System.out.println("=================2==============View list news============================");
            System.out.println("=================3===============Average rate==============================");
            System.out.println("=================4==================Exit===================================");


            int choosemenu = sc.nextInt();

            switch (choosemenu) {
                case 1:
                    Insertnews();
                    break;
                case 2:
                    Viewlistnews();
                    break;
                case 3:
                    Averagerate();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập lại đầu vào");
                    break;
            }
        }

    }

    public void Insertnews() {
        //Nếu người dùng chọn 1 từ bàn phím thì tạo một object của
        //class News và nhập giá trị cho các thuộc tính Title,
        //PublishDate, Author, Content sau đó yêu cầu người dùng
        //nhập vào 3 đánh giá để lưu vào Rates.
        System.out.println("");
        System.out.println("Nhập thì đừng bấm dấu cách nó lỗi đấy chưa biết cách sửa đâu ạ .. dùng NextLine nó nhảy lung tung");
        System.out.println("Nhập ID vào đây nè : ");
        int ID = sc.nextInt();
        System.out.println("Nhập title vào đây nè : ");
        String title = sc.next();
        System.out.println("Nhập PublishDate vào đây nè ");
        String publishDate = sc.next();
        System.out.println("Nhập Author vào chỗ này nè ");
        String author = sc.next();
        System.out.println("Nhâp cái content vào đây nhá ");
        String content = sc.next();
        System.out.println("Nhập đánh giá vào Rate nhá: ");
        int arrrates[] = new int[3];
        for (int i = 0; i < arrrates.length; i++) {
            System.out.println("Nhập số thứ " + (i + 1));
            arrrates[i] = sc.nextInt();
            int sumaver = 0;
            for (int index = 0; index < arrrates.length; index++) {
                sumaver += arrrates[i];
            }

            float averageRate = sumaver / arrrates.length;
            System.out.println("Kết quả trung bình cộng " + averageRate);
        }
        News news = new News(title, publishDate, author, content, arrrates);
        newlist.add(news);

    }


    public void Viewlistnews() {
        ///Nếu người dùng chọn 2 từ bàn phím thì thực thi method
        //    //Display().

        System.out.println("Nhập cái gì cũng được ");

        for (News news : newlist) {
            news.display();
        }

    }

    public void Averagerate() {
        System.out.println("Đánh giá trung bình Rate");
        for (News news1 : newlist) {
            System.out.println("Title: " + news1.getTitle() + " RateAVG: " + news1.calculate());
        }
    }
    //Tạo chương trình demo có tên là MyNews và tạo một menu
    //lựa chọn gồm các mục sau:
    // Insert news
    // View list news
    // Average rate
    //   Exit

}

