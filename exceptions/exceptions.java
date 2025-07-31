package exceptions;

import java.util.Scanner;

public class exceptions {

    static void makeExceptions(){
        RuntimeException runtimeException = new RuntimeException("bla bla");
        IndexOutOfBoundsException indexOutOfBoundsException =  new IndexOutOfBoundsException("bla bla2");
        System.out.println(indexOutOfBoundsException.getStackTrace());
        throw runtimeException;
    }

    static void error(){
        try {
            String array[] = {"a" ,"b", "c"};
            System.out.println(array[10]);
        }
        catch (RuntimeException e){
            System.out.println("an error occurred");
        }
    }

    public static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num ==45) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("caught " + e.getMessage());
            }
        } else if (num == 100) {
            throw new RuntimeException("KABOOM!!");
        }
    }

}