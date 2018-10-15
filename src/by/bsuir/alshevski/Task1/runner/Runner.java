package by.bsuir.alshevski.Task1.runner;

import by.bsuir.alshevski.DataScanner;
import by.bsuir.alshevski.Task1.util.Calculator;

public class Runner {
    public static void main(String[] args){
        DataScanner scan = new DataScanner();
        System.out.println("Enter X: ");
        double x = scan.readDouble();
        System.out.println("Enter Y: ");
        double y = scan.readDouble();
        Calculator calc = new Calculator();
        System.out.println("Result = " + calc.calculate(x, y));
    }
}
