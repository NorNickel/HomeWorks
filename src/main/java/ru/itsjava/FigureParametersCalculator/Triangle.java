package ru.itsjava.FigureParametersCalculator;

public class Triangle extends Figure{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    Triangle(double sideOne, double sideTwo, double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne(){
        return sideOne;
    }

    public void setSideOne(double sideOne){
        this.sideOne = sideOne;
    }

    public double getSideTwo(){
        return sideTwo;
    }

    public void setSideTwo(double sideTwo){
        this.sideTwo = sideTwo;
    }

    public double getSideThree(){
        return sideThree;
    }

    public void setSideThree(){
        this.sideThree = sideThree;
    }

    @Override
    public double calcPerimeter(){
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double calcSquare() {
        double hp = calcPerimeter() / 2; // half perimeter
        return Math.sqrt(hp * (hp - sideOne) * (hp - sideTwo) * (hp - sideThree));
    }

    @Override
    public String toString() {
        return "Triangle (side lengths = " + sideOne + "; " + sideTwo + "; " +sideThree + ")";
    }
}
