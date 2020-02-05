package ru.itsjava.FigureParametersCalculator;

public class FigureParametersCalculatorRunner {
    public static void main(String[] args) {
        Figure[] figureArray = createFigureArrayExample();
        printAllDataAboutFigureArray(figureArray);
    }

    public static Figure[] createFigureArrayExample(){
        Figure[] figureArray = new Figure[6];
        figureArray[0] = new Circle(5);
        figureArray[1] = new Circle(10.5);
        figureArray[2] = new Triangle(1, 2, 3);
        figureArray[3] = new Triangle(5.5,7,10.5);
        figureArray[4] = new Rectangle(5.5, 10.5);
        figureArray[5] = new Rectangle(10, 10);
        return figureArray;
    }

    public static void printAllDataAboutFigureArray(Figure[] fa){
        for (int i = 0; i < fa.length; i++){
            System.out.printf("%s: Perimeter = %f; Square = %f",
                    fa[i].toString(), fa[i].calcPerimeter(), fa[i].calcSquare());
            System.out.println("");
        }
    }
}
