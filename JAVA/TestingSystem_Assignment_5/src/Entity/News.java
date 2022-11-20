package Entity;

import java.util.Scanner;

public class News implements INews {
    //  //Tạo một class News bao gồm thuộc tính:
    //    //ID (int), Title (String), PublishDate (String), Author (String),
    //    //Content (String) và AverageRate (float).
    //    //Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ
    //    //có getter.
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rate;

    public News() {
    }

    public News(String title, String publishDate, String author,
                String content, float averageRate, int[] rate) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        this.rate = rate;
    }

    public News(String title, String publishDate, String author,
                String content, int[] rate) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rate = rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void display() {

        //a) Method Display() sẽ in ra Title, PublishDate, Author,
        //Content và AverageRate của tin tức ra console.
        System.out.println("News [title=" + title + ", publishDate=" +
                publishDate + ", author=" + author + " ,content=" + content + "  ,Average= " + averageRate + "]");
    }


    public void Question1b() {
        System.out.println("");
        calculate();
    }

    public int[] getRate() {
        return rate;
    }

    @Override
    public float calculate() {

        //   //b) Method có tên Calculate() để thiết đặt thuộc tính
        //    //Khai báo một array có tên Rates kiểu int gồm 3 phần tử
        //    //AverageRate là trung bình cộng của 3 phần tử của array
        //    //Rates.

        int Rates[] = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Rates.length; i++) {
            System.out.println("Nhập số thứ " + (i + 1));
            Rates[i] = sc.nextInt();

        }

        int sumaver = 0;
        for (int i = 0; i < Rates.length; i++) {
            sumaver += Rates[i];
        }
        averageRate = sumaver / Rates.length;
        System.out.println("Kết quả trung bình cộng dãyArray là " + averageRate);
        return averageRate;
    }
}
