package basicdatastructure;
import java.util.*;
public class Interest 
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the principal:Rs.");
double principal = input.nextDouble();
System.out.print("Enter the rate: ");
double rate = input.nextDouble();
System.out.print("Enter the period: ");
double period = input.nextDouble();
double simpleinterest = (principal * period * rate) / 100;
double compoundinterest=principal * Math.pow(1.0+rate/100.0,period) - principal;
System.out.println(" ");
System.out.println("Principal:Rs. " + principal);
System.out.println("Interest Rate: " + rate +" p.a");
System.out.println("Time Duration: " + period +" yrs");
System.out.println(" ");
System.out.println("Simple Interest:Rs." + simpleinterest);
System.out.println("Simple Interest:Rs." + compoundinterest);
}
}
