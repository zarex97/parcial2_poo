
import java.util.ArrayList;


abstract class Shape {

    private String color;

    private boolean filled;

    private double area;

    abstract public double getArea();

    abstract public double getPerimeter();

    public abstract double getRadius();

    public String toString() {
        return "Shape[color=" + getColor() + ",filled=" + isFilled()+ "]";
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

    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public Shape(){
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
        return "Circle[Shape[color=" + getColor() + ",filled=" + isFilled() + "],radius="+ getRadius()+"]";
    }

     public Circle() {
     }
    public Circle(double radius, String color, boolean filled) {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

     public Circle(double radius){
         setRadius(radius);
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
        return (getLength()*2) + (getWidth()*2);
    }

    

    public String toString() {
        return "Rectangle[Shape[color=" + getColor()  + ",filled=" + isFilled() + "],width="+ getWidth()+",length"+getLength()+"]";
    }
    public Rectangle () {};

    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

}

class Square extends Rectangle {



    private double width;

    private double length;

    private double side;

   // public Square(String color, boolean filled) {
     //   super(color, filled);
    //}

    //public Square(double side, double length, String color, boolean filled) {
      //  super(side, length, color, filled);
    //}

    //public Square(double side) {
      //  super(side);
    //}


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




    public String toString() {
        return "Square[Rectangle[Shape[color=" + getColor()  + ",filled=" + isFilled() + "],width="+ getWidth()+",length"+getLength()+"]]";
    }

    public Square () {};

    public Square(double side, String color, boolean filled){
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public Square(double side){
        setSide(side);
    }

}



    public class Main {
    public static void main(String[] args) {

        Square unCuadrado = new Square(7.0, "red", true );
        System.out.println(unCuadrado.getArea());
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1.getRadius());
        //Shape s2 = new Shape();
        //s2.setColor("blue");
        //s2.setFilled(false);
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3.getPerimeter());
        Shape s4 = new Square(6.6);

    }


}