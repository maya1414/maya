import java.util.ArrayList;
import java.util.Scanner;

public class datastructures {
    public static void sortingNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String num = input.next();
        ArrayList<Number> arr = new ArrayList<>();
        ArrayList<Number> arr2 = new ArrayList<>();
        while (!num.equals("q")) {
            double number = Double.parseDouble(num);
            if (number % 10 == 0) {
                arr.add(number);
            }
            arr2.add(number);
            num = input.next();
        }
        System.out.print("Enter number to check ");
        Number check = Double.parseDouble(input.next());
        boolean numberWasEntered = false;
        for (Number number : arr2) {
            if (number.equals(check)) {
                numberWasEntered = true;
            }
        }
        System.out.println(numberWasEntered);
        System.out.println(arr);
    }
}
