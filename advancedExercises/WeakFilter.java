package advancedExercises;

public interface WeakFilter<T> {
    boolean getFilterResult(T item);

    default StrongFilter<T> and(StrongFilter<? super T> i) {
        return (item) -> i.getFilterResult(item) && this.getFilterResult(item);
    }

    default StrongFilter<T> or(StrongFilter<? super T> i) {
        return (item) -> i.getFilterResult(item) || this.getFilterResult(item);
    }
}
