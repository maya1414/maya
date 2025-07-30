public class exceptions {

    static void makeExceptions(){
        RuntimeException runtimeException = new RuntimeException("bla bla");
        IndexOutOfBoundsException indexOutOfBoundsException =  new IndexOutOfBoundsException("bla bla2");
        System.out.println(indexOutOfBoundsException.getStackTrace());
        throw runtimeException;
    }

}
