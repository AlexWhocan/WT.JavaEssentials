package by.bsuir.alshevski.Task2.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void isInArea_Xis0_Yis0_True() {
        Figure figure = new Figure();
        assertTrue(figure.isInArea(0,0));
    }

    @Test
    public void isInArea_Xis6_Yis1_False() {
        Figure figure = new Figure();
        assertFalse(figure.isInArea(6,1));
    }

    @Test
    public void isInArea_XisNeg3_Yis0_True() {
        Figure figure = new Figure();
        assertTrue(figure.isInArea(-3,0));
    }

    @Test
    public void isInArea_Xis0_YisNeg3_True() {
        Figure figure = new Figure();
        assertTrue(figure.isInArea(0,-3));
    }

    @Test
    public void isInArea_Xis0_Yis5d5_False() {
        Figure figure = new Figure();
        assertFalse(figure.isInArea(0,5.5));
    }
}