package by.bsuir.alshevski.Task2.runner;

import by.bsuir.alshevski.DataScanner;
import by.bsuir.alshevski.Task2.util.Figure;


public class Runner {
    public static void main(String[] args){
        DataScanner scan = new DataScanner();
        System.out.println("Enter X: ");
        double x = scan.readDouble();
        System.out.println("Enter Y: ");
        double y = scan.readDouble();

        Figure figure = new Figure();

        boolean result = figure.isInArea(x, y);

        System.out.println(result ? "Point IN figure" : "Point OUT of figure");
    }
}
