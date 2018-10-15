package by.bsuir.alshevski.Task3.util;

import java.util.Map;

public class MapDataWriter {
    public void writeResult(Map<Double, Double> values) {
        values.forEach((x, y) -> {
            System.out.println(x + " | " + y);
        });
    }
}
