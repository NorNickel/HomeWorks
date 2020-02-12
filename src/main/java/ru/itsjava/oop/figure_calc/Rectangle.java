package ru.itsjava.oop.figure_calc;

public class Rectangle extends Figure {
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double calcSquare(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle (length = " + length + "; width = " + width + ")";
    }
}
