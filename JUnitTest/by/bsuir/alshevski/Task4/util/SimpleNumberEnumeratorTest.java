package by.bsuir.alshevski.Task4.util;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SimpleNumberEnumeratorTest {

    @Test
    public void countSimple_3_of_10_on_1st_2nd_5rd() {
        int[] value = {2, 3, 4, 0, 5, 6, 8, 9, 10, 12};
        ArrayList<Integer> result = new SimpleNumberEnumerator().countSimple(value);

        boolean fl = (result.get(0) == 1) && (result.get(1) == 2) && (result.get(2) == 5);

        assertTrue(fl);
    }
}