package by.bsuir.alshevski.Task1.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculate_Xis2_Yis3() {
        double result = Calculator.calculate(2,3);
        assertEquals(2.4932, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis0_Yis3(){
        double result = Calculator.calculate(0,3);
        assertEquals(0.51, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis2_Yis0(){
        double result = Calculator.calculate(2,0);
        assertEquals(2.457, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis0_Yis0(){
        double result = Calculator.calculate(0,0);
        assertEquals(0.5, result, 0.001);
    }

    @org.junit.Test
    public void calculate_XisMinus300_Yis3(){
        double result = Calculator.calculate(-300,3);
        assertEquals(-299.993, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis2_YisMinus500(){
        double result = Calculator.calculate(2,-500);
        assertEquals(2.499, result, 0.001);
    }

    @org.junit.Test
    public void calculate_XisMax_Yis2(){
        double result = Calculator.calculate(Double.MAX_VALUE,2);
        assertEquals(Double.NaN, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis3_YisMax(){
        double result = Calculator.calculate(3, Double.MAX_VALUE);
        assertEquals(3.2, result, 0.001);
    }

    @org.junit.Test
    public void calculate_XisMin_Yis2(){
        double result = Calculator.calculate(Double.MIN_VALUE,2);
        assertEquals(0.9134, result, 0.001);
    }

    @org.junit.Test
    public void calculate_Xis3_YisMin(){
        double result = Calculator.calculate(3,Double.MIN_VALUE);
        assertEquals(3.2039, result, 0.001);
    }
}