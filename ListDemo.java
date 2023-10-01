
import java.util.*;
import java.util.List;
import java.util.Iterator;

public class ListDemo {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("Ayan");
    names.add("Shree");
    names.add("neha");
    System.out.println("Name list is:" + names);
    Collections.reverse(names);
    System.out.println(names.contains("Ayan"));
    Collections.sort(names);

    Iterator<String> i = names.iterator();
    while (i.hasNext()) {
      String nm = i.next();
      System.out.println(nm);
      if (nm.equals("Ayan"))
        i.remove();
    }
    System.out.println("Name List is:" + names);
  }
}