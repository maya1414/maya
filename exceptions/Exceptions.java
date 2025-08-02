package exceptions;

import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.Scanner;

public class Exceptions {

    public static void makeExceptions() {
        RuntimeException runtimeException = new RuntimeException("bla bla");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("bla bla2");
        System.out.println(indexOutOfBoundsException.getStackTrace());
        throw runtimeException;
    }

    public static void error() {
        try {
            String array[] = {"a", "b", "c"};
            System.out.println(array[10]);
        } catch (RuntimeException e) {
            System.out.println("an error occurred");
        }
    }

    public static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 100){
          if (num == 45) {
               try {
                   throw new IllegalArgumentException();
               } catch (IllegalArgumentException e) {
                  System.out.println("caught " + e);
              }
          }
          num = scanner.nextInt();
        }
        throw new RuntimeException("KABOOM!!");
    }

    public static void numbersBetweenOneAndThreeOrNothing(int num) throws FileNotFoundException, BindException, AuthenticationException {
        if (num == 1) {
            throw new FileNotFoundException();
        } else if (num == 2) {
            throw new BindException();
        } else if (num == 3) {
            throw new AuthenticationException();
        }
    }

    public static void catchExceptionAndPrintNum(int num) {
        try {
            numbersBetweenOneAndThreeOrNothing(num);
        } catch (FileNotFoundException e) {
            System.out.println(1);
        } catch (BindException e) {
            System.out.println(2);
        } catch (AuthenticationException e) {
            System.out.println(3);
        }
    }

    public static void catchExceptionAndPrintNum2(int num) throws FileNotFoundException, AuthenticationException, BindException {
        try {
            numbersBetweenOneAndThreeOrNothing(num);
            throw new RuntimeException();
        } catch (FileNotFoundException e) {
            System.out.println(1);
            throw e;
        } catch (BindException e) {
            System.out.println(2);
            throw e;
        } catch (AuthenticationException e) {
            System.out.println(3);
            throw e;
        } finally {
            System.out.println("here");
        }
    }

}