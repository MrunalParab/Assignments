package exception;
import java.util.*;
public class ExceptionDividebyzero 
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
catch (ArithmeticException e) 
{
System.out.println("Arithmetic exception occurred");
e.printStackTrace();
}
}
}

