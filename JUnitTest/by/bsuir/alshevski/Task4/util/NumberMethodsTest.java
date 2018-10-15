package by.bsuir.alshevski.Task4.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberMethodsTest {

    @Test
    public void isSimple_3_True() {
        int value = 3;

        assertTrue(NumberMethods.isSimple(value));
    }

    @Test
    public void isSimple_4_False() {
        int value = 4;

        assertFalse(NumberMethods.isSimple(value));
    }
}