package string;
public class Stroperation 
{
public static void main(String[] args) 
{
String str="Java String pool refers to collection of strings which are stored in heap memory";
String upper=str.toUpperCase();
System.out.println("Uppercase String:"+upper);
String lower=str.toLowerCase();
System.out.println("Lowercase String:"+lower);
String re=str.replace("a", "$");
System.out.println("String after replacement:"+re);
System.out.println("Contains word 'collection':"+str.contains("collection"));
String str1="Java string pool refers to collection of strings which are stored in heap memory";
boolean value=str1.equals(str);
System.out.println("Both the string matches:"+value);;
boolean newvalue=str1.equalsIgnoreCase(str);
System.out.println("New Match:"+newvalue);
}
}
