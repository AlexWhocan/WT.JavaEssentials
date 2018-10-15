package by.bsuir.alshevski.Task4.util;

public class NumberMethods {
    public static boolean isSimple(int number){
        if (number <= 0)
            return false;
        if (1 == number)
            return true;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (0 == number % 2)
                return false;
        return true;
    }
}
