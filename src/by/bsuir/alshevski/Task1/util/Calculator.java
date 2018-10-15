package by.bsuir.alshevski.Task1.util;

public class Calculator {
    static public double calculate(double x, double y){
        return solveNumerator(x, y) / solveDenumerator(x, y) + x;
    }

    static private double solveNumerator(double x, double y){
        return 1 + Math.pow(Math.sin(x + y),2);
    }

    static private double solveDenumerator(double x, double y){
        return 2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)));
    }
}
