import java.util.ListIterator;
import java.util.*;
//import java.util.LinkedList;
public class LinkedListd {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(10);
        l1.addFirst(05);
        l1.addLast(21);

        ListIterator<Integer> li =l1.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + "\t");
        }
        Collections.reverse(l1);
    }

}
