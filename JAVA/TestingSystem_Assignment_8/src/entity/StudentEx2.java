package entity;

import java.time.LocalDate;

public class StudentEx2 implements Comparable<StudentEx2> {
    public static int count = 0;
    private int id;
    private String name;
    private LocalDate birthDay;
    private int score;

    public StudentEx2() {
    }

    public StudentEx2(String name, LocalDate birthDay, int score) {
        super();
        this.id = ++count;
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public int compareTo(StudentEx2 o) {
        if (this.name.compareToIgnoreCase(o.name)>1) {
            return 1;
        } else if (this.name.compareToIgnoreCase(o.name)<1) {
            return -1;
        } else{
            if (this.birthDay.toEpochDay() > o.birthDay.toEpochDay()) {
                return 1;
            } else if (this.birthDay.toEpochDay() < o.birthDay.toEpochDay()) {
                return -1;
            }else {
                if (this.score > o.score) {
                    return 1;
                } else if (this.score < o.score) {
                    return -1;
                }else
                    return 0;
            }
        }

    }

    @Override
    public String toString() {
        return "StudentEx2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", score=" + score +
                '}';
    }
//        int swapsCompare = this.name.compareTo(o.getName());
//        if (swapsCompare == 0) {
//            if (this.score > o.score) {
//                return 1;
//            } else if (this.score < o.score) {
//                return -1;
//            } else {
//                    if (this.birthDay.toEpochDay() > o.birthDay.toEpochDay()) {
//                        return 1;
//                    } else if (this.birthDay.toEpochDay() < o.birthDay.toEpochDay()) {
//                        return -1;
//                    }
//        } else {
//            return swapsCompare;
//        }
//        return 0;
//    }


//    public int compareTo(StudentEx2 o) {
//        return this.name.compareTo(o.getName());
//    }
// // sắp xếp tên
//    @Override
//    public int compareTo(StudentEx2 o) {
//        int flagCompare = this.name.compareTo(o.getName());
//        if (flagCompare == 0) {
//            if (this.score > o.score) {
//                return 1;
//            } else if (this.score < o.score) {
//                return -1;
//            } else {
//                return 0;
//            }
//        } else {
//            return flagCompare;
//
//        }
//    }
// // so sánh 3 thang
//    @Override
//    public int compareTo(StudentEx2 o) {
//        int flagCompare = this.name.compareTo(o.getName());
//        if (flagCompare == 0) {
//            if (this.score > o.score) {
//                return 1;
//            } else if (this.score < o.score) {
//                return -1;
//            } else if (this.score == o.score) {
//                return this.birthDay.compareTo(o.getBirthDay());
//            }
//        } else {
//            return flagCompare;
//        }
//        return 0;
//    }
// // So sánh ngày sinh nhật
//    @Override
//    public int compareTo(StudentEx2 o) {
//        return this.birthDay.compareTo(o.getBirthDay());
}

