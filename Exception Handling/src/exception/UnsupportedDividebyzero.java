package exception;
import java.util.*;
public class UnsupportedDividebyzero 
{
public static void main(String args[])
{
try 
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter number 1:");
int dividend=sc.nextInt();
System.out.println("Enter number 2:");
int divisor=sc.nextInt();
int result=dividend/divisor;
System.out.println("Result:"+result);
} 
catch (UnsupportedOperationException e) 
{
System.out.println("Unsupported exception occurred");
e.printStackTrace();
}
}
}



