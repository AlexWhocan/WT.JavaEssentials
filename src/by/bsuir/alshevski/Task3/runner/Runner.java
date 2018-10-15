package by.bsuir.alshevski.Task3.runner;

import by.bsuir.alshevski.DataScanner;
import by.bsuir.alshevski.Task3.util.MapDataWriter;
import by.bsuir.alshevski.Task3.util.TanFucntionSolver;

import java.util.Map;

public class Runner {
    public static void main(String[] args){
        DataScanner scan = new DataScanner();

        System.out.println("Interval start: ");
        double a = scan.readDouble();
        System.out.println("Interval finish: ");
        double b = scan.readDouble();
        System.out.println("Step is: ");
        double step = scan.readDouble();

        TanFucntionSolver func = new TanFucntionSolver();
        Map<Double, Double> result = func.getValues(a, b, step);
        MapDataWriter writer = new MapDataWriter();
        writer.writeResult(result);

    }


}
