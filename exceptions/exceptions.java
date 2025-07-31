package exceptions;

import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
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

     static void checkNumbers() {
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

    static void numbersBetweenOneAndThreeOrNothing(int num) throws FileNotFoundException, BindException, AuthenticationException{
        if (num ==1){
            throw new  FileNotFoundException();
        } else if (num == 2){
            throw new BindException();
        } else if (num == 3){
            throw new AuthenticationException();
        }
    }

    static void catchExceptionAndPrintNum(int num){
        try {
            numbersBetweenOneAndThreeOrNothing(num);
        } catch (AuthenticationException e) {
            throw new RuntimeException("3");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("2");
        } catch (BindException e) {
            throw new RuntimeException("1");
        }
    }

}