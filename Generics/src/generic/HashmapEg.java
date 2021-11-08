package generic;
import java.util.*;
public class HashmapEg 
{
public static void main(String[] args) 
{
HashMap<Integer,Double> m=new HashMap<>();
m.put(1, 10.0);
m.put(2, 20.0);
m.put(3, 30.0);
m.put(4, 40.0);
m.put(5, 50.0);
m.put(6, 60.0);
m.put(7, 70.0);
m.put(8, 80.0);
m.put(9, 90.0);
m.put(10, 100.0);
System.out.println("Size of stored data:"+m.size());
System.out.println("Data stored in Hashmap:"+m);
}
}
