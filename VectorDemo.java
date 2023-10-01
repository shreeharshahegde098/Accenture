import java.util.Vector;
import java.util.*;
 public class VectorDemo{
 public static void main(String[] args)
{
   Vector<String> animals=new Vector<>();
  animals.add("Dog");
  animals.add("cat");
  animals.add("Horse");
    //animals.add("Dog");
  System.out.println("Initial Vector:" +animals);

 String element=animals.get(2);
  System.out.println("get:"+element);

Iterator<String> it=animals.iterator();
System.out.println("Vector:");
while(it.hasNext())
{
System.out.println(it.next());
}
 element=animals.remove(1);
System.out.println("removed element:"+element);

}
}
 
    

