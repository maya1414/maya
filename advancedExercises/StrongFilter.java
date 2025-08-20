package advancedExercises;

public interface StrongFilter<T> {

    boolean getFilterResult(T item);

    default <E extends T> StrongFilter<E> and(StrongFilter<E> i) {
        return (item) -> i.getFilterResult(item) && this.getFilterResult(item);
    }

    default <E extends T> StrongFilter<E> or(StrongFilter<E> i) {
        return (item) -> i.getFilterResult(item) || this.getFilterResult(item);
    }

}
