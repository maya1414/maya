package generics;

public interface InformationSigna<T> {

    T getTheLatestValue();

    void update(T item);

    T[] asArray();

}
