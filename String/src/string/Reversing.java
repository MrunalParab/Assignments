package string;
public class Reversing 
{
public static void main(String[] args) 
{
StringBuffer sbf=new StringBuffer("This method returns the reversed object on which it was called");
System.out.println("Original String:"+sbf);
sbf.reverse();
System.out.println("Reversed String:"+sbf);
}
}
