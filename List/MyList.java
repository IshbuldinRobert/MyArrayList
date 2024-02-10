package seminars.seminar4.List;

public interface MyList <T> extends Iterable<T> {
    void add(T elem);
    T remove(int ind);
    T get(int ind);
    int size();
    // void sort();
}
