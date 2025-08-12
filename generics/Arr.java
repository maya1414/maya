package generics;

import java.util.ArrayList;

public class Arr {

    public <T> void printItems(ArrayList<T> arr){
        for (T item : arr){
            System.out.println(item);
        }
    }

}
