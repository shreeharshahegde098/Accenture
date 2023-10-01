import java.util.*;
import java.util.HashMap;
public class MapDemo{
  public static void main(String[] args)
  {
    Map<Integer,String> m1=new HashMap<Integer,String>();
    System.out.println(m1);
    m1.put(96,"Dinesh");
    m1.put(99,"Ashwin");
   System.out.println(m1);
  
  Map<String,String> m2=new HashMap<String,String>();
  m2.put("first","way");
   m2.put("virat","Kholi");
   System.out.println(m2);
// doesn't maintain the order while displaying output to do this we need to use Linked HashMap.

HashMap<Integer,String> m3= new HashMap<Integer,String>();
 m3.put(null,"MNC");
 m3.put(null,"TCS");
 m3.put(null,"Google");//name key value which is recently updated is taken in to consideration.
System.out.println(m3);
}
}