package generic;
public class Keyvalue 
{
public static void main(String[] args) 
{
Pair<String,String> obj1=new Pair<String,String>("1","Mrunal");
Pair<String,java.util.Date> obj2=new Pair<>("Today is ",new java.util.Date());
System.out.println("Key-Value:"+obj1.show());
System.out.println("Key-Date:"+obj2.show());
}
}
