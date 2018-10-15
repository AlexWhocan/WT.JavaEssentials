package by.bsuir.alshevski;


import java.util.Locale;
import java.util.Scanner;

public class DataScanner {

    private static Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    public double readDouble(){
        while (!scan.hasNextDouble())
            scan.next();
        return scan.nextDouble();
    }
}
