package basicdatastructure;

import java.util.*;
public class Armstrong
{
public static void main(String[] args)
{
int n,rev=0,num,rem;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
n=sc.nextInt();
num=n;
while(num>0)
{
rem=num%10;
rev=rev+(rem*rem*rem);
num=num/10;
}
if(rev==n)
{
System.out.println("It is an Armstrong number.");
}
else
{
System.out.println("It is not an Armstrong number.");
}
}
}


