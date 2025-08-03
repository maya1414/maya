package generics;

import java.util.ArrayList;
import java.util.List;

public class Arr<T> {

    public void printItems(ArrayList<T> arr){
        for (T item : arr){
            System.out.println(item);
        }
    }


}
