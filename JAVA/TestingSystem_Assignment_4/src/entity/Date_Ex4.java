package entity;

public class Date_Ex4 {

    private int day;
    private int month;
    private int year;

    public Date_Ex4(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {


        return "Date_Ex4{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
//                " " + "  " + "<< " + isLeapYear() + " >>" + " " +
//                "[" + "T là Nhuận F là Không Nhuận" + "]"
                + '}';
    }

    public boolean isLeapYear() {
        year = this.year;
        boolean isLeap = false;
        String check = "";
        {
            if (year % 4 == 0) // chia hết cho 4 là năm nhuận
            {
                if (year % 100 == 0)// nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì k phải là năm nhuận
                {
                    if (year % 400 == 0) {// chia hết cho 400 là năm nhuận
                        return true;
                    } else {
                        return false;
                    }// không chia hết cho 400 thìkhông phải năm nhuận
                } else {// chia hết cho 4 nhưng không chia hết cho 100 là nămnhuận
                    return true;
                }

            } else {
                return false;
            }
        }


    }

}

