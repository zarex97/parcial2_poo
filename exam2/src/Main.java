import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;


abstract class Shape {

    private String color;

    private boolean filled;

    private double area;

    abstract public double getArea();

    abstract public double getPerimeter();

    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]"
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}

 class Circle extends Shape {
     private double radius;
     public double getRadius() {
         return this.radius;
     }

     public void setRadius(double radius) {
         this.radius=radius;
     }

     public double getArea(){
         return this.radius*(3.1416*3.1416);
     };

     public double getPerimeter() {
         return this.radius*2*(3.1416);
     };

    public String toString() {
        return "Circle[Shape[color=" + this.color + ",filled=" + this.filled + "],radius="+ this.radius+"]"
    }


}


class Rectangle extends Shape{



    private double width;

    private double length;


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return getLength() * getWidth();
    };

    public double getPerimeter() {
        return (getLength()*2) * (getWidth()*2);
    };


    public String toString() {
        return "Rectangle[Shape[color=" + this.color + ",filled=" + this.filled + "],width="+ this.width+",length"+this.length+"]"
    }



}

class Square extends Shape{



    private double width;

    private double length;

    private double side;

   // public double getArea();
    // public double getPerimeter();


    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getWidth() {
        return getSide();
    }

    public double getLength() {
        return getSide();
    }

    public void setLength(double length) {
        this.length = length;
    }



    public String toString() {
        return "Rectangle[Shape[color=" + this.color + ",filled=" + this.filled + "],width="+ this.width+",length"+this.length+"]"
    }



}



    public class Main {
    public static void main(String[] args) {



    }


}