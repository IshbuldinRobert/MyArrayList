package seminars.seminar4.List.impl;

import java.util.Arrays;
import java.util.Iterator;

import seminars.seminar4.List.ArrayIterator;
import seminars.seminar4.List.MyList;

public class MyArrayList <T> implements MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 2;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    private void addCapacity() {
        T[] newArray = (T[]) new Object[capacity * 2];
        System.arraycopy(this.array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }

    @Override
    public void add(T elem) {
        if (size == capacity) {
            addCapacity();
        }
        array[size] = elem;
        size++;
    }

    @Override
    public T remove(int ind) {
        T temp = get(ind);
        T[] newArray = (T[]) new Object[array.length - 1];
        System.arraycopy(this.array, 0, newArray, 0, ind);
        int amountElementAfterIndex = this.array.length - ind - 1;
        System.arraycopy(this.array, ind + 1, newArray, ind, amountElementAfterIndex);
        this.array = newArray;
        size--;
        return temp;
    }

    @Override
    public T get(int ind) {
        return array[ind];
    }

    @Override
    public int size() {
        return size;
    }

    // @Override
    // public void sort() {
    //     Arrays.sort(array);
    // }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int index = 0;


        while (index != size) {
            sb.append(array[index]).append(", ");
            index++;
        }
        if (sb.length() == 1) return "{}";
        else sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }
}
