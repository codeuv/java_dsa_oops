package com.codeuv;

public class Square extends Shapes{
    double length ;
    Square(){
        super();
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    double area(){
        return this.length * this.length;
    }
    double perimeter(){
        return  this.length * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
