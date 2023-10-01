import java.util.*;
public class HashTableDemo{
  public static void main(String[] args)
  {
  Hashtable<Integer,String> table=new Hashtable<Integer,String>();
   table.put(10,"layer");
   table.put(15,"Line");
  table.put(20,"Space");
  table.put(25,"Size");
  Enumeration enu=table.elements();
  System.out.println("the enumeration are");
  while(enu.hasMoreElements())
{
  System.out.println(enu.nextElement());
}
}
}