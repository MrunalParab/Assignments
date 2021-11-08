package basicdatastructure;
import java.util.*;
class Tax
{
public static void main(String args[])
{
double income,tax=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter CTC:Rs.");
income=sc.nextDouble();
if(income<=180000)
{
System.out.println("No Tax");
}
else if(income<=300000)
{
tax=income*0.10;
System.out.println("Tax:Rs."+tax);
}
else if(income<=500000)
{
tax=income*0.20;
System.out.println("Tax:Rs."+tax);
}
else if(income<=1000000)
{
tax=income*0.30;
System.out.println("Tax:Rs."+tax);
}
else
{
System.out.println("Enter valid CTC");
}
}
}

