 import java.util.*;
public class Que{
 public static void main(String[] args)
{
  Queue<Integer> queue = new LinkedList<>(); 
   for(int i=0;i<5;i++)
   {
      queue.add(i);
 }

  System.out.println("Elemnets in the queue" +queue);
// Removing head element 
   int remove=queue.remove();
  System.out.println("remove element "+remove);
     System.out.println("Elemnets in the queue " +queue);

     int head=queue.peek();
       System.out.println("head elemnets in the queue " +head);

  int size=queue.size();
     System.out.println("Size of the queue " +size);
   
}
} 
    

