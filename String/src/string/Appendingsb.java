package string;
public class Appendingsb 
{
public static void main(String[] args) 
{
StringBuilder sb=new StringBuilder("String Buffer");
String s1="is a peer class of string";
String s2="that provides much of";
String s3="the functionality of strings";
sb.append(s1);
sb.append(s2);
sb.append(s3);
System.out.println("After appending using StringBuilder:"+sb);
}
}
