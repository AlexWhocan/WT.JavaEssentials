package by.bsuir.alshevski.Task3.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class TanFucntionSolver {
    public Map<Double, Double> getValues(double numStart, double numEnd, double step) {
        Map<Double, Double> values = new LinkedHashMap<>();
        do {
            values.put(numStart, Math.tan(numStart));
            numStart = Math.round(numStart + step);
        } while (numStart <= numEnd);
        return values;
    }
}
