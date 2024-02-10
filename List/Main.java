package seminars.seminar4.List;

import seminars.seminar4.List.impl.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        // list.sort();
        // System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
    }
    
}
