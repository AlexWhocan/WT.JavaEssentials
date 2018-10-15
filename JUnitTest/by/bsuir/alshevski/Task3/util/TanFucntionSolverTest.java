package by.bsuir.alshevski.Task3.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TanFucntionSolverTest {

    @Test
    public void getValues_0_9_StepIs1() {
        Map<Double, Double> expected = new LinkedHashMap<>();
        expected.put(1.0, 1.5574077246549023);
        expected.put(2.0, -2.185039863261519);
        TanFucntionSolver func = new TanFucntionSolver();

        Assert.assertEquals(expected, func.getValues(1, 2, 1));
    }
}