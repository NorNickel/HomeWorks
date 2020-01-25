package ru.itsjava.FigureParametersCalculator;

public class Circle extends Figure {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getDescription() {
        return "Circle (radius = " + radius + ")";
    }

}
