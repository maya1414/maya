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






}
