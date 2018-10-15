package by.bsuir.alshevski.Task4.util;

import java.util.ArrayList;

public class SimpleNumberEnumerator {
    public ArrayList<Integer> countSimple(int[] arr){
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++)
            if (NumberMethods.isSimple(arr[i]))
                positions.add(i+1);
        return positions;
    }
}
