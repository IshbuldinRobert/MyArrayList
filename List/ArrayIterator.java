package seminars.seminar4.List;

import java.util.Iterator;

public class ArrayIterator <T> implements Iterator<T> {
    private int ind;
    private T[] arr;

    public ArrayIterator(T[] arr) {
        this.arr =arr;
        this.ind = 0;
    }

    @Override
    public boolean hasNext() {
        return ind < arr.length;
    }

    @Override
    public T next() {
        return arr[ind++];
    }


}
