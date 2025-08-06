package generics;

import java.util.ArrayList;

public class Arr {

    public void printItems(ArrayList arr){
        for (Object item : arr){
            System.out.println(item);
        }
    }

}
