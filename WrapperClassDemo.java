import java.util.*;
public class WrapperClassDemo{
 public static void main(String[] args)
{
   
  Integer i1=new Integer(100);
  Integer i2=new Integer(1000);
  System.out.println(i1+i2);
  //System.out.println(i1.toString());
String str1=i1.toString();
String str2=i2.toString();
System.out.println(str1+str2);

}
}