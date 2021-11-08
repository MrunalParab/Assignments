package string;
public class Appending 
{
public static void main(String[] args) 
{
StringBuffer sbf1=new StringBuffer("StringBuffer");
System.out.println("String Buffer 1:"+sbf1);

StringBuffer sbf2=new StringBuffer("is a peer class of String");
System.out.println("String Buffer 2:"+sbf2);

StringBuffer sbf3=new StringBuffer("that provides much of");
System.out.println("String Buffer 3:"+sbf3);

StringBuffer sbf4=new StringBuffer("the functionality of strings");
System.out.println("String Buffer 2:"+sbf4);

sbf1.append(sbf2);
sbf1.append(sbf3);
sbf1.append(sbf4);
System.out.println(" ");
System.out.println("After appending:"+sbf1);
}
}
