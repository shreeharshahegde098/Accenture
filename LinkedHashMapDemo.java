import java.util.*;
public class LinkedHashMapDemo{
     public static void main(String[] args)
  {
    LinkedHashMap<Integer,String> lihash=new LinkedHashMap<Integer,String>();
  lihash.put(10,"Good");
 lihash.put(15,"4");
 lihash.put(20,"Good");
  lihash.put(30,"set");
System.out.println(lihash);
System.out.println(lihash.containsKey(10));

}
}