import java.util.ArrayList;
import java.util.Scanner;

public class datastructures {
    public static void sortingNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String num = input.next();
        ArrayList arr = new ArrayList();
        while (num != "q"){
            double number = Double.parseDouble(num);
            if (number % 10 == 0){
                arr.add(number);
            }
        }
        System.out.println(arr);
    }
}
