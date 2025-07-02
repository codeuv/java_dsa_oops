package com.codeuv;

public class Rectangle extends Shapes{
    double length ;
    double breadth;

    public Rectangle() {
        super();
    }

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public Rectangle(String color, double breadth, double length) {
        super(color);
        this.breadth = breadth;
        this.length = length;
    }

    public double area(){
        return this.length * this.breadth;
    }
    public double perimeter(){
        return  (this.length + this.breadth) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", color='" + color + '\'' +
                '}';
    }
}
