package seminars.seminar4;

public class exB {
    public static void main(String[] args) {
        B<Integer> b = new B<>();

        b.compare(2, 4);
        b.compare(2, 1);
        b.compare(2, 2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

class B<E extends Number & Comparable<E>> {
    private E[] arr;

    

    public <E extends Comparable<E>> void compare(E element1, E element2) {
        int x = element1.compareTo(element2);
        if (x > 0) System.out.println("more");
        else if (x < 0) System.out.println("less");
        else System.out.println("equals");
    }
}
