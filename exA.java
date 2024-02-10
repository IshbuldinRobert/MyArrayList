package seminars.seminar4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class exA {
    private static List<? extends Number> list;

    public static void main(String[] args) {
        // List<Integer> ints = List.of(1, 2, 3, 4, 5);
        // printCollection(ints);

        init();
    }

    // private static void printCollection(Collection<?> col) {
    //     Iterator<?> iter = col.iterator();
    //     for (int i = 0; i < col.size(); i++) {
    //         System.out.print(iter.next() + " ");
    //     }
    // }

    private static void init() {
        List<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(34);
        list = ints;
        System.out.println(list);
    }
}