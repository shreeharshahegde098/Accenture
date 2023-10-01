import java.util.*;
public class PriorityDemo{
  public static void main(String[] args)
{
  Queue<String> pq=new PriorityQueue<>();
  pq.add("java");
  pq.add("react");
  pq.add("HTML");
  pq.add("Angular");

System.out.println(pq);
pq.remove("Angular");
System.out.println("After remove"+pq);
System.out.println("Poll Method"+pq.poll());//print and remove the top element.
System.out.println("Final Queue"+pq);

Iterator<String> iterator=pq.iterator();
while(iterator.hasNext())
{
System.out.println(iterator.next()+ " ");
}
}
}

