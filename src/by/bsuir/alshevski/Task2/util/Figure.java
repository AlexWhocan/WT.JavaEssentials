package by.bsuir.alshevski.Task2.util;

public class Figure {

    private static final int UPPER_FIGURE_X1 = -4;
    private static final int UPPER_FIGURE_X2 = 4;
    private static final int UPPER_FIGURE_Y1 = 5;
    private static final int UPPER_FIGURE_Y2 = 0;

    private static final int LOWER_FIGURE_X1 = -6;
    private static final int LOWER_FIGURE_X2 = 6;
    private static final int LOWER_FIGURE_Y1 = 0;
    private static final int LOWER_FIGURE_Y2 = -3;

    public  boolean isInArea(double x, double y) {
        return isInUpperPart(x, y) || isInLowerPart(x, y);
    }

    private boolean isInUpperPart(double x, double y) {
        return (x >= UPPER_FIGURE_X1) && (x <= UPPER_FIGURE_X2) && (y <= UPPER_FIGURE_Y1) && (y >= UPPER_FIGURE_Y2);
    }

    private boolean isInLowerPart(double x, double y) {
        return (x >= LOWER_FIGURE_X1) && (x <= LOWER_FIGURE_X2) && (y <= LOWER_FIGURE_Y1) && (y >= LOWER_FIGURE_Y2);
    }
}
