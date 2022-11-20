package entity;

import static java.lang.Math.PI;

public class Cricle_Ex4 {

    private  double  radius = 1.0 ;
    private  String color = "Red";

    // yc1
    public Cricle_Ex4() {
    }
    //yc2

    public Cricle_Ex4(double radius) {
        this.radius = radius;
    }

    public Cricle_Ex4(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        double area= PI * Math.pow(this.radius,2);
        return area;
    }

    @Override
    public String toString() {
        return "Cricle_Ex4{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

