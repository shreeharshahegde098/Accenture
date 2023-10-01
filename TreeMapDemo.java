import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args)
    {
     SortedMap<String,String> sm=new TreeMap<String,String>();
      sm.put("Father","Farmer");
      sm.put("Mother","Teacher");
      sm.put("son","Engineer");
     sm.put("Daughter","Docter");
    sm.put("Cousin","Manager");
 System.out.println(sm);
    //jitna key value pair hoga utni bar first key ,last key will be printed.
    for(SortedMap.Entry m:sm.entrySet()) 
   { 
 System.out.println(sm.firstKey()+ " "+sm.lastKey());
   }
}
}